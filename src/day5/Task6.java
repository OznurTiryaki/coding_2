package day5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		// Scanner-2

		//creating scanner object
		
		Scanner input = new Scanner(System.in);
		
		//asking user question
		
		System.out.println("Enter your first name :" );
		
		//force user to enter input/data
		
		String firstName = input.nextLine();
		
		//and format the display output
		
		System.out.println("Your first name is :" +firstName);
		
		System.out.println("Enter your last name :" );
		
		//force user to enter input/data
		
		String lastName = input.nextLine();
		
		//format the display again
		
		System.out.println("Your last name is :" +lastName);
		
		System.out.println("Your full name is :" +firstName+ " " + lastName);
		
		/*if you do firstname with next, and give lastname with nextLine, it won't give last name result
		 * you can write firstname and lastname with nextLine or you can write firstname with nextLine
		 *  and lastname with next. Both works. or you can add just input.nextLine(); 
		 *  for the next line after write input.next();
		
		
		*/
	}

}
