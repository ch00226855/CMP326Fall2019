import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoScanner {

	public static void main(String[] args) {
		
		// try to load the file
//		FileInputStream fileStream = new FileInputStream("data.txt");
//		Scanner file = new Scanner(fileStream);
		FileInputStream fileStream = null;
		Scanner file = null;
		
		try {
//			fileStream = new FileInputStream("C:\\Users\\Student\\Documents\\data.txt"); // use absolute path
			fileStream = new FileInputStream("subfolder\\subfold_layer2\\data.txt"); // use relative path
			file = new Scanner(fileStream);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// load its content
		int num = file.nextInt();
		double num2 = file.nextDouble();
		String str = file.nextLine();
		
		// Print out the content
		System.out.print(num + " ");
		System.out.print(num2 + " ");
		System.out.print(str);
		
		// close file stream and scanner
		try {
			fileStream.close();
			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
