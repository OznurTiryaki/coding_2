package march_9;

import java.util.Scanner;

public class TimingInput {

		  public static void main(String[] args) {
		    
			  //1. WRITE YOUR CODE HERE:
		     
		     Scanner sc = new Scanner(System.in);
		    
		    
		    
		    //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES 
		    
		    
		    
		    //#############################
		    
		     //2. WRITE YOUR CODE HERE:
		     
		    
		    System.out.println("Please enter your time: ");
		    
		    int hour;
		    int minute; 
		    int second;
		    String amOrPm;
		    
		    
		    hour   = sc.nextInt();
		    
		    minute = sc.nextInt();
		    
		    second = sc.nextInt();
		    
		    amOrPm = sc.next();
		    
		     
		     System.out.println(hour+":"+ minute +":"+second +" "+ amOrPm);
		
		
		
		
		
		
		
	}

}
