public class DemoInheritance {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setName("Mark");
		emp1.setAge(35);
		emp1.setWeeklySalary(2000);
		emp1.setPosition("Marketing");
		
		System.out.println("Name: " + emp1.getName());
		System.out.println("Age: " + emp1.getAge());
		System.out.println("Salary: " + emp1.getWeeklySalary());
		System.out.println("Position: " + emp1.getPosition());
		System.out.println("Is on vacation? " + emp1.isOnVacation());
		System.out.println("Is sick? " + emp1.isSick());
		
		System.out.println("------------------------------------------------");
		Employee emp2 = new Employee("Rachel", 20, 120, 150, 'A', false, 1500, "HR", true, false);
		System.out.println("Name: " + emp2.getName());
		System.out.println("Age: " + emp2.getAge());
		System.out.println("Salary: " + emp2.getWeeklySalary());
		System.out.println("Position: " + emp2.getPosition());
		System.out.println("Is on vacation? " + emp2.isOnVacation());
		System.out.println("Is sick? " + emp2.isSick());		

		emp1.sing();
		emp2.sayHello();
		
		emp1.printInfo();
		emp2.printInfo();
	}

}