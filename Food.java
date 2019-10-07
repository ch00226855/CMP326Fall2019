
public class Food {
	
	private String name;
	private int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return String.format("Food - name: %10s | calories: %4d" ,
				name, calories);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Food) { // 1. check the type of obj
			Food foodObj = (Food) obj; // 2. if type is correct,
										// convert it into a Food object
			if (this.name == foodObj.getName() && 
				this.calories == foodObj.getCalories()) {
				// if all attributes match, return true;
				return true;
			}
		}
		// in any other case, return false.
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
