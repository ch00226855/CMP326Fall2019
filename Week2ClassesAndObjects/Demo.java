
public class Demo {

	public static void main(String[] args) {
		
		// Let's create a Person
		Person person1 = new Person();
		
		// Let's name person1 Alice
		person1.setName("Alice");
		
		// Let's print person1's name
		// Since name attribute is private, we cannot use
		// person1.name; getName() is needed.
		System.out.println("Person1's name is " + 
					person1.getName());
		
		person1.setAge(25);
		System.out.println("Person1's age is " +
					person1.getAge());

		person1.setWeight(-10.0);
		System.out.println("Perons1's weight is " + 
					person1.getWeight());
		
		person1.sing();
		
		person1.eat();
		
		person1.sayHello();
		
		Person person2 = new Person();
		person2.setName("Bob");
		person2.sayHello();
		
		
		// Now let's create a team.
		// We need 6 persons to define a team
		Person person3 = new Person();
		person3.setName("Clare");
		
		Person person4 = new Person();
		person4.setName("Doug");
		
		Person person5 = new Person();
		person5.setName("Elizabeth");
		
		Person person6 = new Person();
		person6.setName("Fred");
		
		Team team1 = new Team("Team CMP326");
		team1.setCoach(person6);
		
		System.out.println(team1.getCoach().getName());
		
		// In order to assign the players, we need an array
		Person[] groupOfPlayers = new Person[5];
		groupOfPlayers[0] = person1;
		groupOfPlayers[1] = person2;
		groupOfPlayers[2] = person3;
		groupOfPlayers[3] = person4;
		groupOfPlayers[4] = person5;
		
		// Assign the array to the team
		team1.setPlayers(groupOfPlayers);
		
		// Print the name of the first and second player
		System.out.println(team1.getPlayers()[0].getName());
		System.out.println(team1.getPlayers()[1].getName());
		
		// Describe the team
		team1.describe();
		
		// print "1 2 3 4 5"
		System.out.print("1");
		for (int i = 2; i <= 5; i++) {
			System.out.print(" " + i);
		}
	}

}
