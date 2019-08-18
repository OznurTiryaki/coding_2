package day9_March_12;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// Shoes Size between 6-12
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your shoes number");
	
		double shoesNumber = scan.nextDouble();
		
		
		if (shoesNumber > 12)     {  //bununla (shoesNumber >6) 'un yerini degistirseydik logical hata olacakti cunku o zamn 13 den 
		                             //sayilari da hesaplardi.
			System.out.println("Sorry we dont have big size");
			
		}else if (shoesNumber >6) {
			
			System.out.println("We have this size in our stock");
		
		} else 
		
		System.out.println("We don't have smaller than 6");

		
	}
	

}
