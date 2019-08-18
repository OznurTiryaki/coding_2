package day38_May5;

public class _3MethodOverloadingVArArgs {

	public static void main(String[] args) {

	    doSomething(4,3,4,5,6,7,8,9,0,0,1);
	    doSomething(4,3,1);
	    doSomething(4,3,4,5);
	    
	    doSomething(5);   //now its go exact match
	    doSomething(5,10);   //go var arg
	    
	  }
	  
	  
//	  public static void doSomething(int x) {
//	    System.out.println( "doSomething(int x)" );
//	  }
//	  
	  public static void doSomething(int x,int y) {
	    System.out.println( "doSomething(int x,int y)" );
	  }
	  
	  
	  public static void doSomething(int... x) {
	    System.out.println( "doSomething(int.. x)" );
	  }
	  

	}
