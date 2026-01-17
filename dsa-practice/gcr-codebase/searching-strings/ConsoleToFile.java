import java.io.*;
public class ConsoleToFile {

	public static void main(String[] args) {
		String filePath = "output.txt";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true);

            String input;

            System.out.println("Enter text (type 'exit' to stop):");
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input + System.lineSeparator());
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException error) {
            System.out.println("Error: " + error.getMessage());
        }

	}

}
