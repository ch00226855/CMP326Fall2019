
public class Company {
	
	private String name;
	private Person owner;
	private Employee[] employees;
	private double account;
//	private int numEmployees;
	
	public Company() {
		name = "Unspecified Name";
		owner = new Person();
		employees = new Employee[5];
		account = 0.0;
	}

	
	public void operateForAWeek(double revenue) {
		account += revenue;
		for(int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				continue;
			} else if (!employees[i].isOnVacation() &&
						!employees[i].isSick()){
				System.out.println("Paying " + employees[i].getName() +
							" " + employees[i].getWeeklySalary());
				account -= employees[i].getWeeklySalary();
			}
		}
		if (account < 0.0) {
			System.out.println(name + " goes bankrupt.");
		} else if (account < 1000.0) {
			System.out.println(name + " is in danger of bankruptcy.");
		} else {
			System.out.println(name + " is operating healthily.");
		}
		
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}
	
	

}
