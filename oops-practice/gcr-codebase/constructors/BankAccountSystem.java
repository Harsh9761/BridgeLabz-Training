class Bank{
	public String accountHolder;
	protected int accountNumber;
	private double balance;
	
	public Bank(String accountHolder,int accountNumber,double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//getter
	public double getBalance() {
		return balance;
	}
	
	//setter
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends Bank{
	double interestRate;
	public SavingsAccount(String accountHolder,int accountNumber,double balance,double interestRate) {
		super(accountHolder,accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	public void DisplayDetails() {
		System.out.println("Account Number: " + accountNumber);     // public
        System.out.println("Account Holder: " + accountHolder);     // protected
        System.out.println("Balance: " + getBalance());             // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
	}
}

public class BankAccountSystem {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("Harshdeep Singh",111222333, 50000, 4.5);
		account.DisplayDetails();
		
		account.setBalance(55000);
        System.out.println("Updated Balance: " + account.getBalance());

	}

}
