
public class DemoCompany {

	public static void main(String[] args) {
		
		Company c1 = new Company();
		
		c1.setName("Microsoft");
		
		Person bill = new Person();
		bill.setName("Bill Gates");
		c1.setOwner(bill);
		
		Employee william = new Employee();
		william.setName("William Gates");
		william.setPosition("Chairman of the Board");
		
		Employee steven = new Employee();
		steven.setName("Steven Ballmer");
		steven.setPosition("Chief Executive Officer");
		
		PartTimeEmployee w = new PartTimeEmployee();
		w.setName("W. Reed Hastings");
		w.setPosition("Consultant");
		w.setHourlyRate(1000.0);
		w.setHoursWorked(10);
		
		Employee[] ms = new Employee[5];
		ms[0] = william;
		ms[1] = steven;
		ms[2] = w;
		// The following line will give an error:
//		ms[3] = bill;
		
		c1.setEmployees(ms);
		
		System.out.println("Name of the company: " + c1.getName());
		System.out.println("Name of the owner: " + c1.getOwner().getName());
		for (int i = 0; i < 3; i++) {
			System.out.println("Name of employee: " + 
							c1.getEmployees()[i].getName());
		}
		
		william.setWeeklySalary(100000.0);
		steven.setWeeklySalary(70000.0);
		
		c1.operateForAWeek(200000.0);
		c1.operateForAWeek(150000.0);

	}

}
