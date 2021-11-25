
public class BankAccount {
	private int number;
	private double balance;
	private static int numberofAccounts;
	
	public BankAccount() {
		number = ++numberofAccounts;
	}
	
	public void deposit(double amount) {
		if (amount >= 0.0) {
			balance += amount;
			displayTransaction(true, amount, 'd');		}
		else {
			displayTransaction(false, amount, 'd');
		}
	}
	public void withdrawal(double amount) {
		if ((balance-amount) >= 0.0) {
			balance -= amount;
			displayTransaction(true, amount, 'w');
		}
		else {
			displayTransaction(false, amount, 'w');
		}
	}
	public void displayTransaction(boolean state, double amount, char mode) {
		if (mode =='d') {
			if (state) {
				System.out.println("Transaction successful, $"+ amount + " has been deposited to account #" +number+".\nNew balance: $"+balance);
			}
			else {
				System.out.println("Transaction unsuccessful, invalid amount");
			}
		}
		if (mode == 'w') {
			if (state) {
				System.out.println("Transaction successful, $" + amount + " has been withdrawn from account #"+number+".\nNew balance: $"+balance);
			}
			else {
				System.out.println("Transaction unsuccessful, insufficient balance");
			}
		}
	}
	@Override
	public String toString() {
		return " number #"+number+ ", balance $"+balance;
	

		}
	}

