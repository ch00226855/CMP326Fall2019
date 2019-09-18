
public class Employee extends Person {
	
	private double weeklySalary;
	private String position;
	private boolean isOnVacation;
	private boolean isSick;
	
	public Employee() {
		super(); // super is referring to the parent class 
				 // the parent constructor must be called before everything else.
		weeklySalary = 0.0;
		position = "UNDECIDED";
		isOnVacation = false;
		isSick = false;
	}
	
	// An overloaded constructor that sets all attributes of the employee.
	public Employee(String name, int age, double weight, double height, char bloodType,
					boolean isMale, double weeklySalary, String position, boolean isOnVacation,
					boolean isSick) {
		
		super(name, age, weight, height, bloodType, isMale);
		this.weeklySalary = weeklySalary;
		this.position = position;
		this.isOnVacation = isOnVacation;
		this.isSick = isSick;
		
	}
	
	public void printInfo() {
//		System.out.println("Name: " + super.getName() +
//							"Age: " + super.getAge() +
//							"Weight: " + super.getWeight() +
//							"Height: " + super.getHeight() +
//							"Bloodtype: " + super.getBloodType() +
//							"Person ID: " + super.getPersonId() +
//							"Weekly Salaray: " + this.weeklySalary +
//							"Position: " + this.position +
//							"On vacation? " + this.isOnVacation +
//							"Sick? " + this.isSick);
		
		// Use System.out.printf() to print with certain format
		System.out.printf("Name: %10s | Age: %4d | Weight: %5.1f | Height: %5.1f | Bloodtype: %c\n",
				super.getName(), super.getAge(), super.getWeight(), super.getHeight(), super.getBloodType());
	}
	
	
	
	
	
	

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isOnVacation() {
		return isOnVacation;
	}

	public void setOnVacation(boolean isOnVacation) {
		this.isOnVacation = isOnVacation;
	}

	public boolean isSick() {
		return isSick;
	}

	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}
	
	
	
	
}
