import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteToCharStream {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\algorithm-analysis\\sample.txt";

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);


            BufferedReader br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();

        } catch (IOException error) {
            System.out.println("Error reading file: " + error.getMessage());
        }

	}

}
