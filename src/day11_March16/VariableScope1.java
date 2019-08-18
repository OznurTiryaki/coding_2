package day11_March16;

public class VariableScope1 {

	public static void main(String[] args) {
	    
	    // variable scopes : it means where you can access
	      // the piece of data you declared 
	    
	    int x = 10 ; 
	    
	    if(x == 10){
	    
	      System.out.println("YES 10 ");

	      int y = 2 ;  //scope
	     
	      System.out.println(y);
	    
	    }
	    
	    //System.out.println(y); when we want to print it again it not accept because it is under if
	    // you can't use again
	    
	    
	    System.out.println(x);
	    
	    

	  }

	}

	
