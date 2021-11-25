
public class CheckingAccount extends BankAccount{
	private double interest = 0.075;
	private int wCount = 1;
	private int limit = 4;
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		acct.deposit(10000);
		//for (int i=0; i<10; i++) {
		//	acct.withdrawal(100);
		//}		
	
		System.out.println(acct);
	}
	@Override
	public void withdrawal (double amount) {
		if (wCount < limit) {
			super.withdrawal(amount);
			++wCount;
		}
		else {
			double interestToCharge = amount*interest;
			amount = amount+interestToCharge;
			System.out.println("Interest $"+interestToCharge);
			super.withdrawal(amount);
			wCount = 1;
			
		}
	}
	@Override
	public String toString() {
		return " Type: Checking, "+super.toString()+", interest %"+interest;
	}
}
