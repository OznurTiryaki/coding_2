package day15_March23;

import java.util.Scanner;

public class ChracterToNumber {

	public static void main(String[] args) {
		
		char c1 = 'A';
		
		int cNum =c1;

		System.out.println(cNum);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name= scan.next();
		
		char firstCharacter = name.charAt(0);
		char lastCharacter = name.charAt(name.length()-1);
		
		System.out.println(firstCharacter +" " +lastCharacter);
		
		int firstCharacterNumber = firstCharacter ;
		
		System.out.println( firstCharacterNumber);
		
		int lastCharacterNumber = lastCharacter ;
		
		System.out.println( lastCharacterNumber);
		
		
		
	
//		String first = "Francesqua"; 
//		char last = first.charAt(first.length()-1);
//		
//		char fChar =first.charAt(0);
//		
//		int lastCharNum = last ; 
//		System.out.println(lastCharNum);
//		
//		int firstCharNum = fChar ; 
//		System.out.println(firstCharNum);
//		
//		char character0 = '0' ;  
//		int zeroAsciiNumber = character0 ; 
//		System.out.println(zeroAsciiNumber);
//		
//		char characterA = 'A' ;
//		System.out.println(   (int) characterA    );
//		
//		
//		System.out.println( fChar + lastCharNum );
		
	}

}
