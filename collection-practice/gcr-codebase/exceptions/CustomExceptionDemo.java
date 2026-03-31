import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			validateAge(age);
		}catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
			

	}
	
	public static void validateAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age must be more the 18");
		}
		else {
			System.out.println("Access Granted");
		}
	}

}
