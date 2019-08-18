package day30_April17;

public class Method3NumberGame {

	public static void main(String[] args) {
		
		// Task 2 
	    /* 2.1
	     * create a static method with no return type
	     * called printTheDoubledNumber
	     * it takes 1 int as parameter
	     * and it will print out doubled number on the console
	     * 
	     * 2.2 
	     * create another static method with no return type
	     * called checkForAge 
	     * it takes 1 int age as parameter
	     * inside body , check whether the age is more than 18 
	     * if the age is more than 10 --> print adult 
	     * if not print not an adult  
	     * 
	     * */
		
		printTheDoubleNumber (3);
		checkForAge (29); 
	      int i =21;   //bu sekilde de yazabiliriz
		checkForAge (i); 
	}
	
	
	public static void printTheDoubleNumber (int number) {
		number *=2;
		
		System.out.println(number);
	
	}
	public static void checkForAge (int age) {
		if (age >18) {
			System.out.println("Adult");
		}else {
			System.out.println("NOT Adult");
		}
		
	}
}
