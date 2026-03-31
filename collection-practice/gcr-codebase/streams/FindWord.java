import java.io.*;
public class FindWord {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\streams\\source.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
