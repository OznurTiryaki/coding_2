package march_10;

import java.util.Scanner;

public class ConditionalStatementTask1 {

	public static void main(String[] args) {
		
		// CONDITIONAL STATEMENT-TASK 1
		
		/*  TASK 1 
	     *  IMPROVE THIS CODE WITH SCANNER 
	     *  ask user to enter the score 
	     *  then execute below conditional  program 
	     *
	     */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your score: ");
		
		int score = scan.nextInt() ; 
	    
	    System.out.println("current score is "+ score);
	    
	    
	   
	    if( score > 60 ){
	      System.out.println("YOU SHALL PASS ! ");
	    
	    }else{
	      System.out.println("YOU SHALL NOT PASS! ");
	    }
		
				
				
				

	}

}
