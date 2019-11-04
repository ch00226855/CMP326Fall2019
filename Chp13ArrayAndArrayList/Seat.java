
public class Seat {
	
	private String firstName;
	private String lastName;
	private double amountPaid;
	
	public Seat() {
		firstName = "";
		lastName = "";
		amountPaid = 0.0;
	}
	
	public void reserve(String firstName,
						String lastName,
						double amountPaid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.amountPaid = amountPaid;
	}
	
	public void makeEmpty() {
		this.firstName = "";
		this.lastName = "";
		this.amountPaid = 0.0;
	}
	
	public boolean isEmpty() {
		if (firstName.equals("") && 
			lastName.equals("") &&
			amountPaid == 0.0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.println(firstName + " " + lastName + " " + amountPaid);
	}

}
