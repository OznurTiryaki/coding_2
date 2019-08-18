package day53_May29;

public class Krypton {
	 public static void main(String[] args) {
		    

	  }
	  
	//   @Override
	//   public void rotate(){
//	       System.out.println("superman's planet rotating");
	//   }

	  // this is not valid since it does not have same return type
	//  public int rotate() {
//	    System.out.println("superman's planet rotating return int");
	//  }

	  // not valid since we can not reduce access modifier visibility 
	//  protected void rotate() {
//	    System.out.println("superman's planet rotating protected");
	//  }

	  // not a overriding method 
	  // it is overloading the the rotate methods of super class
	//  protected void rotate(String x ) {
//	    System.out.println("superman's planet rotating String");
	//  }
	  
	  // static method can not hide instance method from super class 
	//  public static void rotate() {
//	    System.out.println("rotating");
	//  }
	  
	  
	  // instance method can not override static method 
	//  public int rotate(int d, int y) {
//	    System.out.println("rotating d with return  ");
//	    return 5 ; 
	//  }
	  
	  // THIS IS A VALID HIDING OF STATIC METHOD 
	  public static int rotate(int d, int y) {
	    System.out.println("super man is rotating d with return  ");
	    return 105 ; 
	  }

	  
	  // these are inherited methods 
	//  public void rotate() {
//	    System.out.println("rotating");
	//  }
	//  
	//  public void rotate(int d) {
//	    System.out.println("rotating d ");
	//  }
	//  public static int rotate(int d, int y) {
//	    System.out.println("rotating d with return  ");
//	    return 5 ; 
	//  }
	  

	}