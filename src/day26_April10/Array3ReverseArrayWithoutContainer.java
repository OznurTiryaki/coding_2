package day26_April10;

import java.util.Arrays;

public class Array3ReverseArrayWithoutContainer {

	public static void main(String[] args) {
	
    //   write byself
		 int[] numbers = { 11,2,39,18,7,4,15};
		    System.out.println( Arrays.toString(numbers) );
		     
		    int count = numbers.length ; 
		    int lastIndex = count -1 ; 
		    
		    for (int i = 0; i < count/2; i++) {
		
	                 numbers[i]=  numbers[i]+ numbers[lastIndex-i];
	                 numbers[lastIndex-i]= numbers[i]- numbers[lastIndex-i];
	                 numbers[i]=numbers[i]- numbers[lastIndex-i];
		    } 
		    System.out.println( Arrays.toString(numbers) );   
	                 
	                 
//		  x= x+y;
//		  y=x-y;
//		  x=x-y;

	}

}
