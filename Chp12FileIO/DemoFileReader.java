import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		
		FileReader file = null;
		try {
			file = new FileReader("data.txt");
			
			int counter = 0;
			while (true) {
				// load and print the first character
				int character = file.read(); // FileReader.read() returns an int
											// representing a character.
				if (character == -1) {
					break;
				}
				System.out.print((char)character);
				counter++;
			}
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		


	}

}
