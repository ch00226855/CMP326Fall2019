
public class NewException extends Exception {
	
	public NewException() {
		super();
	}
	
	public void printEverything() {
		System.out.println(getMessage());
		printStackTrace();
	}

}
