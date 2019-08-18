package day51_May26;

public class SavingAccount extends BankAccount{

	
//	String accountName;
//	long accountNumber;
//	double balance;
	
	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);//dry principle
		this.returnRate = returnRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}
     
	@Override
	
	  public void add (int deposit) {
		  balance += 100;
	  }
	
	@Override	
	  public void withdraw (int amount) {
	       balance -=10;
		
	  }

	
	
}
