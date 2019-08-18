package day6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your birth year:");

		int birthYear = input.nextInt();

		int age = 2019 - birthYear;

		// should be careful, bear shouldn't ingest large fluffy dog
		// byte,short,int,long,char,float, doable,boolean

		System.out.println("Please enter byte value: ");

		byte b1 = input.nextByte();

		System.out.println("Please enter byte value" + b1);

		//short b1 = input.nextShort(); //its always give you suggestion to next
        //float b2 = input.nextFloat(); //you don't need to put f end of the number for input
		//output and come as a folat too, when you ask float/don't need f!!!
		//double b1 = input.nextDouble();
			
		System.out.println("Are you hungry? ");
		
		boolean isHungry =input.nextBoolean();
		
		System.out.println("I'm hungry " + isHungry);
		
		//boolean-you can only answer true-false
		//if not give error
		
		// or System.out.println("You are " + (2019-birthYear) + " years old.");
		// but better make a variable

		System.out.println("You are " + age + " years old.");

	}

}
