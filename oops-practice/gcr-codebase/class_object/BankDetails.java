import java.util.*;
class Bank{
	String accountHolder;
	int accountNumber;
	double balance;
	
	//constructor
	public Bank(String accountHolder,int accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void DepositMoney(double amount) {
	     balance += amount;
	     System.out.println("Amount deposited: "+amount);
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance..");
		}
		else {
			balance -= amount;
			System.out.println("Amount Withdrawn: "+amount);
		}
	}
	
	public void DisplayBalance() {
		System.out.println("Account Balance");
		System.out.println("Current Balance: "+balance);
	}
	
	
}
public class BankDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank details");
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter accountNumber: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		
		Bank user = new Bank(name,accountNumber,balance);
		
		user.DepositMoney(1000);
		user.withdraw(500);
		user.DisplayBalance();

	}

}
