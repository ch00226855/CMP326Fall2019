
public class DemoIllegalArgument {

	public static void main(String[] args) {
		printSmthing(100); // incorrect type of argument.
	}
	
	public static void printSmthing(String message) {
		System.out.println(message);
	}
}
