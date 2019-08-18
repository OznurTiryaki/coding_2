package march_10;

public class ConditionalStatementTask3 {

	public static void main(String[] args) {
		// ConditionalStatement Task-3

		boolean isTimeToEndClass = true;
		
		boolean isTopicFinished = false;
		
		

	    // if the variable itself is boolean type == true is optional
	    // if( isTimeToEndClass ){

	    if (isTimeToEndClass == true && isTopicFinished == true) 
	    
	    {
	    	System.out.println("OK lets end the class");
	    	
	    } else {
	     
	    	System.out.println("hang on tight");
	    }
	    
	    if(isTopicFinished == false){
	      
	    	System.out.println("can we finish it in few extra mins");
	   
	    }else{
	     
	    	System.out.println("OK WE CAN GO NOW");
	    }

	  }
	
	}


