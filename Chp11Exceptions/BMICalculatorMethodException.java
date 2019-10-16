import java.util.Scanner;

public class BMICalculatorMethodException {

	public static void main(String[] args) {
		
		// Ask the user for weight and height
		Scanner scnr = new Scanner(System.in);
		double weight = 0.0;
		try {
			weight = getWeight(scnr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Please enter height (inch):");
		double height = scnr.nextDouble();
		
		// Calculate BMI using formula:
		// BMI = weight / height ^ 2 * 703.
		double bmi = weight / Math.pow(height, 2) * 703;
		
		// Output the result.
		System.out.println("BMI: " + bmi);

	}
	
	public static double getWeight(Scanner scnr) throws Exception {
		System.out.println("Please enter wight (lb):");
		double weight = 0.0;

		weight = scnr.nextDouble();
		if (weight < 0.0) {
			throw new Exception("Negative weight");
		}

		return weight;
	}

}