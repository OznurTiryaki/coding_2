package day25_April9;

import java.util.Arrays;

public class Array1StringArray {

	public static void main(String[] args) {
		

//		create an string array of capacity 4
//		put your favorite movie/show
//		
//		first use the loop to print them out
//		
//		print the length of all items
//		
//		get the max length movie title
//		
		
		String [] movies= new String [4] ;
		
		movies [0] =  "eskiya" ;  //tirnak iclerindeki bosluk bile sayiliyor dikat et
		movies [1] = "yolayrimi";
		movies [2] = "vizontele" ;
		movies [3] = "hukumet";
		//count how many item we have in array		
		System.out.println(movies.length);  //ne kadar kapasitesi var onu buluyoruz.
		
		System.out.println(Arrays.toString(movies)); 
		
		//we are using the length method with parenthesis
		System.out.println(movies[0].length());  // notice this with parenthesis burada 1'nin kac karekter oldugunu buluyoruz.
		                                         // bunu loop icinde yazarsan hepsininkini tek tek yazdirir. 
		
		
		for (int x =0 ;  x <movies.length-1 ; x ++) {  // i <movies.length  or  i <= movies.length -1
			
			System.out.println(movies[x] + " char count is: " + movies [x].length());
		}
		
		int max = movies[0].length();   //first we say the first movie is max than start to compare with others
		
		for (int i = 1; i < movies.length; i++) {
			
			if( movies[i].length() > max ) {
				max = movies[i].length() ; 
			}
			
		}
		System.out.println(max);
		
		
		
		
	}

}
