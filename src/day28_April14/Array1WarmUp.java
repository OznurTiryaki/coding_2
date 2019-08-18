package day28_April14;

import java.util.Arrays;

public class Array1WarmUp {

	public static void main(String[] args) {
	
		 String str = "Sunday Perfect Day to start coding" ; 
		    // coding start to Day Perfect Sunday
		 
		
		 
		 String [] splitted = str.split(" ");
		 
		 System.out.println(Arrays.toString(splitted));
		 		
		for (int i = splitted.length-1 ; i > 0 ;  i--) {
		//	System.out.print(splitted [i] + "-");
			
		}
		 String newStr="" ;
		 
		int lastIndex= splitted.length-1;
		
        for (int j =0 ; j < splitted.length/2 ; j++) {
    	 
    	System.out.println(splitted[j]);
    	  
    	  String temp= splitted[j];
    	  splitted[j]= splitted[lastIndex-j];
    	  splitted[lastIndex-j]=temp;
     }
        System.out.println(Arrays.toString(splitted));
        
        
//       AKBAR"S CODE 
//        String str = "Sunday Perfect Day to start coding" ; 
//        // Reverse above sentence to generate below  
//        // coding start to Day Perfect Sunday
//        String[] strArr = str.split(" "); 
//        
//        for (int i = strArr.length-1 ; i >= 0 ; i--) {
//        
//          //System.out.print(strArr[i] + "-");
//        
//        }
//        
//        String strRev = "" ; 
//        int lastIndex = strArr.length-1 ; 
//        
//        for (int i = 0; i < strArr.length/2; i++) {
//          //System.out.print(strArr[i] );
//          String temp = strArr[i] ;
//          strArr[i] = strArr[lastIndex - i] ; 
//          strArr[lastIndex - i] = temp ;      
//        }
//        System.out.println(  Arrays.toString(strArr));
//        
//        
//        // Optional : reverse word + reverse each char of the words
//        
//        
//      }
//
//    }
	}

}
