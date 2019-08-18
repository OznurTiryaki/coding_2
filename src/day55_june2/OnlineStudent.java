package day55_june2;

public class OnlineStudent extends Student{
	
	/*
	   * Only an abstract class can have abstract method
	   * However all abstract class does not have abstract method

	       WE CAN HAVE STATIC AND INSTANCE FIELD IN ABSTACT CLASS
	       WE CAN HAVE STATIC AND INSTANCE METHOD IN ABSTACT CLASS
	       WE CAN HAVE CONSTRUCTOR IN ABSTACT CLASS
	       you cannot create and object and you can
	       create a abstract method is just two differences from other class
	   */
	
//	int id;
//	String name;
	int zoomId;
	
	
	 public OnlineStudent(int id,String name,int zoomId) {
		    super(id,name); 
		    this.zoomId = zoomId; 
		  }
	
	@Override
	public  void attendClass() {
		System.out.println("attend class using zoom");
}

	
     public static void main(String[] args) {
		
    	OnlineStudent s1 = new OnlineStudent(32, "ashraf khalil", 522220);
		s1.id=101;
		s1.name="Spartan";
		s1.zoomId=20001;
		s1.attendClass();
		
	//	Student s2= new Student (); not compile because of abstraction
//		not meant to be instantiated
		
	}
}