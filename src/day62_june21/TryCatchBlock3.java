package day62_june21;

import java.util.Scanner;

public class TryCatchBlock3 {

	public static void main(String[] args) {
		
System.out.println( "Beginning of the code " );
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter string with at least 2 character : ");
		
		String input = scan.nextLine(); 
		int targetIndex = scan.nextInt(); 
		
		// access 2nd character
		try {
			System.out.println("try begin");
			System.out.println("your second character is " +  input.charAt( targetIndex ) );
			System.out.println("try END");
			
		//}catch(StringIndexOutOfBoundsException siob) {
			  // StringIndexOutOfBoundsException siob = new StringIndexOutOfBoundsException() ; 
		// NullPointerException CATCH Block can only catch NullPointerException object 
		}catch(NullPointerException npe) {
				//NullPointerException npe = new StringIndexOutOfBoundsException() ;
				
			System.out.println("Enter correct index");
		} 
		
		
		System.out.println( "Ending of the code " );
		
		

	}

}
