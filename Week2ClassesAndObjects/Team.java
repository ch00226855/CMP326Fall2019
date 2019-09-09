
public class Team {
	
	private String name;
	private Person coach;
	private Person[] players;
	
	public Team(String newName) {
		name = newName;
		coach = new Person();
		players = new Person[5];
	}
	
	public void describe() {
		System.out.println("The name of the team is " +	name);
		System.out.println("The name of the coach is " +
					coach.getName());
		System.out.println("There are 5 players."); 
		System.out.println("Their names are:");
		for (int i = 0; i < 5; i++) {
			System.out.println(players[i].getName());
		}
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getCoach() {
		return coach;
	}

	public void setCoach(Person coach) {
		this.coach = coach;
	}

	public Person[] getPlayers() {
		return players;
	}

	public void setPlayers(Person[] players) {
		this.players = players;
	}
	
	

}
