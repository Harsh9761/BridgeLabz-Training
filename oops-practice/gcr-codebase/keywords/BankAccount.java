class Bank{
	static String bankName = "ICICI Bank";
	static int totalAccounts = 0;
	
	String accountHolderName;
	final int accountNumber;
	private double balance;
	
	
	public Bank(String accountHolderName,int accountNumber,double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void getTotalAccounts() {
		System.out.println("Total Accounts: "+totalAccounts);
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid Amount!!");
		}
	}
	
	public void withDraw(double amount) {
		if(amount > 0 && balance >= amount) {
			System.out.println("Amount withdrawn successfully: "+amount);
			balance -= amount;
			System.out.println("Left Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!!");
		}
	}
	
	public void displayAccount() {
		if(this instanceof Bank) {
			System.out.println("Bank Name: " + bankName);
			System.out.println("Account Holder: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Balance: " + balance);
		}
		else {
			System.out.println("Invalid account Instance");
		}
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
		
		Bank acc1 = new Bank("Harshdeep", 101, 5000);
		Bank acc2 = new Bank("Aman", 102, 3000);

		acc1.deposit(2000);
		acc1.withDraw(1500);

		acc2.withDraw(4000);

		acc1.displayAccount();
		acc2.displayAccount();

		Bank.getTotalAccounts();
		
		

	}

}
