import java.util.Scanner;

public class BMICalculatorException {

	public static void main(String[] args) {
		
		// Ask the user for weight and height
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter weight (lb):");
		double weight = 0.0;
		try {
			weight = scnr.nextDouble();
			if (weight < 0.0) {
				throw new Exception("Weight is negative.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
//		finally { // This is optional.
//			
//		}
		
		
		System.out.println("Please enter height (inch):");
		double height = scnr.nextDouble();
		
		// Calculate BMI using formula:
		// BMI = weight / height ^ 2 * 703.
		double bmi = weight / Math.pow(height, 2) * 703;
		try {
			int temp = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// Output the result.
		System.out.println("BMI: " + bmi);

	}

}
