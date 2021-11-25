//inherit from bank account
//create a double variable named interest
//test out all methods from parent class

public class SavingsAccount extends BankAccount{
	private double interest = 0.075;
	private int wCount = 1;
	private int limit = 4;

	public static void main(String[] args) {
	SavingsAccount acct = new SavingsAccount();
	double interest; //double variable interest
	acct.deposit(100000); //d successful
	acct.deposit(-1000); //d unsuccessful
	acct.withdrawal(1000); //w successful
	acct.withdrawal(1000000); //w unsuccessful
	
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
		return "Type: Checking, "+super.toString()+", interest %"+interest;
	}
}
