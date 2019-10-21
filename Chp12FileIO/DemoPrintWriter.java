import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class DemoPrintWriter {

	public static void main(String[] args) {
		
		FileOutputStream fileStream = null;
		PrintWriter file = null;
		
		try {
			fileStream = new FileOutputStream("log.txt");
			file = new PrintWriter(fileStream);
			
			// Write something to the file
			file.println(123);
			file.print("ABC");
			file.printf("%2d", 25);
			
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
