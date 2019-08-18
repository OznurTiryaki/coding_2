package day27_April13;

import java.util.Scanner;

public class Array6ForEach {

	public static void main(String[] args) {
	


		    
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter a sentence");
		    String sentence = scan.nextLine();     //input aldik
		    String[] words =  sentence.split(" ");   //stringi arraya cevirmek icin split kullaniyoruz
		    
		    for(String eachWord : words) {   //for each loop ile kelimeleri Stringe ceviriyoruz
		      
		      //System.out.println(eachWord);       //yazdirirsak ayri ayri kelimeleri gormus oluruz
//		      String word = "Break time" ; 
		      char[] wordChars = eachWord.toCharArray();   //simdide nasil stringi bolduysek charlara bolucez.
		                                                   // kelimelerin characterlerini almak icin charArray metodu kullaniliyor
		      for (char c : wordChars) {                  // characterleri arrayin incinden for loop ile cikarip yazdiriyor
		    	                                           // nested kullandigimiz icin once bir kelimeyi aliyor, char olarak ayiriyor ve 
		    	                                           //diger kelimeye geciyor
		        System.out.print( c + "-");
		      }
		      System.out.println();
		    
		    }
		    

	}

}
