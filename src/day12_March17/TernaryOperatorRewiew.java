package day12_March17;

import java.util.Scanner;

public class TernaryOperatorRewiew {

	public static void main(String[] args) {
		
		// any ternary operator can be turned into if else statement
		// one and only one purpose of ternary operator is conditional assignment
		
//      task check for weather equal to sunny or not
//      and assign the value of  ---if sunny assign action value to go out
//      if not assign action after the statement
		
//      print out your action after thee statement
	
//      option : try to check for multiple condition of sunny / cloudy / windy / rainy
		
		// ALWAYS USE------ str1.equal(str2)------- for String equality check
		
		 //   or 
		
		// ------weather.equalsIgnoreCase("sunny")----- to ignore case
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How is today' weather?");
		
		String weather = scan.nextLine();
		
		String action;
		
		/* if (weather.equals ("sunny") {
			
			action = "go out" ;
			
		}else {
			action = "stay home" ;
		}  */
		
		action = weather.equalsIgnoreCase("sunny") ? "go out" : "stay home";
		
		System.out.println(action);

	}

}
