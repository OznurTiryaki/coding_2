package day10_March13;

import java.util.Scanner;

public class ConditionalIOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Okta to Slack");
		System.out.println("Enter the length of your username");
		int lengthOfNAme = scan.nextInt();
		
		if (lengthOfNAme > 22) {
			
			System.out.println("Slack cannot take more than 22 character");
			
			//lengthOfNAme = 21;
			
			
			//System.out.println("user name has been adjusted");
			
			//System.out.println("Successfully added user"); if we don't write -else- it print everything
		}
		
		
	}

}
