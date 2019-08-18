package day38_May5;

public class _1MethodOverloading {

	public static void main(String[] args) {
		
		doSomething();
	    doSomething(100);  //if we close int method it print long one because make a casting
	    doSomething(100L); //if we close the long method not compile 
	     //int not fit in int container
		
	    //eger int i kapatirsak double a mi yoksa long a mi gider,
	    //100de 100L de long a gider cunku closest one 
	    /*
		 * 
		METHOD OVERLOADING SELECTION ORDER 
		
		1, IT WILL ALWAYS LOOK FOR EXACT MATCH 
		
		2, IT WILL LOOK FOR LARGER PRIMITIVE TYPES 
		
		3, IT WILL LOOK FOR WRAPPER TYPE 
		
		4, VAR ARG 
		 * */
	  }
	  
	  public static void doSomething() {
	    System.out.println( "doSomething()" );
	  }
	  
	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	  
	  public static void doSomething(long x) {
	    System.out.println( "doSomething(long x)" );
	  }
	  
	  public static void doSomething(double x) {
		    System.out.println( "doSomething(double x)" );
		  }
}
	  