package day13_march19;

import java.util.Scanner;

public class FindTheLength55 {

	public static void main(String[] args) {
		
		
//		Write a program that will output length of the text (string).
//		Example:
//			Display message: "Please enter the text:"
//			input: java
//			Display message: "Length is: 4"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the text:");
		
		String text = scan.next();
	
		System.out.println("Length is: " + text.length() );
	}

}
