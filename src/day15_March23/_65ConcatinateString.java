package day15_March23;

import java.util.Scanner;

public class _65ConcatinateString {

	public static void main(String[] args) {
//		
//		Write a program that will append two strings (word1 and word2) 
//		together (known as "concatenation") and print the result.
//		However, if the concatenation creates a double-char, 
//		then omit one of the chars, so "abc" and "cat" yields "abcat".
//
//		
		
		 Scanner scan = new Scanner(System.in);
		    
		 String word1 = scan.next();
		   
		 String word2 = scan.next();
		 
	     
	     char lastCharacter= word1.charAt(word1.length()-1) ;
	     
	     char firstCharacter= word2.charAt(0) ;

	     
	     if (lastCharacter == firstCharacter) {
	    	 
	    	 System.out.println(word1 + word2.substring(1,( word2.length())));
	    	 
	     }else {
	    	 
	    	 System.out.println(word1 + word2);
	     }
	}

}

