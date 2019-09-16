
public class Demo2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Mark");
		p1.setAge(35);
		p1.setWeight(140);
		p1.setHeight(170);
//		p1.setBloodType('A');
		p1.setMale(true); // isMale() is getter, setMale is setter.
		
		p1.sing();
		
		System.out.println("Name: " + p1.getName());
		
		// Create p2 using the overloaded constructor
		Person p2 = new Person("Rachel", 20, 110, 150, 'A', false);
		
		p2.sayHello();
		
		System.out.println("Is p2 an adult? " + p2.isAdult());
		
		System.out.println(p1.getName() + "'s ID: " + p1.getPersonId());
		System.out.println(p2.getName() + "'s ID: " + p2.getPersonId());
		
		System.out.println("Mark's age: " + p1.getAge());
		
		System.out.println("------------------------------------------------");
		BasketballTeam team1 = new BasketballTeam();
		
		team1.setName("New York Knicks");
		
		System.out.println("Name of the team: " + team1.getName());
		
		team1.setCoach(p1);
		
		System.out.println("Name of the coach: " + team1.getCoach().getName());
		System.out.println("Size of the team: " + team1.getNumPlayers());

		
		// Create some players
		Person kadeem = new Person();
		kadeem.setName("Kadeem Allen");
		kadeem.setHeight(190);
		
		Person rj = new Person();
		rj.setName("RJ Barret");
		rj.setHeight(200);
		
		Person ignas = new Person();
		ignas.setName("Ignas Brazdeikis");
		ignas.setHeight(200);
		
		team1.addPlayer(kadeem);
		System.out.println("Number of players after Kadeem joining the team: " + team1.getNumPlayers());
		
		team1.addPlayer(rj);
		System.out.println("Number of players after RJ joining the team: " + team1.getNumPlayers());
		
		team1.addPlayer(ignas);
		System.out.println("Number of players after Ignas joining the team: " + team1.getNumPlayers());
	
	
	
	}

		
		
}
