package day40_May7;

import java.util.*;

public class UsingTypeComputer {

	public static void main(String[] args) {
		 // What can we do when we have a class 
	     
	     /*
	      * Create object out of it 

	      * It will become a type 
	      * Create a reference variable Computer iMac
	      * Use it as method parameter 
	      * Use it as method return type 
	      * Use it as type for ArrayList object
	      * 
	      * */
	     
	     Computer myComputer = new Computer(); 
	     
	     ArrayList<String> lst = new ArrayList<>();
	     ArrayList<Computer> comlst = new ArrayList<>();
	     comlst.add(myComputer); 
	     comlst.add( new Computer() ); 
	     
	     String   str    = new String("actual String"); 
	     String[] strArr = new String[3] ; 
	     
	     
	     Computer myComp = new Computer(); 
	     Computer[] comArr = new Computer[3]; 
	     
	     
	     printComputer( myComp );

	  }
	  
	  /// WE Created a method that return computer object
	  public static Computer getComputer() {
	    // in order to return computer object 
	    // first we need to create an object
	    Computer iMac = new Computer(); 
	    iMac.OS = "MAC OS"; 
	    return iMac;  // returned computer object
	    
	  }
	  
	  
	  // created a methdo that accept computer as parameter
	  // so when we call this method
	  // we will pass computer object as augument 
	  public static void printComputer(Computer comObject) {
	    
	    System.out.println("computer object" );
	    
	  }
	  
	  public static void printString(String strObj) {
	    System.out.println(strObj);
	  }
	  
	  public static String getString() {
	    return "my string" ; 
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}