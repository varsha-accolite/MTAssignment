package p1;

public class Threads {
	public static void main(String args[]) {
		WithdrawAndDeposit t = new WithdrawAndDeposit();
		
		new Thread() {
			public void run() {
				t.withdraw_amount(1500);
			}
		}.start();
		
		new Thread() {
			public void run() {
				t.deposit_amount(1000);
			}
		}.start();
	}
}
