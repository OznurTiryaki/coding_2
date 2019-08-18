package day54_june1;

public class FinalInstanceFields {


	// FINAL FIELDS MUST BE INITIALIZED
	// BEFORE THE OBJECT CREATION COMPLETED  
	
	final int NUM = 100;	
	final int NUM1 = getNumber(); 
	final int NUM2; 
	final int NUM3; 
	
	{
		NUM2 = 200; 
	}
	
	public FinalInstanceFields() {
		NUM3 = 300; 
	}
	

	private int getNumber() {
		// TODO Auto-generated method stub
		return 150;
	}


	public static void main(String[] args) {
		
		// local final variable does not have to get initial value
		//  IF NOT USED 
		
		// local final variable can not be reassigned once it get initial value 
		final int x ; 
		x = 20 ; 
		//x = 30 ; 
		System.out.println(x);
		
		
		FinalInstanceFields f1 = new FinalInstanceFields(); 
		System.out.println( f1.NUM);
		System.out.println( f1.NUM2);
		System.out.println( f1.NUM3);
		
		// f1.NUM = 200;  can not reassign value for final variable 
		
		
		System.out.println("THE END");
		

	}

}