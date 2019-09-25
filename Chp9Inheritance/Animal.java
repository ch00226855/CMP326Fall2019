
public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ("This is an object of class Animal, the name of the animal is " + this.name);
	}

	@Override
	public boolean equals(Object anotherObj) {
		// this methods returns true as long as anotherObj is an Animal, and its name equals this.name;
		if (anotherObj instanceof Animal) { // check if anotherObj is an Animal
			Animal animalObj = (Animal) anotherObj; // if yes, convert it to an Animal object
			if (this.name.equals(animalObj.getName())) { // check if the name matches
				return true;
			}
		}
		return false;
	}
}
