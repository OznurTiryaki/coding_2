package day40_May7;

public class BankAccountRunnerClass {

	public static void main(String[] args) {

		BankAccount customer1 = new BankAccount();

		customer1.accountHolder = "Murat Karakus";
		customer1.balance = 1250;

		customer1.showAccountHolder();

		customer1.showBAlance();

		customer1.add100Dollar(100);
		
		
		BankAccount customer2 = new BankAccount();

		customer2.accountHolder = "Oznur Karakus";
		customer2.balance = 5000;

		customer2.showAccountHolder();

		customer2.showBAlance();

		customer2.add100Dollar(1000);
	}

}
