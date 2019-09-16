
public class BasketballTeam {
	
	private String name;
	private Person coach;
	private Person[] players;
	private int numPlayers;
	
	public BasketballTeam() {
		this.name = "";
		this.coach = null; // null can be considered as a placeholder. Coach hasn't been constructed yet.
		this.players = new Person[5];
		this.numPlayers = 0;
	}
	
	public void addPlayer(Person player) {
		players[numPlayers] = player;
		numPlayers++;
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

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}
	
	

}
