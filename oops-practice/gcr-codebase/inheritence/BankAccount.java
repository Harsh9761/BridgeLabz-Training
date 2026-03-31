class Bank{
	int accountNumber;
	double balance;
	public Bank(int accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends Bank{
	double interestRate;
	public SavingsAccount(int accountNumber,double balance,double interestRate) {
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	@Override
    public void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
	
}

class CheckingAccount extends Bank{
	double debitLimit;
	public CheckingAccount(int accountNumber,double balance,double debitLimit) {
		super(accountNumber,balance);
		this.debitLimit = debitLimit;
	}
	
	@Override
    public void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("DEebit Limit: " + debitLimit);
    }
}

class FixeddepositAccount extends Bank{
	int tenureYears;
	public FixeddepositAccount(int accountNumber,double balance,int tenureYears) {
		super(accountNumber,balance);
		this.tenureYears = tenureYears;
		
	}
	
	@Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Tenure: " + tenureYears + " years");
    }
}

public class BankAccount {

	public static void main(String[] args) {
		
		Bank account1 = new SavingsAccount(101, 50000, 4.5);
        Bank account2 = new CheckingAccount(102, 30000, 10000);
        Bank account3 = new FixeddepositAccount(103, 100000, 5);

        account1.displayAccountType();
        System.out.println();

        account2.displayAccountType();
        System.out.println();

        account3.displayAccountType();

	}

}
