import java.io.*;
public class FileHandling {

	public static void main(String[] args) {
		
		File sourceFile = new File("C:\\Users\\dimpl\\Desktop\\BridgeLabz-Training\\collection-practice\\gcr-codebase\\streams\\source.txt");
		if(!sourceFile.exists()) {
			System.out.println("File does not exists! ");
			return;
		}
		try(FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream("destination.txt")){
			int data;
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
			
			System.out.println("File copied successfully");
		}catch (IOException e) {
            System.out.println("Error while reading or writing file");
            e.printStackTrace();
        }

	}

}
