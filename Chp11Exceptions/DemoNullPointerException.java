import java.util.Scanner;

public class DemoNullPointerException {

	public static void main(String[] args) {
		
		Scanner scnr = null;
		// Calling scnr without constructing it first.
		double temp = scnr.nextDouble();

	}

}
