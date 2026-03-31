import java.io.*;
public class SimpleImageCopy {

	public static void main(String[] args) {
		String source = "original_image.jpg";
        String dest = "copied_image.jpg";
        
        try {
        	FileInputStream fis = new FileInputStream(source);
        	ByteArrayOutputStream baos = new ByteArrayOutputStream();
        	
        	int b;
        	while((b = fis.read())!=-1) {
        		baos.write(b);
        	}
        	
        	byte[] imageBytes = baos.toByteArray();
        	
        	ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        	FileOutputStream fos = new FileOutputStream(dest);
        	
        	bais.close();
            fos.close();
            System.out.println("Image copied successfully!");
        	
        }catch (IOException e) {
            e.printStackTrace();
        }
	}

}
