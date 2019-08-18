package day35_April28;

public class _6MethodOverloading {

	public static void main(String[] args) {
		

	    // ANY literal non-fractional numbers will be seen as int 
	    // ANY literal fractional numbers will be seen as double     
//	    double d ; 
	//    
//	    d = 10 ; 
//	    System.out.println(d);
//	    d = 10L ; 
//	    System.out.println(d);
//	    d = 10F ; 
//	    System.out.println(d);
	    
	    release((byte)10); 
	    release((short)10); 
	    release(10); 
	    release(10L); 
	    release(10F); 
	    release(10d);
	    release(10.5);
	    release(15/2);
	    
	  }
	  
	  
	  public static void release(double d) {
	    System.out.println("double "+ d);
	  }
	  
	  public static void release(int d) {
	    System.out.println("int "+ d);
	  }
	  
	  
	  
	  
	  
	  // this method can take any argument of type int 
	  // or anything that can be stored inside int variable 
	  // for example short and bytes are allowed 
	  // but not long or double 
	  
	  

	}