// This Animal class is based on HW 4-1
public class Animal {

	private String name;
	private int birthYear;
	private double weight;
	private double height;
	private char gender;
	
	// 3 constructors
	public Animal() {
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.height = 0.0;
		this.gender = 'u';
	}
	
	public Animal(String name, int birthYear, double weight,
			char gender) {
		this.name = name;
		this.birthYear = birthYear;
		
		if (validWeight(weight)) {
			this.weight = weight;
		} else {
			this.weight = -1.0;
		}
		this.height = 0.0;
		
		if (validGender(gender)) {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
	}
	
	private boolean validWeight(double weight) {
		return (weight < 0.0);
	}
	
	private boolean validGender(char gender) {
		return (gender == 'f') || (gender == 'm') || (gender == 'u');
	}
	
	private boolean validHeight(double height) {
		return (height < 0.0);
	}
	
	public Animal(String name, int birthYear, double weight,
			double height, char gender) {
		this.name = name;
		this.birthYear = birthYear;
		
//		if (validWeight(weight)) {
//			this.weight = weight;
//		} else {
//			this.weight = -1.0;
//		}
		// use conditional expression to simplify parameter checking
		this.weight = (validWeight(weight))? weight : -1.0;
		this.height = (validHeight(height))? height : -1.0;
		this.gender = (validGender(gender))? gender : 'u';
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = (validWeight(weight))? weight : -1.0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (validHeight(height))? height : -1.0;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = (validGender(gender))? gender : 'u';
	}
	
	public int calculateAge(int currentYear) {
		int age = currentYear - birthYear;
//		return (age > 0)? age : -1;
		if (age > 0) {
			return age;
		} else {
			return -1;
		}
	}
	
	
	
}
