package day55_june2;

public abstract class Student {
	
	//abstract class are not meant to be instantiated 
		//abstract class are meant to be a super class 
		//  to provide a general idea, without providing implemetation details 
		//   using abstract method 

		// OTHER THAN ABOVE 
		// YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 
	 
	int id; 
	  String name; 
	  public static final String SCHOOL = "Cybertek"; 

	  // we can have constructor in abstract class 
	  // the sole purpose is to provide reusable code 
	  // for sub class constructor 
	  public Student(int id, String name) {
	    this.id = id;
	    this.name = name;
	  }
	  // we can have non-abstract instance method 
	  // sub class have option to directly use it 
	  // or it has option to override the method 
	  
	  public void study() {
	    System.out.println("Study hard to get the job");
	  }
	  
	  // can have static method 
	  // sub class have option to use as is 
	  // or hide it with same method 
	  
	  // static method can not be abstract AT ALL !!!!  
	  
	  public static void showSchool() {
	    System.out.println(SCHOOL);
	  }
	  // it ends with < ; > 
	  public abstract void attendClass(); 
	  
	//  public void attendClass() {
	//    
//	    System.out.println("IMPLEMENT IN SUB CLASSES");
	//    
	//  }

	}
	


