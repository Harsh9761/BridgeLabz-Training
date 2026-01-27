import java.util.*;
public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Array Size: ");
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			System.out.println("Enter Elements: ");
			for(int i = 0;i < size;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index OutOfBounds");
		}catch (NullPointerException e) {
            System.out.println("Array is null");
		}

	}

}
