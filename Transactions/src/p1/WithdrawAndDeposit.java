package p1;

public class WithdrawAndDeposit {
	int amount = 1000;
	synchronized void withdraw_amount(int amount) {
		if(this.amount < amount) {
			System.out.println("Low Balance");
			try {   wait();   }
			catch(Exception e) {}
		}
		this.amount -= amount;
		System.out.println("Money withdrawal success");
	}
	
	synchronized void deposit_amount(int amount) {
		this.amount += amount;
		System.out.println("Money deposited successfully");
		notify();
	}
}
