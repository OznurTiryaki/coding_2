package day19_March30;

import java.util.Scanner;

public class ReverseYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name= scan.next();
		
		int count= name.length();
		
		while (count > 0) {
			
			System.out.print(name.charAt(count-1) + " "); //son harften geriye dogru yazdir
			count --;
			
			
		}
		
	}

}
