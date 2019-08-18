package day47_May19;

public class Course {
	
	public static String school ; 
	  public static boolean isRamadan; 
	  
	  public Course () {
		  
		  System.out.println("Constructor");
	  }
	  // static initilizer block 
	  // iT'S used to initilize the static fields value before 
	  // the type's first usage 
	  // and it will run only one time 
	
	  // static initializer block 
	  // It will only run once when the class is loaded 
	  // iT'S used to initialize the static fields value before 
	  // the type's first usage 
	  // and it will run only one time right before it's usage
	  
	  // if you have more than one block 
	  // it will run in the order it appears
	  static {
		  isRamadan=true;
		  if(isRamadan) {
		      System.out.println("Use ramadan schedule");
		    }else {
		      System.out.println("USE normal schedule");
		    }  
	  }
	  
	  static { //if we put two block, it is going by order. SIrayla gider hangi method ustteyse
		  //onu yazdirir.
	    school = "Cybertek School" ; 
	    isRamadan = true ; 
	    
	    System.out.println("WELCOME TO OUR SCHOOL : " + school );
	    System.out.println("LET THE JOURNEY BEGIN");
	    
	   
	  
	  
	  }

	}

