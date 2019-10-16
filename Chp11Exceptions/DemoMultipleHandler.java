
public class DemoMultipleHandler {

	public static void main(String[] args) {
		
		int[] ary = new int[5];
		
		try {
			throw new NewException();
//			System.out.println(ary[6]);
//			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {
			System.out.println("ABCABC");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("DEFDEF");
		} catch (NewException e) {
			e.printEverything();
		}
		
		System.out.println("THE END");
	

	}

}
