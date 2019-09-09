
public class Person {
	
	private String name;
	private int age;
	private double weight;
	private double height;
	private char bloodType;
	private boolean isMale;
	private boolean isAdult;
	
	// default constructor
	public Person() {
		System.out.println("Constructing a person...");
		name = "";
		age = 0;
		weight = 0.0;
		height = 0.0;
		bloodType = 'O';
		isMale = true;
		decideIsAdult();
		System.out.println("Person constructed.");
	}
	
	private void decideIsAdult() {
		isAdult = (age >= 18);
	}
	
	public void sing() {
		System.out.println("Lalala");
	}
	
	public void eat() {
		System.out.println("Yum yum");
	}
	
	public void sayHello() {
		System.out.println(name + " says: Hello!");
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight < 0.0) {
			System.out.println("Weight cannot be negative!");
		} else {
			this.weight = weight;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0.0) {
			System.out.println("Height cannot be negative.");
		} else {
			this.height = height;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public char getBloodType() {
		return bloodType;
	}

	public boolean isAdult() {
		return isAdult;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		// First, check if newAge is a valid age
		if (newAge < 0) {
			System.out.println("Cannot assign negative value to age");
		} else {
		age = newAge;
		}
	}
	
}
