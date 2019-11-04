import java.util.ArrayList;
import java.util.Scanner;

public class SeatReservation {
	
	public static void makeSeatsEmpty(ArrayList<Seat> seats) {
		for (int i = 0; i < seats.size(); i++) {
			seats.get(i).makeEmpty();
		}
	}
	
	public static void printSeats(ArrayList<Seat> seats) {
		for (int i = 0; i < seats.size(); i++) {
			seats.get(i).print();
		}
	}
	
	public static void addSeats(ArrayList<Seat> seats, int numSeats) {
		for (int i = 0; i < numSeats; i++) {
//			seats.add(new Seat());
			Seat newSeat = new Seat();
			seats.add(newSeat);
		}
	}

	public static void main(String[] args) {
		
		// 1. Add 5 seats to the list
		ArrayList<Seat> seats = new ArrayList<Seat>();
		addSeats(seats, 5);
		
		// 2. Make all seats empty
		makeSeatsEmpty(seats);
		
		// 3. Keep this program going using a while loop
		Scanner keyboard = new Scanner(System.in);
		char userInput = '0';
		int seatNumber = 0;
		while (userInput != 'q') {
			System.out.println("Enter command: p/q/r:");
			userInput = keyboard.next().charAt(0);
			switch(userInput) {
			
			case 'p':
				printSeats(seats);
				break;
			case 'q':
				break;
			case 'r':
				System.out.println("What is the seat number:");
				seatNumber = keyboard.nextInt();
				seats.get(seatNumber).reserve("Alex", "Green", 5.0);
			}
		}
	}

}
