package day5;

import java.util.Random;

public class InstanceBlock {
	int num; 
	  
	  // a block that run every time an object is being created 
	  // instance block 
	  
	  {
//	    System.out.println("Initilzing the launch");
//	    System.out.println("setting protocols");
//	    System.out.println("checking fuel level");
	    System.out.println("All System GO!!!!");
	    Random r = new Random(); 
	    num =  r.nextInt(100) ;
	  }
	  
	  
	  
	  public InstanceBlock() {
	    
	    System.out.println("Constructor");
	  }
	  
	  public InstanceBlock(String name ) {
	    //this(); 
	    System.out.println("Constructor " + name);
	  }
	  
	  
	}

