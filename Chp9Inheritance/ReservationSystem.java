
public class ReservationSystem {
	
	Seat[] seats;
	
	//*************************************
	private class Seat {
		
		private int id;
		private double price;
		private String name;
		
		public Seat(int id, double price) {
			this.id = id;
			this.price = price;
			this.name = "EMPTY";
		}
		
		
		
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return String.format("Seat ID: %2d | Name: %10s | Price: %4.2f", this.id, this.name, this.price);
		}
		
		
	}
	//*************************************
	
	public ReservationSystem() {
		seats = new Seat[4];
		seats[0] = new Seat(1, 10.0);
		seats[1] = new Seat(2, 10.0);
		seats[2] = new Seat(3, 7.5);
		seats[3] = new Seat(4, 7.5);
	}
	
	public void reserve(int id, String name) {
		// check the name of the seat:
		// 1. this.name is EMPTY, change this.name to name;
		// 2. this.name is the same as name: print "You have already reserved this seat."
		// 3. this.name is not empty and is different from name, print "Seat reserved by someone else."
		if (seats[id - 1].getName().equals("EMPTY")) {
			seats[id - 1].setName(name);
		} else if (seats[id - 1].getName().equals(name)) {
			System.out.println("You have already reserved this seat.");
		} else {
			System.out.println("Someone else has reserved this seat.");
		}
	}
	
	public void showReservations() {
		for (int i = 0; i < seats.length; i++) {
			System.out.println(seats[i]);
		}
	}
	
	public void testSeat() {
		// Create a seat and print it out.
		Seat s1 = new Seat(1, 10.0);
		System.out.println(s1);	// toString method is implicitly called
	}
	
	public static void main(String[] args) {
		// Create a reservation system first
		ReservationSystem r1 = new ReservationSystem();
//		r1.testSeat();
		r1.reserve(1, "Alex");
		r1.reserve(1, "Brian");
		r1.reserve(1, "Alex");
		r1.reserve(3, "Debbie");
		r1.showReservations();
	}

}
