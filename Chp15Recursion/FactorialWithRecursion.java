
public class FactorialWithRecursion {
	
	public static int factorial(int n) {
		if (n == 1) {// base step: the recursion cannot go beyond 1
			return 1;
		}
		
		return factorial(n-1) * n; // recursive step
	}
	
	public static int summation(int n) {
		if (n == 1) {// base case
			return 1;
		}
		return summation(n-1) + n; // recursive step
	}
	
	public static int fib(int n) {
		//base cases
//		if (n == 0) {
//			return 0;
//		}
//		if (n == 1) {
//			return 1;
//		}
		
		if (n < 2) {
			return n;
		}
		// recursive step
		return fib(n-1) + fib(n-2);
	}
	
	public static boolean palindrome(String str) {
//		System.out.println(str);
		// base case:
		if (str.length() == 0) {
			return true;
		}
		if (str.length() == 1) {
			return true;
		}
		
		// recursive step:
		// a string is a palindrome if and only if its middle part is 
		// a palindrome and its first character equals to the last charater.
		return palindrome(str.substring(1, str.length()-1)) && 
				(str.charAt(0) == str.charAt(str.length()-1));
	}
	
	public static boolean palindrome2(String str) {
		
		if (str.length() == 0) {
			return true;
		}
		
		String middlePart = str.substring(1, str.length() - 1);
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		return palindrome(middlePart) && (first == last);
		
	}
	
	public static boolean palindrome3(String str) {
		char first;
		char second;
		for (int i = 0; i < str.length() / 2; i++ ) { // check equality for
														// each pair
			first = str.charAt(i);
			second = str.charAt(str.length() - i - 1);
			if (first != second) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Factorial of 7: " + factorial(7));
		
		System.out.println("Summation to 10: " + summation(10));
		
		System.out.println("8th Fibonacci number: " + fib(8));
		System.out.println("9th Fibonacci number: " + fib(9));
		
		String str = "wasitacaroracatisaw";
//		String str = "annah";
		System.out.println("Is " + str + " a palindrome? " + 
							palindrome3(str));

	}

}
