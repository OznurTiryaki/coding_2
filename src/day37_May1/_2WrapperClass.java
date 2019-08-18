 package day37_May1;

public class _2WrapperClass {

	public static void main(String[] args) {
		

	    //Byte b = new Byte( (byte) 123); 
	  
	    
	    // upcasting / type widening 
	    // 10 is literally considered as int 
	    // 10 -->> 10L  and stored inside long variable 
	    long lval = 10 ;   
	    
	    
	    // autoboxing --> 
	    // 10L will become new Long(10L) as object and assigned to lRef
	    Long lRef = 10L ; 
	    
	    // reference type does not care about the range 
	    // it only care about the relationship between types
	    // range compatible assignement only works for primitive numbers
	    // BELOW CODE DOES NOT WORK 
	    // Long lRef2 = new Integer(10) ; 
	    
	    // This always mislead programmer to think as below 
	    // 10 --> 10L by type widening | or upcasting 
	    // and then 10L autoboxed to Long Object 
	    // BIG NO!!!!!!!!!
	    // COMPILER IS LAZY --> IT ONLY TAKES ONE STEP ! 
	    // FOR EXAMPLE :  IT EITHER ONLY TAKE ACTION OF 
	    //   10 --> 10L   OR 10 --> New Integer(10)
	    // BIG BAD !!! COMMON TRICKY EXAM | INTERVIEW QUESTIONS 
	    //Long lRef3 = 10 ; 
	    
	    
	    
//	    printByteValue( (byte)10 );
	//    
//	    byte b = 12 ; 
//	    printByteValue(b);
	    
	  }
	  
	  
	  public static void printByteValue(byte b) {
	    
	    System.out.println(b);
	    
	  }
	  

	}
	