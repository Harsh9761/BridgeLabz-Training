import java.util.*;
import java.io.*;

public class WordCount {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\streams\\source.txt";
        HashMap<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 5 words:");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
        }

	}

}
