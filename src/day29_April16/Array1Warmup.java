package day29_April16;

import java.util.Arrays;

public class Array1Warmup {

	public static void main(String[] args) {
		
//		Create array of 2 Dimensional String Array ,
//		the pizza has 7 slice , each slice can be finished in 3 bites ,
//		each bite has different topping as color code on the right : total 21 toppings.
//		Task 1.1 : create 2D String array to represent below scenario
//		( using any one of 3 way to create and assign value to array)
//		Task 1.2 : print out to see what’s inside using the Arrays class method
//		Task 1.3 print all the value inside using for loop
//		Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
//		Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper

		
		String[][] pizza = {{"Mushroom", "Black Olive", "Green Paper"}, 
				 {"Spinach", "Green Pepper", "Mushroom"}, 
				 {"Black Olive", "Black Olive", "Spinach"},
                 {"Mushroom", "Mushroom", "Red Pepper"},
                 {"Banana Pepper", "Spinach", "Red Pepper"},
                 {"Mushroom", "Green Pepper", "Green Pepper"},
                 {"Spinach", "Green Pepper", "Banana Pepper"}};
        
		//Task1.2
		System.out.println(Arrays.deepToString(pizza));
		
		//Task1.3
		for (int i = 0; i < pizza.length; i++) {
			for (int j = 0; j < pizza[i].length; j++) {
				
			System.out.println(pizza [i][j]);
				
			}
			
		}
		//Task 1.4
		System.out.println("***************************");
		for (int i = 0; i < pizza.length; i++) {
			
			System.out.println("SLice number: "+ (i+1));
			for (int j = 0; j < pizza[i].length; j++) {
				
				if (j==2)
				continue;
			System.out.println(pizza [i][j]);
	}
		}
		System.out.println("***************************");
		//Task 1.5
		outer:  //bununla disardaki loopu da durdurmus oluyoruz. 
		for (int i = 0; i < pizza.length; i++) {
			
			System.out.println("SLice number: "+ (i+1));
			
			for (int j = 0; j < pizza[i].length; j++) {
				
				if (pizza[i][j].equals( "Banana Pepper")) {
				break outer;
				
			}
				System.out.println(pizza [i][j]);	
	}
		
		}
	}
}
