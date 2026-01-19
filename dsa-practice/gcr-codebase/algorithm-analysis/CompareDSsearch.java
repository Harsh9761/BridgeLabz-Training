import java.util.*;
public class CompareDSsearch {

	public static void main(String[] args) {
		
		int n = 1_000_000;
        int target = n - 1;

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, end;

        // Array Search
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (array[i] == target)
                break;
        }
        end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1_000_000 + " ms");

        // HashSet Search
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1_000_000 + " ms");

        // TreeSet Search
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000 + " ms");

	}

}
