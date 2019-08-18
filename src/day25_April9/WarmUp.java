package day25_April9;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
	
		// create an array of int with capacity of 50 
		
				
		int nums [] = new int [50];
		
		for(int x =0 ; x< nums.length ; x++) {
			nums[x] = x+1; //bu sekilde tum numaralari yazdirdik , 
			               //tek  tek gormedik sifirdan basladigi icin +1 ekleyerek ilerledik
		}
			System.out.println(Arrays.toString(nums));   //direk Array olarak yazdirdi
			
		    // create another array of int with capacity of 50 
		    // store even numbers from 0-100 inside
		    // print them out 
		    
		    
		    
		    int[] evenNumbers = new int[51] ; 
		    for (int i = 0; i <=50 ; i++) {  //51 yazdik cunku  100 u de icine katmak istiyoruz.
		      evenNumbers[i] = i * 2 ;  //ikiyle carpacagimiz icin yarisini yaziyoruz.
		    }
		    System.out.println( Arrays.toString(evenNumbers)  );

		    
		    
		        
		}
	}


