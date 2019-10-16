
public class MultipleExceptionThrowal {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void method1() throws Exception {
		
		method2();

	}
	
	public static void method2() throws Exception{
		
		throw new Exception("Something is wrong in method2().");
		
	}

}
