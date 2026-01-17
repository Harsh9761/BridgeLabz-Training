import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {

	public static void main(String[] args) {
		int iterations = 1_000_000;
        String text = "hello";
        
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder Time (ms): " + (endBuilder - startBuilder) / 1_000_000);

        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time (ms): " + (endBuffer - startBuffer) / 1_000_000);

        String filePath = "largefile.txt";
        long startFR = System.nanoTime();
        int wordCountFR = countWordsFileReader(filePath);
        long endFR = System.nanoTime();
        System.out.println("\nWord Count (FileReader): " + wordCountFR);
        System.out.println("FileReader Time (ms): " + (endFR - startFR) / 1_000_000);

        long startISR = System.nanoTime();
        int wordCountISR = countWordsInputStreamReader(filePath);
        long endISR = System.nanoTime();
        System.out.println("\nWord Count (InputStreamReader): " + wordCountISR);
        System.out.println("InputStreamReader Time (ms): " + (endISR - startISR) / 1_000_000);

	}
	
	public static int countWordsFileReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
	
	public static int countWordsInputStreamReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

}
