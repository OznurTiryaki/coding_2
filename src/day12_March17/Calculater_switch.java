package day12_March17;

import java.util.Scanner;

public class Calculater_switch {

	public static void main(String[] args) {
		
//		ask 2 number from user
//		ask the operation from the user
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		
		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
		
		
		System.out.println("Enter Operator + , - , * , /");
		
		String operator = scan.next();

		
//		if (operator.contentEquals( "+")) {    //buradaki toplama degilde griln deger arti ise anlaminda
//		
//		System.out.println("the result is" + (num1 +num2));
//		
//		}else if (operator.contentEquals("-")) {
//			
//			System.out.println("the result is" + (num1 +-num2));
//       
//		}else if (operator.contentEquals("*")) {
//			
//			System.out.println("the result is" + (num1 * num2));
//		 
//		}else if (operator.contentEquals("/")) {
//				
//			System.out.println("the result is" + (num1 / num2));	
//				 
//		}else{
//		      System.out.println("INVALID OPERATOR!");
//		    }
		     
		switch (operator) { //switch (operator.toLowerCase()  ) { kullanmak icin boyle yapabiliriz

		case "+":

			System.out.println("the addition is " + (num1 +num2));
			break;     //breakleri koymazsan cevabi buldugu yerden itibaren herseyi yazdirir.
		
		case "-":

			System.out.println("the substraction is " + (num1 - num2));
			break;
		
		case "*":

			System.out.println("the multiplication is " + (num1 * num2));
			break;
		
		case "/":

			System.out.println("the division is " + (num1 / num2));
			break;
		
		default:

			System.out.println("INVALID OPERATOR!");
			break;
		}	
		
	}

}
