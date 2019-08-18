package day37_May1;

public class _1WrapperClass {

	public static void main(String[] args) {
		

		//Byte b = new Byte( (byte) 123); 
		  
	    
	    printByteValue( (byte)10 );  //without convert it, look as a int and give error
	    
	    byte b = 12 ;   
	    printByteValue(b);  //now it is work because we already declare it as byte
	    
	  }
	  
	  
	  public static void printByteValue(byte b) {
	    
	    System.out.println(b);
	    
	  }
	  

	}

