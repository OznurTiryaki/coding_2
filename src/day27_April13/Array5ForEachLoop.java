package day27_April13;

import java.util.Scanner;

public class Array5ForEachLoop {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner (System.in);
		
		String word = scan.nextLine();
		
		char [] ch =  word.toCharArray() ;  //aldigin Stringi char'a ceviriyorsun
		
		for(char each : ch) {               //charin icindekilerin hepsini tek tek yazdiriyorsun
			System.out.print(each+"-");
		}
		System.out.println();
		
		//Ask use for split it to get each word   
		
		String [] splitted = word.split("");  // veya String array icine alip split'le stringi arraya ceviriyorsun
		                                      //tirnaklar arasi bosluk olmadigi icin karakter karakter ayiriyor
		for (String each1: splitted) { 
			System.out.print(each1+ "-");
		}
		System.out.println();
		
		
	}

}
