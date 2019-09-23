
public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee() {
		super(); // use a constructor of Employee
		hoursWorked = 0;
		hourlyRate = 0.0;
	}
	
	public PartTimeEmployee(String name,
							int age,
							double weight,
							double height,
							char bloodType,
							boolean isMale,
							double weeklySalary,
							String position,
							boolean isOnVacation,
							boolean isSick,
							int hoursWorked,
							double hourlyRate) {
		// Use the overloaded constructor of the parent class
		super(name, age, weight, height, bloodType,
				isMale, weeklySalary, position, isOnVacation, isSick);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		
	}
	
	// Define an overrided setWeeklySalary() method, preventing 
	// direct modification on weeklySalary()
	@Override
	public void setWeeklySalary(double weeklySalary) {
		System.out.println("The weekly salary of a part-time employee"
				+ " cannot be modified directly.");
	}
	
	@Override
	public double getWeeklySalary() {
		return this.hourlyRate * this.hoursWorked;
	}
	
	
	
	
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
