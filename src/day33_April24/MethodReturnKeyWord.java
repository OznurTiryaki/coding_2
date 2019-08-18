package day33_April24;

import java.util.Scanner;

public class MethodReturnKeyWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter number: ");
		int num = scan.nextInt() ; 
		
		if(num<0) {
			// once return keyword is reached, method finish 
			//eger sifirdan daha kucuk bir sayi verirsek asagidakileri yazdirmiyor
			//eger buyuk olursa asagidakileri yazdiriyor.
			return ; 
		}

		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		
		
		

	}

}
