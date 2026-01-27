import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("data.txt");
			int ch;
			
			while((ch = fr.read())!= -1) {
				System.out.println((char) ch);
			}
			
			fr.close();
		} catch(IOException e) {
			System.out.println("File does not exists.");
		}

	}

}
