import java.io.*;
public class FileReaderProblem {

	public static void main(String[] args) {
		
		String filePath = "fileName.txt"; 

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

	}

}
