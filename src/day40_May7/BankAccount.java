package day40_May7;

public class BankAccount {

	// create an instance method(non-static method)
	// called showAccountHolder --> printOut Account Holder name

	// create an instance method showBalance and print out the balance

	// OPTIONAL
	// create an instance method called add100Dollar does not accept any paramters
	// and return no value
	// increase the balance of the account by 100 ;

	// Create another class called BankActivity with main method
	// create bank account object
	// set account holder name and balance value
	// call your showAccountHolder and showBalance method

	// OPTIONALLY CALL YOUR add100Dollar
	// and call your showBalance method again to see whether balance has changed

	String accountHolder;   //they don't have a access modifier
	                         //thats mean we can access just in same package
	   // we don't have any access from different package

	double balance;

	public void showAccountHolder() {

		System.out.println("Accound holder: " + accountHolder);

	}

	public void showBAlance() {

		System.out.println("Balance: " + balance);

	}
//adding custom amount to current account
	public void add100Dollar(int addAmount) {
         balance +=addAmount;
		System.out.println("New Balance: " + balance );

	}
}
