
package day6 ;

import java.util.Scanner;



public class Task2 {

	public static void main(String[] args) {
		
		// WARM UP-SCANNER CLASS
		
		Scanner input = new Scanner(System.in);
		
		//SHORTCUT FOR IMPORT---COMMAND+SHIFT+O
		
		// BE CAREFUL DON'T CREATE A CLASSROOM NAME CALL "SCANNER" 
		//IT GET CONFUSED YOUR CLASS SCANNER OR SCANNER WHICH YOU TAKE IMPORT
		
		
	//ask your question
		
		System.out.println("Enter your mood today :");
		
	//Save user	input into String
		
		String mood = input.next();
		
	//output something meaningful	
		
		System.out.println("Your mood is " + mood + " today");
		
	//ask mood
		
		System.out.println("Enter your location today :");
		
		String location = input.next();
		
		System.out.println("Your location is " + location);
		
		System.out.println("Please enter your age :");
		
		//close scanner
		
		//input.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
