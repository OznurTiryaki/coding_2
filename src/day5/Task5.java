package day5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		// SCANNER CLASS- STRING
		
		//Create a Scanner object
	
		Scanner userInput = new Scanner(System.in); 
		
		//after that it give you attention
		//go there and choose import java.util.Scanner; automatically

        //ask user question/input
		
		System.out.println ("Please enter your name: ");
		
		String name = userInput.next() ; //next give us one word, next.Line more than one word
		
        //print what user input
      
        System.out.println ("You have entered : " + name);
		
		
	}
	

}
