
public class DemoFinally {

	public static void main(String[] args) {
		
		// This is an example showing why finally block is necessary
		try {
			System.out.println("This is a statement in try block before the exception");
			int[] ary = new int[5];
			int a = ary[6]; // will raise IndexOutOfBound Exception
			System.out.println("This is a statement in try block after the exception");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally { // will be executed whether there is an exception or not
			System.out.println("This is a statment in finally block");
		}
		
		System.out.println("This is a statement after try-catch block");

	}

}
