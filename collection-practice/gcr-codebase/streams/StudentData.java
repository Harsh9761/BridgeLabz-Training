import java.io.*;
public class StudentData {

	public static void main(String[] args) {
		String file = "student.dat";

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

            dos.writeInt(101);
            dos.writeUTF("Harshdeep");
            dos.writeDouble(8.5);

            dos.close();
            System.out.println("Data stored successfully!");

            
            DataInputStream dis = new DataInputStream(new FileInputStream(file));

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            dis.close();

            System.out.println("\nRetrieved Data:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
