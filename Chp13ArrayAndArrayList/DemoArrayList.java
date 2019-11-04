import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		
		// Declare an arraylist:
		ArrayList<String> names = new ArrayList<String>();

		// Add a few names:
		names.add("Alice");    // {"Alice"}
		names.add("Bob");      // {"Alice", "Bob"}
		names.add(1, "Clare"); // {"Alice", "Clare", "Bob"}
		
		// Remove names:
		names.remove("Alice"); // {"Clare", "Bob"}
		names.remove(1);       // {"Clare"}
		
		// Reference
		System.out.println("First Name: " + names.get(0)); // the first element
//		System.out.println("First Name: " + names.get(1)); // Error!
		
		// Change the value of an element:
		names.set(0, "Eva");
		System.out.println("First Name: " + names.get(0)); // the first element
		
		// The length of the list
		System.out.println("Length: " + names.size());
		names.add("Hulk");
		System.out.println("Length: " + names.size());
		
		//--------------------------------------------------------------------
		// Let's try an arraylist of integers (primary data types are not acceptable)
//		ArrayList<int> numbers = new ArrayList<int>(); // Error: int is not acceptable
//		ArrayList<double> numbers2 = new ArrayList<double>();
		
		// We need wrapper classes for int, double
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		ArrayList<Double> numbers2 = new ArrayList<Double>();
		numbers2.add(1.234);
		numbers2.add(5.678);
		numbers2.add(9.01);
		for (int i = 0; i < numbers2.size(); i++) {
			System.out.println(numbers2.get(i));
		}
	}

}
