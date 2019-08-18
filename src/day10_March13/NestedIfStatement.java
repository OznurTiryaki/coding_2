package day10_March13;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {
		// drink selection
		
		int typeSelection ;
		
		int drinkSelection ;
		
		double price;
		
		String drink;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose your drink type:");
		
		System.out.println("Hot drinks: 1 - Cold Drinks:2");
			
		typeSelection =scan.nextInt();
		
			
			
		if (typeSelection ==1 ) {
			
			System.out.println("Hot drinks: 1 - Tea. -2 -coffee");
			
			drinkSelection =scan.nextInt();

			if (drinkSelection ==1) {              //simdi nested yapiyoruz cunku artik drink typedan sonra drink sececegiz)
				price =2.0;
			    drink= "tea";          //variable assignment before use
			    
			    System.out.println("Tea is ready\nCarefull it is hot");
				  
			}else if (drinkSelection ==2) {  
				price =4.0;
				drink = "coffee";
				
				System.out.println("Coffee is ready\nCarefull it is hot");
				  
			}else {
				
			System.out.println("Invalid Hot Drink Selection!"); 
			}
			
			
			
		}else if (typeSelection ==2 ) {
				
				System.out.println("Cold drinks: 1 - Ice Tea. -2 - Lemonade");
				

				drinkSelection =scan.nextInt(); //tekrar scan vermemiz lazim cunku deger nestedicinde kaldi yukarda


				if (drinkSelection ==1) {              //simdi nested yapiyoruz cunku artik drink typedan sonra drink sececegiz)
					price =3.2;
				    drink= "Iced tea";          //variable assignment before use
				  
				    System.out.println("Iced Tea is ready");
				}else if (drinkSelection ==2) {  
					price =3.5;
					drink = "Lemonade";
					
					System.out.println("Lemonade is ready");
				}else {
					
				System.out.println("Invalid Cold Drink Selection!");}
		
			}else {
			
			System.out.println("Invalid  Drink Type Selection!");
			
		
			}
				
	}
		}
