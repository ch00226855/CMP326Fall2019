
public class FactorialWithLoop {
	
	public static int factorial(int n) {
		int ans = 1;
		// Calculate factorial using a loop
		for(int i = 1; i <= n; i++) {
			ans *= i; // multiply i to ans
		}
		
		return ans;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Factorial of 7: " + factorial(7));

	}

}
