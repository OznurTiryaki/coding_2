package day11_March16;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan= new Scanner(System.in);
		
		String result;
		
		System.out.println("Enter your score:");
		
		int score = scan.nextInt();
		
		if (score>75) {
		   result = "pass" ;
		}else {
			result = "fail";
		
			System.out.println("result is " + result);
			
					
		}
	}

}
