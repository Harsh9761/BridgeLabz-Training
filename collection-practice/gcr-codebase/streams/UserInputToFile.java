import java.io.*;
public class UserInputToFile {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			FileWriter writer = new FileWriter("user_details.txt");
			
			System.out.println("Enter Name");
			String name = br.readLine();
			
			System.out.println("Enter Age");
			String age = br.readLine();
			
			System.out.println("Enter Your favourite programmin language");
			String language = br.readLine();
			
			writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.flush();
            
            System.out.println("File updated successfully.");
		}catch (IOException e) {
            System.out.println("Error occurred while reading or writing data");
            e.printStackTrace();
        }

	}

}
