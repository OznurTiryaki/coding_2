package day10_March13;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to CybertekBanking App");
		
		long accountNumber =123456;
		
		String password = "abc123";
		
		
		System.out.println("Enter account number:");
		
		long ExpectedAccountNumber =scan.nextLong();
		
		//scan.nextLine();
		
		System.out.println("Enter account passport: ");
		
		String expectedPassword = scan.next();
		
		
		if (accountNumber == ExpectedAccountNumber  && password.equals(expectedPassword )) {
			
			System.out.println("Success");
			
		} else {
			System.out.println("Login Fails");
		}
}
}