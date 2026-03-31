import java.util.*;
public class TotalHandshake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of students: ");
		 int num = sc.nextInt();
		 int ans = findCount(num);
		 System.out.println("Total Handshakes: "+ans);
	}
	public static int findCount(int num) {
		return (num*(num-1))/2;
	}

}
