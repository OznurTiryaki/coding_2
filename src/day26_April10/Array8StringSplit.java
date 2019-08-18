package day26_April10;

import java.util.Arrays;

public class Array8StringSplit {

	public static void main(String[] args) {
		 String shows = "Orville, Game Of Throne, X-man ,Gifted, Breaking bad" ; 
		    
		    String[] showsArray = shows.split(",") ; 
		    System.out.println(Arrays.toString(showsArray));
//		    for (int i = 0; i < showsArray.length; i++) {
//		      System.out.println(showsArray[i]);
//		    }
		    System.out.println(  showsArray[1] );
		    
		    System.out.println(  showsArray[  showsArray.length-1 ]      ); //sonuncuyu yazdir
		    
		    String[] showsArray2 = shows.split("Game Of Throne") ; // game of thrones dan bol
		    
		    for (int i = 0; i < showsArray2.length; i++) {
		      
		      System.out.println(showsArray2[i]);  //(neden yanyana ve virgulle yazdi)
		      
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  

	}

}
