package day16_March24;

import java.util.Scanner;

public class StarthWith {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		
		String word= scan.next();
		
//		 char first = word.charAt(0);
//		 char last = word.charAt(word.length()-1);
//		 
//		 System.out.println ("first letter :" + first);
//		 System.out.println ("last letter :" + last);
//		 
//		 if (first == 'A' && last == 'x') {
//			 
//			 System.out.println("first letter is A, last letter is x");
//		 }
//		 
//		 System.out.println(word.lastIndexOf("a"));
		 
		 //or we can do 
		 
		boolean bool1=word.startsWith ("a");
		 
		boolean bool2 = word.endsWith("x");
		 
		 if (bool1==true && bool2 ==true) {
			 
			 System.out.println("the name matches");
		 }else {
			 System.out.println("the name not matches");
		 }
		 System.out.println(word.lastIndexOf("a"));   //if you have any a in name turn as -1
		 
		 int count = word.length();
		 
		 if (count >2) {
			 
			 if (count %2 == 1) {
				 
			 System.out.println(word.charAt(count/2));
		 }else {
			 
			 int midIndex =count/2 ;
			 char midR =word.charAt(midIndex);
			 char midL=word.charAt(midIndex-1);
			 System.out.println(""+midL+midR);
			 
		 }
	}
	}
}