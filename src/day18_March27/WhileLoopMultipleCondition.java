package day18_March27;

import java.util.Scanner;

public class WhileLoopMultipleCondition {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);

		//create dynamic counter program
		
		//if use enter 5----1 2 3 4 5
		//if user enter 7 ----- 1 2 3 4 5 6 7
		
		
		System.out.println("Enter your target number");
		
		int number = scan.nextInt();
	
		int a=1;
		
		while( a <= number ) {
		
			System.out.print(a + " ");
			a++;
	}
	//	System.out.println("The"); boyle yaparsan printten sonra tekra same line da kalir
	//	System.out.println("End"); // bir usteki prinln oldugu icin asagiya gecer
	}
}

