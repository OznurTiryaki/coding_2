package day9_March_12;

import java.util.Scanner;

public class ConditionalStatementTask1 {

	public static void main(String[] args) {
		//Create a Simple Program
		//print out wecome to Math library
		//ask user for 2 integer
		//write a simple if statement
		//if the sum of 2 numbers greater than 100
		//then print out you entered great numbers
		//else look like your sum is less than 100
		System.out.println( "Welcome to Math Library \nPlease enter 2 number");
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 +num2 >100) {
			

			System.out.println( "You entered great numbers");
		
		}else 
		
			System.out.println( "looks like your sum is less than or equal 100");
		
	}

}
