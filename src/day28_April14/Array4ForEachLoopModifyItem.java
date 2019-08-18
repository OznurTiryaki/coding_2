package day28_April14;

import java.util.Arrays;

public class Array4ForEachLoopModifyItem {

	public static void main(String[] args) {
		
		//INTERRWIEW QUESTIONSSSSSS/OCA QUESTIONS

		// for each loop should never to be used to modify array items
	    
	    int a = 10 ; 
	    int b = a ; 
	    b = 20; 
	    
	    System.out.println(a);
	    
	    int[] arr = {1,2,4,6,3} ; 
	    
	    for (int k = 0; k < arr.length; k++) {
	      
	      int eachItem = arr[k] ; 
	      eachItem = 20 ; 
	      
	    }
	    System.out.println(Arrays.toString(arr));
	    
	    for (int eachItem : arr) {
	      eachItem = 20 ; 
//	      System.out.println(eachItem); ayrica assign yapiyoruz o yuzden, degisir ama arr ayni kalir
	    }
	    System.out.println(Arrays.toString(arr));
	   
	    
	  }

	}


