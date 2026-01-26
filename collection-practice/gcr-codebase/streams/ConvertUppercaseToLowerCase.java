import java.io.*;
public class ConvertUppercaseToLowerCase {

	public static void main(String[] args) {
		
		File source = new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\streams\\source.txt");
		File destination = new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\streams\\destination.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(source));
			BufferedWriter bw = new BufferedWriter(new FileWriter(destination))){
			String line;
			while((line = br.readLine())!= null) {
				String lowerCaseLine = line.toLowerCase();
				bw.write(lowerCaseLine);
				bw.newLine();
			}
			System.out.println("File updated to lowercase successfully.");
			
		}catch (IOException e) {
            System.out.println("Error processing files.");
            e.printStackTrace();
        }

	}

}
