package Customer;

import java.util.Scanner;

import Admin.BookSeat;
import Admin.Seat;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seat s = new Seat();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter no.of seats");
			int noOfSeats = sc.nextInt();
			BookSeat t = new BookSeat(name, noOfSeats, s);
			t.start();
		}
	}
}
