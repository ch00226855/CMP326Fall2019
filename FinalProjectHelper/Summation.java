
public class Summation {
	
	public static int summationWithLoop(int n) {
		/*
		 * return the sum of all integers from 1 to n.
		 */
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
			// sum += i;
		}
		return sum;		
	}
	
	public static int summationWithRecursion(int n) {
		/*
		 * return the sum of all integers from 1 to n.
		 */	
		if (n == 1) {
			return 1;
		} else {
			return n + summationWithRecursion(n - 1);
		}
	}

	public static void main(String[] args) {
		int n;
		n = 5;
		System.out.println("Summation up to " + n + ": " +
							summationWithLoop(n));

		System.out.println("Summation up to " + n + ": " +
							summationWithRecursion(n));
	}

}
