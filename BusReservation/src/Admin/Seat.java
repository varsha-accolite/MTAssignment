package Admin;

public class Seat {
	int totalSeats = 10;
	
	public synchronized void reserveSeat(String custName, int noOfSeats) {
		if(totalSeats >= noOfSeats) {
			System.out.println("Seats reserved successfully");
			totalSeats -= noOfSeats;
		}
		else {
			System.out.println("No seats available");
		}
	}
}
