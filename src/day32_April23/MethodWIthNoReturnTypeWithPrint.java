package day32_April23;

public class MethodWIthNoReturnTypeWithPrint {

	public static void main(String[] args) {
		
      String name = "Aliya" ;
		
		// name.charAt(0) actually return a value so println can print out 
		System.out.println( name.charAt(0) );  //burada bir sey donuyor, o yuzden sysout ile yazabiliyoruz

		//  printSomething() does not return a value when being run 
		// but println method is expecting a value so it does not compile
	//	System.out.println(  printSomething()  );
		
		printSomething() ;  //doen not return anything, that why we cant write with sysout
		
	}
	
	public static void printSomething() {
		System.out.println("CLASS IS OVER");
	}

}
