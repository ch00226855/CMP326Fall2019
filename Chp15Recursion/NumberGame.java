import java.util.Scanner;

public class NumberGame {
	
	private final static boolean DEBUGGING = true;
	
	private static void dprint(String str) {
		// only prints str if DEBUGGING is true.
		if (DEBUGGING) {
			System.out.println(str);
		}
	}
	
	public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
		
		// 1. Find a guess
		// The most efficient guess is the mid-point of interval 
		// [lowVal, highVal]
		int midVal = (lowVal + highVal) / 2;
		dprint("lowVal: " + lowVal + "|highVal: " + 
							highVal + "|guess: " + midVal);
		
		
		// 2. Ask for user response
		System.out.println("Guess: " + midVal);
		System.out.println("Please enter your response (l/h/other):");
		char userResponse = scnr.next().charAt(0);
		dprint("User response: " + userResponse);
		
		// 3. Depending on the response, do:
		//   a) if the guess is correct, end the program.
		//   b) if the guess is too high, call guessNumber with the lower half
		//      of the interval [lowVal, midVal]
		//   c) if the guess is too low, call guessNumber with the higher half
		//      of the interval [midVal+1, highVal]
		switch(userResponse) {
		case 'l':
			guessNumber(midVal+1, highVal, scnr);
			break;
		case 'h':
			guessNumber(lowVal, midVal, scnr);
			break;
		default:
			System.out.println("Thank you for playing.");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// 1. ask user to pick a number, explain the rule 
		System.out.println("Please pick a number between 1 and 1024:");
		System.out.println("For each guess that I give, please enter:");
		System.out.println("----- l for too low");
		System.out.println("----- h for too high");
		System.out.println("----- any other key for correct guess");
		
		// 2. come up with a guess (the details are left to guessNumber())
		guessNumber(1, 1024, scnr);
		
		

	}

}
