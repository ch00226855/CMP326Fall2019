import java.util.Scanner;

public class BMICalculatorManualErrorChecking {

	public static void main(String[] args) {

		// Ask the user for weight and height
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter weight (lb):");
		double weight = scnr.nextDouble();
		if (weight < 0.0) {
			System.out.println("Error: Negative weight entered.");
			return;
		}

		System.out.println("Please enter height (inch):");
		double height = scnr.nextDouble();
		if (height < 0.0) {
			System.out.println("Error: Negative height entered.");
			return;
		}

		// Calculate BMI using formula:
		// BMI = weight / height ^ 2 * 703.
		double bmi = weight / Math.pow(height, 2) * 703;

		// Output the result.
		System.out.println("BMI: " + bmi);

	}

}