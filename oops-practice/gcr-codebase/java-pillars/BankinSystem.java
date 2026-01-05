interface Loanable{
	public void applyForLoan();
	public double calculateLoanEligibility();
}

abstract class BankAccount{
	private int accountNumber;
	private String holderName;
	protected double balance;
	public BankAccount(int accountNumber,String holderName,double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			balance -= amount;
		}
	}
	
	public abstract double calculateInterest();
	
	public void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
	
}

class SavingsAccount extends BankAccount implements Loanable{
	public SavingsAccount(int accountNumber,String holderName,double balance) {
		super(accountNumber,holderName,balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance*0.04;
	}
	
	@Override
	public void applyForLoan() {
		System.out.println("Loan applied for Savings Account");
	}
	
	@Override
	public double calculateLoanEligibility() {
		return balance*5;
	}
}

class CurrentAccount extends BankAccount implements Loanable{
	public CurrentAccount(int accountNumber,String holderName,double balance) {
		super(accountNumber,holderName,balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance*0.02;
	}
	
	@Override
	public void applyForLoan() {
		System.out.println("Loan applied for Current Account");
	}
	
	@Override
	public double calculateLoanEligibility() {
		return balance*10;
	}
}

public class BankinSystem {

	public static void main(String[] args) {
		
		BankAccount account1 = new SavingsAccount(45687,"Harsh",500000);
		BankAccount account2 = new CurrentAccount(94196,"Ankit",200000);
		
		account1.displayDetails();
		account1.calculateInterest();
		if (account1 instanceof Loanable) {
            Loanable loan = (Loanable) account1;
            loan.applyForLoan();
            System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
        }
        System.out.println("--------------------------------");
		
		
		account2.displayDetails();
		account2.calculateInterest();
		if (account2 instanceof Loanable) {
            Loanable loan = (Loanable) account1;
            loan.applyForLoan();
            System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
        }
        System.out.println("--------------------------------");

	}

}
