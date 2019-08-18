package day6;

import java.util.Scanner;

public class Task3 {
	
	//TAKE INPUT AS A NUMBER OR WORD

	public static void main(String[] args) {
		

         Scanner input = new Scanner(System.in);
		
         System.out.println("Please enter your name :");
		
         String name = input.next(); //String for name
		
         System.out.println("Please enter your age :");
        
         //save user input into int
         
         int age = input.nextInt(); 
		
		System.out.println("Your name is " + name + "\nYou are " + age + " years old.");
	
		
		

	}

}
