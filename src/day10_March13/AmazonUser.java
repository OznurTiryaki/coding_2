package day10_March13;

import java.util.Scanner;

public class AmazonUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Welcome to Amazon Shopping App!");
		
        System.out.println("Enter your purchase price");
		
		double userPrice = scan.nextDouble();
		
		System.out.println("Are you prime member?");
		
		boolean primeMember=scan.nextBoolean();
		
		if (primeMember == true ){ //(primeMember == true ---> bunun yerine sadece (primeMemeber'da yazabilirsin
		
		System.out.println("You are able to choose free shipping");
		
		} else if (userPrice > 35) { //you dont have to write primeMember == false again
		
		System.out.println("You are able to choose free shipping");
		
   
	    }else {                       
	    	
	    	userPrice +=5 ;
	    
	    	System.out.println("You gotta pay 5 $ shipping "+ userPrice );
	    		 
	    	
	     //OR
	    			
	    			//System.out.println("YOU gotta pay 5 $ shipping "+ (userPrice +5)) ;
	      //System.out.println("you may also consider joining prime to "
	         // + "avoid shipping fee");
	      //burada sadece 14.05 olarak yaziyor toplama yapmasi icin bir kere daha paranteze aldik
	      
}
}
}