package day26_April10;

import java.util.Arrays;
import java.util.Scanner;

public class Array2ReverseAnArray {

	public static void main(String[] args) {
	 //interview Questions
		
// reverse this array so the value of numbers array
// will be in reverse order
		
		/// reverse this array so the value of numbers array    
	    //  will be in reverse order
	    
	   // int[] numbers = { 11,2,39,18,7,4,15};
		
	   Scanner scan= new Scanner(System.in);
	   int[] numbers = { scan.nextInt(), scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(), scan.nextInt()};
	   
			   
	   
	    System.out.println( Arrays.toString(numbers) );
	     
	    int count = numbers.length ; // how many int in array
	    
	    int lastIndex = count -1 ;   // last index is length -1 bu yuzden count -1 dedik
	    
	    for (int i = 0; i < count/2; i++) {   //if we take a half and make a swap, we can make reverse otomaticaly
	      
	       int temp = numbers[i] ; //ilk i 0 ve sonununcu swap edecegiz, sonra loop devam edecek yarisina kadar 
	       numbers[i] =  numbers[lastIndex - i] ; 
	       numbers[lastIndex-i] = temp ;  
	      
	    }
	    
//	    int temp ; 
//	     temp = numbers[0] ; 
//	     numbers[0] =  numbers[5] ; 
//	     numbers[5] = temp ;  
	//    
//	     temp = numbers[1] ; 
//	     numbers[1] =  numbers[5-1] ; 
//	     numbers[5-1] = temp ;  
	//    
//	     temp = numbers[2] ; 
//	     numbers[2] =  numbers[5-2] ; 
//	     numbers[5-2] = temp ;  
	//    
//	     
//	     
	     
	     
	     System.out.println( Arrays.toString(numbers) );
	     
	     
	     

	  }

	}


		
