
public class DemoAnimal {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Tom");
		Animal a2 = new Animal("Jerry");
		
		String a1Str = a1.toString(); // toString method is inheried from the Object class.
		System.out.println(a1Str); // by default the string shows the class name and the address of the object

		System.out.println(a2.toString());
		
		System.out.println(a1.equals(a2));  // by default, two objects are equal only if they use the same address (referrence)
		Animal a3 = new Animal("Tom");
		System.out.println(a1.equals(a3));  
	}

}
