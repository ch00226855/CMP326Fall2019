import java.util.Arrays;

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
		// 0. If numPlayers >= this.players.length, we need to do the following:
		// 1. create a longer array (set new length to be previous length + 5)
		// 2. add all existing players to the new array
		// 3. add the new player to the new array
		// 4. set this.players equal to the new array.
		
		if (numPlayers >= this.players.length) {
			
			Person[] newArray = new Person[this.players.length + 5];
			
			newArray = Arrays.copyOf(this.players, this.players.length + 5);
			
			newArray[this.players.length] = player;
			
			this.players = newArray;
			
			numPlayers++;
			
		} else {
			players[numPlayers] = player;
			numPlayers++;
		}
	}
	
	public double getAverageHeight() {
		// 1. get sum of all player heights
		// 2. get number of players
		// 3. divide
		double sum = 0.0;
		for (int i = 0; i < numPlayers; i++) {
			sum += this.players[i].getHeight();
		}
		return sum / numPlayers;
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