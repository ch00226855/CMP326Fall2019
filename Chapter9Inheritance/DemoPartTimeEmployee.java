
public class DemoPartTimeEmployee {

	public static void main(String[] args) {
		
		PartTimeEmployee pt1 = new PartTimeEmployee();
		pt1.setName("Andrew");
		System.out.println("Name of pt1: " + pt1.getName());
		
		pt1.setWeeklySalary(1234.56);
		System.out.println("Weekly salary: " + pt1.getWeeklySalary());
		
		pt1.setHourlyRate(20.0);
		pt1.setHoursWorked(5);
		System.out.println("Weekly salary: " + pt1.getWeeklySalary());

	}

}
