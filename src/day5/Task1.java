package day5;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * 1 Cucumber is 2.5 dollars 
		 * 4 Tomatoes are 12 dollars 
		 * 2 Onion is 3 dollars 
		 * Pepper is 2 dollars 
		 * 6 Carrot is 24 dollars
		 */
		double cucumberPrice = 2.5;
		int tomatoes = 3;
		double onion = 1.5;
		int pepper = 2;
		int carrot = 4;

		// actually we dont need to put parenthesis  for multiplication or division or
		// module. it just need add
		// because it will confuse with other plus

		// dollars yazmak yerine " $ " de yazabilirsin

		System.out.println("1 cucumber is " + cucumberPrice);
		System.out.println("4 tomatoes are " + (4 * tomatoes) + " dollars");
		System.out.println("2 onion is " + (onion * 2) + " dollars");
		System.out.println("1 pepper is " + pepper + " dollars");
		System.out.println("6 carrot is " + (6 * carrot) + " dollars");
		
		/*System.out.println("1 cucumber,4 tomatoes, 2 onions, 1 pepper, 6 carrots total price is  " + CucumberPrice 
		+ 6 * Carrot + 4 * Tomatoes+ Onion * 2 + Pepper+ "$"); or */
 double totalPrice =  cucumberPrice + 4 * tomatoes + 2* onion + pepper + 6 * carrot;
		
		 System.out.println("Total price is " + totalPrice);
		
		
	}

}
