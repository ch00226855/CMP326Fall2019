
public class DemoCastException {
	
	public class Class1{
		int id;
		
		public Class1() {
			id = 0;
		}
	}
	
	public class Class2 {
		double id;
		
		public Class2() {
			id = 0.0;
		}
	}

	public static void main(String[] args) {
		
		DemoCastException demo = new DemoCastException();
		Class1 obj1 = demo.new Class1();
		
		Class2 obj2 = (Class2) obj1; // This type casting is illegal.
	}

}
