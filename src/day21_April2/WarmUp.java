package day21_April2;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// WARM UP

//		ASK USER TWO NUMBER
//
//		KEEP ASKING UNTIL THE SUM OF
//		TWO NUMBERS ARE MORE THAN 100
//
//		PTINT THE END AFTER THE LOOP
//
//		OPTIONAL : 3 ATTEMPS ONLY

		
		Scanner scan= new Scanner(System.in);
		
		int sum=0;
		int count =0;
		do{
			System.out.println("enter two numbers");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		sum= num1+num2;
		count ++;
		
		if (count==3) {
			System.out.println("you cannot try more than 3");
			break;
			
		}
		} while(sum<=100 );
		
		System.out.println("Loop Done");
	}

}
