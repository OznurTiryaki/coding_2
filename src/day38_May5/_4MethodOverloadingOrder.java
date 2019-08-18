package day38_May5;

public class _4MethodOverloadingOrder {

	public static void main(String[] args) {
		/*
		 * 
		METHOD OVERLOADING SELECTION ORDER 
		
		1, IT WILL ALWAYS LOOK FOR EXACT MATCH 
		
		2, IT WILL LOOK FOR LARGER PRIMITIVE TYPES 
		
		3, IT WILL LOOK FOR WRAPPER TYPE 
		
		4, VAR ARG 
		 * */
	 
		doSomething(10);
		    
	  }

	//  public static void doSomething(int x) {
//	    System.out.println( "doSomething(int x)" );
	//  }

	//  public static void doSomething(long x) {
//	    System.out.println( "doSomething(long x)" );
	//  }

	//  public static void doSomething(Integer x) {
//	    System.out.println( "doSomething(Integer x)" );
	//  }

	  public static void doSomething(int... x) {
	    System.out.println( "doSomething(int... x)" );
	  }

	}
