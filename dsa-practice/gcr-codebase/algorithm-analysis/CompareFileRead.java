import java.io.*;
public class CompareFileRead {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\algorithm-analysis\\sample.txt");
        long start, end;

        // FileReader
        start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1) {
        // reading character by character
        }
        fr.close();
        end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1_000_000 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1) {
        // reading bytes and converting to characters
        }
        isr.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1_000_000 + " ms");

	}

}
