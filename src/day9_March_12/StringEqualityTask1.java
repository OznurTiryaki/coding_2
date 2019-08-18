package day9_March_12;

import java.util.Scanner;

public class StringEqualityTask1 {

	public static void main(String[] args) {
		// first create a scanner
		//ask question for scanner
		//later write your expected name

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = scan.next();
		
		boolean expextedName = name.equals("Oznur");
		
		
		System.out.println(expextedName);
		
		//if (expextedName){ seklinde de yazabilirsin
		if(name.equals("Oznur")){
		
		System.out.println("That's my name!");
		
		}else {
			
		System.out.println("That's not  my name!");
		
	}

}
}