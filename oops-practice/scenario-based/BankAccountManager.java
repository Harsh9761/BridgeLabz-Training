import java.util.*;
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
	
	public void checkBalance() {
		System.out.println("Balance is: "+balance);
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
public class BankAccountManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Details: ");
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter accountNumber: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		Bank user = new Bank(name,accountNumber,balance);
		user.checkBalance();
		user.deposit(5000);
		user.withDraw(2000);
        user.checkBalance();

	}

}
