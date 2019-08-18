package day45_May15;

public class Student {

	String name;
	int age;
	String major;

	public Student() {
		//calling constructor with 1 argument
		//to put default name
		
		this("No Name");  //you can call only one times. you cannot sysout at top. 
		//this has to be at very first line in constructor
		//IT COMES OCA
		System.out.println("No arguments");

	}

	public Student(String name) {  
		System.out.println("1 arg " + name);
	}
	public Student(String name,int age, String major) {  
		//you cannot consrtuctor twice, if we want to call default constructor;
		this();
		//or
	//	this("Orhan Veli"); we cannot call two constructor
		System.out.println("3 args");
		

	}
}
// calling a Constructor 
/*
 * Where :   when object is being created 
 * 		a constructor can only be called inside another constructor of same class
 * 		RULE : 
 * 			this(arg...)    use this keyword with () and pass arguments if needed
 * 			1, it has to be in first statement of constructor body 
 * 			2, ONLY ONE Call(of any constructor) is allowed inside one constructor 
 * 			3 , recursive constructor call is not allowed --- COMPILER ERROR
 	
				 public Caller() {
					
						this(100); 
						System.out.println("calling no arg");
						
					}
					
				public Caller(int x ) {
						
						this(); 
						System.out.println("calling 1 arg");
						
				}
				
		METHOD  VS CONSTRUCTOR 
			
 		METHOD -- has return type can have any name and can take certain action 
 					and can be called upon request 
 		Constructor  -- has NO return type has same name as class name 
 				will be called each time an object is being created 
 				only a constructor can call another constructor of same class
 					using this(args...)
 		
 		
 		A constructor can call another method in same class 
 		A method CAN NOT CALL constructor in any circumstances using this()		
 				
 
 * 
 * */
