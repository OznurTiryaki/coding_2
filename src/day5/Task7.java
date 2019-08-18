package day5;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
	
		// SCANNER HOMEWORK
		
  Scanner input = new Scanner(System.in);
   
  System.out.println("Please enter your name: ");
   
   String firstName = input.nextLine();

   System.out.println("Please enter your lastname: ");	   
		   
   String lastName = input.nextLine();  
	
   System.out.println("Please enter your age: ");	  
   
   String age = input.nextLine();
   
   System.out.println("Please enter your city: ");	 
   
   String city = input.nextLine();
   
   System.out.println("Please enter your nationality: ");	 
   
   String nationality = input.nextLine();
   
   System.out.println("Please enter your pets number: ");	 
   
   String pets = input.nextLine();
   
   System.out.println("Please enter your pets name: ");	 
   
   String petsName = input.nextLine();
   
   System.out.println("Your name is " + firstName +" " + lastName +"."+ " You are "+
   age + " years old." +"\n"+ "You live in "+ city + "." + " You are " + nationality +
		   ". You have " + pets + " pets. " + "Their names are " + petsName + "."
		   );
   
   
   
	}

}
