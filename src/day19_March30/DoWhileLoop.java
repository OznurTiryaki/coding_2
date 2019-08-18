package day19_March30;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		    
		    // while loop 
		    // do while 
		    // for loop  // for each loop 
		    
//		    int x = 1 ; 
//		    while(x<6) {
//		      System.out.println( x++ );
//		    }
		    /*
		     *do {
		       action to be repeated
		       } while (a condition is true );
		     * 
		     * COMPARE TO WHILE LOOP 
		     * Do while loop 
		     * check the condition after the first iteration 
		     * 
		     * */
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("what is the target");
		    
		    int target = scan.nextInt();
		    
		    
		    
		    
		    /*  task 5 
		     * count from 1 - 100 in same line 
		     * */
		    /*  count from 100 - 1 in same line  
		     * 
		     * */
		    
		    int y = 1 ; 
		    do {
		      
		      System.out.print(y++  + " ");
		      
		    }while(y<= 5) ;
		    
		    System.out.println();
		    
		    System.out.println("y value: " + y);
		    do {
		      System.out.print( --y + " ");
		    } while ( y > 1);
		    
		    
		  }

		}


	