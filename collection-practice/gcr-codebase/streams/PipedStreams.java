import java.io.*;
public class PipedStreams {

	public static void main(String[] args) {
		try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writer = new Thread(() -> {
                try {
                    pos.write("Hello".getBytes());
                    pos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.start();
            reader.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
