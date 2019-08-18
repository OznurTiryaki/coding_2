package day35_April28;

import java.util.Arrays;

public class _5MethodOverloading {

	public static void main(String[] args) {
		 /*passing 123 as argument for the method 
	     * that have one int parameter 
	     * 
	     * 
	     * method signature ---> 
	     *       method name + parameter list 
	     * */
	    
	    // 123 is argument 
	    //doSomething(123);
	    //doSomething();
	    
	    String name = "Barry";
	    char[] nameChars = name.toCharArray();     
	    System.out.println(Arrays.toString(nameChars)  );
	    
	    // getting a each char as String array 
	    String[] nameCharsStr = name.split(""); 
	    System.out.println(Arrays.toString(nameCharsStr)  );
	    
	    Arrays.sort(nameCharsStr);
	    System.out.println(Arrays.toString(nameCharsStr)  );
	    
	  }
	  
	  
	//  public static int doSomething(int x) {
//	    System.out.println("do something 2");
//	    return 0 ;
	//  }              
	                 // method parameter
	  public static void doSomething(int y ) {
	    System.out.println("do something 2");
	  }
	  
	  
	  public static void doSomething() {
	    System.out.println("do something  234142");
	  }
	  

	}
