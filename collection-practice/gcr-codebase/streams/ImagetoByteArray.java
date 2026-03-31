import java.io.*;
public class ImagetoByteArray {

	public static void main(String[] args) {
		
		String sourceImage = "input.jpg";
        String outputImage = "output.jpg";

        try {
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            byte[] imageBytes = baos.toByteArray();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fos.close();
            bais.close();

            File original = new File(sourceImage);
            File copied = new File(outputImage);

            if (original.length() == copied.length()) {
                System.out.println("Files are identical (size matched)");
            } else {
                System.out.println("Files are NOT identical");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
