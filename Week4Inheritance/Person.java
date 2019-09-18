public class Person {
	
	private String name;
	private int age;
	private double weight;
	private double height;
	private char bloodType;
	private boolean isMale;
	private boolean isAdult;
	
	private static int counter = 0;
	private int personId; // personId = age * 1000 + counter;
	
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
		
//		counter++;
//		this.personId = age * 1000 + counter;
		
		decidePersonId();
		
		System.out.println("Person constructed.");
	}
	
	// Add an overloaded constructor
	public Person(String name,
				int age,
				double weight,
				double height,
				char bloodType,
				boolean isMale) {
		System.out.println("The overloaded constructor is called.");
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.bloodType = bloodType;
		this.isMale = isMale;
		decideIsAdult(); // decide the value for isAdult
		
//		counter++;
//		this.personId = age * 1000 + counter;
		decidePersonId();
	}
	
	private void decidePersonId() {
		counter++;
		this.personId = age * 1000 + counter;
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
	
//	public void setName(String newName) {
//		name = newName;
//	}
	
	public void setName(String name) {
		this.name = name;
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
	
//	public void setAge(int newAge) {
//		// First, check if newAge is a valid age
//		if (newAge < 0) {
//			System.out.println("Cannot assign negative value to age");
//		} else {
//		age = newAge;
//		}
//	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Cannot assign negative value to age");
		} else {
			this.age = age;
		}
	}
	
	public int getPersonId() {
		return personId;
	}
	
}