
public class Factorial {
	
	public static int factorialWithLoop(int n) {
		/*
		 * Returns n!.
		 */
		int product = 1;
		for(int i = 1; i <= n; i++) {
			product = product * i; // product *= i;
		}
		return product;
	}
	
	public static int factorialWithRecursion(int n) {
		/*
		 * Returns n!.
		 */
		if (n == 1) {
			return 1;
		} else {
			return factorialWithRecursion(n - 1) * n;
		}
	}

	public static void main(String[] args) {
		int n;
		n = 5;
		System.out.println("Factorial of " + n + ": " +
							factorialWithLoop(n));
		System.out.println("Factorial of " + n + ": " +
							factorialWithRecursion(n));

	}

}
