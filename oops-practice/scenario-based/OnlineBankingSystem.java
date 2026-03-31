interface BankService{
	public void deposit(Account account,double amount);
	public void withdraw(Account account,double amount);
	public void accountTransfer(Account from,Account to,double amount);
}

abstract class Account{
	protected int accountNumber;
	protected double balance;
	public Account(int accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public synchronized double getBalance() {
		return balance;
	}
	public abstract double calculateInterest();
}

class SavingsAccount extends Account{
	public SavingsAccount(int accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance*0.15;
	}
}

class CurrentAccount extends Account{
	public CurrentAccount(int accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	@Override
	public double calculateInterest() {
		return 0;
	}
}

//Exception class
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankTransactions implements BankService{
	
	@Override
	public synchronized void deposit(Account account,double amount) {
		synchronized (account) {
			if(amount > 0) {
				account.balance += amount;
			}
		}
	}
	
	@Override
	public synchronized void withdraw(Account account,double amount) {
		synchronized (account) {
			if(account.balance < amount) {
				throw new InsufficientBalanceException("Insufficient Balance");
			
			}
			account.balance -= amount;
		}
	}
	
	@Override
	public void accountTransfer(Account from,Account to,double amount) {
		synchronized (from) {
            synchronized(to) {
            	withdraw(from, amount);
                deposit(to, amount);
            }
        }
	}
}

public class OnlineBankingSystem {

	public static void main(String[] args) throws InterruptedException {
		BankService bank = new BankTransactions();
		
		Account account1 = new SavingsAccount(55522,5000);
		Account account2 = new SavingsAccount(66633,7000);
		
		Thread t1 = new Thread(() -> bank.accountTransfer(account1, account2, 2500));
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(() -> bank.accountTransfer(account2, account1, 500));
		t2.start();
		t2.join();
		
		
		System.out.println("Account 1 balance is "+account1.getBalance());
		System.out.println("Account 2 balance is "+account2.getBalance());
		System.out.println();
		
		bank.deposit(account1, 5000);
		System.out.println("Account 1 balance is "+account1.getBalance());
		
		bank.withdraw(account2, 670);
		System.out.println("Account 2 balance is "+account2.getBalance());
		
	}

}
