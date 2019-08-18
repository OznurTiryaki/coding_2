package day4;

public class Task4 {

	public static void main(String[] args) {
		
		//ARITMETIC OPERATORS
		
		/*task
		 
		 * Create 2 double variable num1, num2   assign value to the variable 
		 * create 2 more double variable additionResult , substractionResult
		 * 
		 * print two statement in your console 
		 * 	the result of addition is --> your result 
		 *  the result of subtraction  is -- you result 
		 
		 * 
		 * */
		
		double num1 = 12.5;

		double num2 = 22.4;

		double addition = num1 + num2;
		
		double subtraction = num1 - num2;
		 
		double division = num1 / num2;
		
		double multiplication = num1 * num2;
		
		double remainder = num1 % num2;
		
		

		System.out.println("the result of addition is " + addition);
		
		System.out.println("the result of subtraction is " + subtraction); 
		
		System.out.println("the result of division is " + division);
		
		System.out.println("the result of  multiplication is " + multiplication);
		
		System.out.println("the result of  remainder is " + remainder);
		
		System.out.println(addition + "," + subtraction+ "," + division+ "\n" + multiplication + "," + remainder);
		
		//\n alt satira gecmesini sagliyor printin
		
		
		
		/*
		System.out.println("the result of addition is " + num1 + num2); seklinde yazarsak num1 ve num2
		degerlerini toplamak yerine sadece yan yana yazar 
		like ---the result of addition is 12.522.4
		
		
		System.out.println("the result of addition is " + (num1 + num2)); parantez icinde yazarsak 
		degeri toplayip oyle verir
		
		like---the result of addition is 34.9

		*/
		
		System.out.println("the result of addition is " + num1 + num2);
		
		System.out.println("the result of addition is " + (num1 + num2));
		
		
		
		

	}

}
