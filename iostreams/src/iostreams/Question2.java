package iostreams;
import java.io.*;
public class Question2 {
	  public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("source.txt");
	            FileWriter writer = new FileWriter("destination.txt");

	            int ch;
	            while ((ch = reader.read()) != -1) {
	                writer.write(ch);
	            }

	            reader.close();
	            writer.close();
	            System.out.println("File copied successfully!");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
