package BankTransactionSystem;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

	}

}
