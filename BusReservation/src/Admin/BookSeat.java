package Admin;

public class BookSeat extends Thread{
	private String custName;
	private int noOfSeats;
	private Seat seat;
	
	public BookSeat(String custName, int noOfSeats, Seat seat) {
		this.custName = custName;
		this.noOfSeats = noOfSeats;
		this.seat = seat;
	}
	
	public void run() {
		seat.reserveSeat(custName, noOfSeats);
	}
}
