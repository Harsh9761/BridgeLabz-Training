import java.io.*;
public class WordOccuranceCount {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\algorithm-analysis\\sample.txt";
        String findWord = "harsh";
        int count = 0;

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(findWord)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("The word appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file");
        }

	}

}
