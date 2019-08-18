package day62_june21;

import java.util.Scanner;

public class TryCatchBlock {
  
	public static void main(String[] args) {
		 
		
		 System.out.println( "Beginning of the code " );
		    
		    Scanner scanner = new Scanner(System.in); 
		    
		    // Try catch block is used wrap up a piece of code that aniticipated to throw certain type of exception 
		    // and catch the exception that happen if it happen 
		    // and and either try to recover from it or just report it 
		    // so the program does not shutdown and continue to execute 
		    
		    
		    // write a piece of code that 
		    // you anticipate to throw ArrayIndexOutOfBoundsException
		    // and put it under try catch block so it does not shutdown when it happen 
		    
		    
		    
		    
		    
		    System.out.println( "Beginning of the code " );
		    try {
		    
		      System.out.println("Enter num1 : ");
		      int num1 = scanner.nextInt(); 
		      System.out.println("Enter num2 : ");
		      int num2 = scanner.nextInt(); 
		      
		      System.out.println( "Division result is "  + num1/num2 );// 6/0 exception
		      System.out.println("axavxhsv");//DEADCODE/UNREACHEABLE
		      
		    // we are specifically trying catch ArithmeticException if it happen 
		    }catch (ArithmeticException e ) {  //  new ArithmeticException(); 
		   // }catch (Exception e ) { 
		    //}catch (Throwable e ) { 
		      
		      System.out.println(" You INPUT 0 for second number");
		      
		    }
		    System.out.println( "Ending of the code " );
		    
	}
}