import java.util.*;
public class DuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		ArrayList<Integer> ans = new ArrayList<>();
		System.out.println("Enter Elements: ");
		for(int i = 0;i<size;i++) {
			
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					if(!ans.contains(arr[i])) {
						ans.add(arr[i]);
					}
				}
			}
		}
		System.out.println("Duplicate Elements: ");
		for(int element: ans) {
			System.out.println(element);
		}
	}

}
