package day62_june21;

public class ExceptionIntro {

	public static void main(String[] args) {
		

		/*
		 * ==>>>>Exceptions are objects
		 * Throwable is class>it is like the object class but for exceptions and errors,it is the biggest class after object
		 *  throw nums;
			No exception of type int[] can be thrown; an exception type must be a subclass of Throwable	
		 * 
		 * */

		
		//ArrayIndexOutOfBoudException
		int [] nums ={1,5,6};
		//System.out.println(nums[99]);
		 
		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException();//in real life we dont do this
		//System.out.println(aib); //JVM THROWS java.lang.ArrayIndexOutOfBoundsException TO CONSOLE
		//JVM creates this to the console=> java.lang.ArrayIndexOutOfBoundsException
		
		/*
		 * Throw keyword ==>>>is used to throw ecxception manually
		 * 
		 * 
		 * */
		
		throw aib ;// ==>>> OUT PUT IS
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//		at day62Exception.ExceptionIntro.main(ExceptionIntro.java:17)
		//behind the seens an object is created and trown 
		//so we can throw any object we want?  NOOOO

		

	}

}
