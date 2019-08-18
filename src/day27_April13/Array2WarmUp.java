package day27_April13;

import java.util.Arrays;

public class Array2WarmUp {

	public static void main(String[] args) {
//Task 2 :

//		use the method your learned to get each words
//		and store it into String array: 
	//
//		loop through each items -- 
//		  in each iteratrion loop : 
//		  	 turn each word into char array 
//		  	 print each char out with seperated by -
//		output : 
//			C-y-b-e-r-t-e-k-
//			B-a-t-c-h-
//			S-p-a-r-t-a-n-
//			i-s-
//			m-o-s-t-
//			h-a-r-d-w-o-r-k-i-n-g-
//			o-n-e-
//			e-v-e-r-
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String words= "";
		
		 String [] splitted = str.split(" ");  //kelimelere ayiriyor
		System.out.println(Arrays.toString (splitted));   // Array icinde ayri ayri yazmayi sagliyor.
		
	     for ( int x = 0; x <splitted.length ; x++) {    
		words = splitted[x];
		//System.out.println(words);
		
	  
		 
		char[] myChars = words.toCharArray(); //yani icindeki kelimeleri yaz diyoruz 
		   for (int y = 0 ; y <myChars.length ; y++) {   //char array icinden cikarmak icin yine loop kullaniyoruz
		System.out.print(myChars [y] + "-");
			
	}
		System.out.println();
	}
	     
//	    //second way 
//	     String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//		 String[] str2 = str.split(" ");
//		 char[] nameChars = str.toCharArray(); 
//		 String store = " ";
//			    
////			    for (int i = 0; i < nameChars.length; i++) {
////			    	store = nameChars[i] + "-";
////
////			      System.out.println
////			      (store);
////			      
////			    }
//		 for(int k =0 ; k<str2.length; k++) {
//			  System.out.print(" "); 
//			    
//			    for (int j = str2[k].length()-1; j >=0; j--) {
//			    	store =store + str2[k].charAt(j);
//	    	
// }
//			   store += " " ; 
//			  
//		 }  
//		 System.out.print(store);	
	}

}
