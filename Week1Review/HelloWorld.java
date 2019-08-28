import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		// 1. Print helloworld
		System.out.println("Hello World"); //here is also comment
		
		// 2. Variables and computations
		// store numbers 123 and 456 using two variables
		int numOne = 123; // Think of = as <-
		int numTwo = 456;
		
		// Add two variables
		System.out.println("The sum of " + numOne + " and " + numTwo 
				 + " is " + (numOne + numTwo) + ".");
		
		// Other types:
		// double (floating-point numbers), float
		// boolean (true or false)
		// String, char
		// int, byte, short, long
		
		// arithmetic operations
		// +, -, *, /
		// % - modulo  5 % 2 = 1 (odd-even detection) 1200 % 100 = 32
		// division preserves data type  5 / 3 = 1, 7 / 2 = 3
		// precision division: 5.0 / 3.0 =
		System.out.println("------------");
		System.out.println("5 / 3 = " + (5 / 3));
		System.out.println("5.0 / 3.0 = " + (5.0 / 3.0));
		// other operations
		// powers:
		System.out.println("------------");
		System.out.println("The 3rd power of 5: " + Math.pow(5, 3));
		// square root:
		System.out.println("The square root of 2: " + Math.sqrt(2));
		// absolute value:
		System.out.println("The absolute value of -1.234:" + Math.abs(-1.234));
		// random number between 0 and 1:
		System.out.println("A random number: " + Math.random());
		
		// Type conversions
		System.out.println("------------");
		System.out.println(1234); // 1234 will be converted to "1234" first
		System.out.println(5 / 3.0); // 5 will be converted to 5.0 first
		System.out.println("Convert 5.7 to an integer: " + ((int)5.7));
		System.out.println("Convert char to an integer: " + ((int)'a'));
		
		/* 
		 *	Chapter 3: Input / Output 
		 *   
		 *   - input: java.util.Scanner
		 *   		methods: nextInt(), nextDouble(), next(), nextLine()
		 *   - output: System.out.print/println
		 */
		Scanner scnr = new Scanner(System.in); // create a scanner object called scnr
		String userInput = scnr.nextLine();
		System.out.println(userInput);
		
	}

}
