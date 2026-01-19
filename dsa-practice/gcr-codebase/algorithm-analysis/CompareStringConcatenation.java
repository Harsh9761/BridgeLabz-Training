
public class CompareStringConcatenation {

	public static void main(String[] args) {
		int n = 1000000;
		int numbers[] = new int[n];
		for(int i = 0; i < n;i++) {
			numbers[i] = i;
		}
		
		String output = "";
		long start = System.nanoTime();
		for(int i = 0; i < n;i++) {
			output += "a";
		}
		long end = System.nanoTime();
		System.out.println("String Time: " + (end - start) / 1_000_000 + " ms");
		
		StringBuilder sb = new StringBuilder();
		start = System.nanoTime();
		for(int i = 0; i < n;i++) {
			sb.append("a");
		}
		end = System.nanoTime();
		System.out.println("StringBuilder Time: " + (end - start) / 1_000_000 + " ms");
		
		StringBuffer sf = new StringBuffer();
		start = System.nanoTime();
		for(int i = 0; i < n;i++) {
			sf.append("a");
		}
		end = System.nanoTime();
		System.out.println("StringBuffer Time: " + (end - start) / 1_000_000 + " ms");

	}

}
