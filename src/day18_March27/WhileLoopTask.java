package day18_March27;

import java.util.Scanner;

public class WhileLoopTask {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner(System.in);
		
		
		int x = 0  ; 
		// 
		// ask user to enter 5 $ bill or 10 $ bill 
		// if user enter something else keep asking 
		
		// AS LONG AS i don't get 5 or 10 I keep asking 
	
		
		while ( x!=5 && x!=10  ) {
		//while(  !(x==5 || x==10)     ) {
			
			System.out.println("Enter 5$ or 10$ ");
			x = scan.nextInt(); 
			
		}
		System.out.println("END OF LOOP");
		
		
		
	}

}
