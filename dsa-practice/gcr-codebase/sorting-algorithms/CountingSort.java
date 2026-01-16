import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] ages = new int[size];

        for (int i = 0; i < size; i++) {
            ages[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < size;i++) {
        	max = Math.max(max, ages[i]);
        }
        
        int count[] = new int[max+1];
        for(int i = 0;i < size;i++) {
        	count[ages[i]]++;
        }
        
        int index = 0;
        for(int i = 0;i < count.length;i++) {
        	while(count[i]>0) {
        		ages[index++] = i;
        		count[i]--;
        	}
        }
        
        for(int i = 0;i < ages.length;i++) {
        	System.out.print(ages[i]+" ");
        }

	}

}
