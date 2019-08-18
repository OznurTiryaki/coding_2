package day35_April28;

public class _3MethodOverloading {

	public static void main(String[] args) {

		 /*
	     * can i use same method name for different methods ? 
	     * YES!
	     * 
	     * Thats call method overloading 
	     * Just we need to change parameter
	     * 
	     * defination: reusing the name of the method with different method parameters
	     * 
	     * different parameter type or count or both
	     * */ 
		
		
		
	    printName(); 
	    printName("JAVA ");
	    printName("JAVA ", "Spartan");
	    
	    System.out.println();
	  }
//	  Normally we do like below but in overloading we use same method namewith different parameters
//	  public static void printName() {
//	    System.out.println(" Method overloading ");
//	  }
//	  
//	  public static void printName2(String name) {
//	    System.out.println(" Method overloading " + name);
//	  }
//	  
//	  public static void printName3(String firstName, String lastName) {
//	    System.out.println(" Method overloading " + firstName+lastName);
//	  }
//	  
	
  
  public static void printName() {
    System.out.println("no arg print name");
  }
  
  public static void printName(String name) {
    System.out.println("1 String arg print name " + name);
  }
  
  public static void printName(int number) {
    System.out.println("1 int arg print name " + number);
  }
  
  public static void printName(String firstName, String lastName) {
    System.out.println("2 String args print name  " + firstName+lastName);
  }

}
