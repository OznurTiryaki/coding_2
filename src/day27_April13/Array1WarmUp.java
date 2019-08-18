package day27_April13;

import java.util.Arrays;
import java.util.Random;

public class Array1WarmUp {

	public static void main(String[] args) {
		

		//Task1 : 
//		create an array of int with 5 items , return true if all items are more than 10
//		return false if not
//
//	//Task 2 :
//	given : 
//	String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//	use the method your learned to get each words
//	and store it into String array: 
//
//	loop through each items -- 
//	  in each iteratrion loop : 
//	  	 turn each word into char array 
//	  	 print each char out with seperated by -
//	output : 
//		C-y-b-e-r-t-e-k-
//		B-a-t-c-h-
//		S-p-a-r-t-a-n-
//		i-s-
//		m-o-s-t-
//		h-a-r-d-w-o-r-k-i-n-g-
//		o-n-e-
//		e-v-e-r-
//
//	// Optional : Reverse each word in sentence
//	your output should be 
//	ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 

		Random rand = new Random ();
		boolean b= true;
		int [] nums= new int [5];
		
		for ( int x = 0; x <nums.length; x++) {
			
			nums[x]= rand.nextInt(100);
			System.out.println(nums[x]);
			if (nums[x] <10 ){
				b=false;
				break;
			}
			
		}
		System.out.println(b);
		
		}
		}
		
	



