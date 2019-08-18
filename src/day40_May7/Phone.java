package day40_May7;

public class Phone {

	/*
    * Create class Phone
    * add few instance variable to define   attribute | properties| state of object 
    * type as String , OS as String , capacity as int 
    * add few methods 
    *    ring -->> accept no param return no value , just print ringing
    *   dial -->> accept one param number as long and print dialing number 
    * 
    * OPTIONALLY 
    *   add a behavior to Phone object  
    *   displayPhoneInfo method accept no param return no value 
    *   --> this should print all phone attributes 
    * 
    * 
    * Create another class called PhoneFactory with main method 
    * create 3 different phone object , iphone, sumsung , pixel 
    * assign value for all attributes 
    * and call methods 
    * 
    *   
    * 
    * */ 
   
 // these instance variales 
    // can be accessed 
    // inside instand methods directly 
    // just like it's a local variable 
    // for that method 
    
    // if you are outside class
    // you need an object to access 
    /// these attributes 
    
	String type;
	
	String OS;
	
	int capasity;
	
	
	public void all () {
		
		  System.out.println(type + " is easy to use and it use "
		  + OS + " operating system. It has " + capasity+ " GB capasity");
	}
  public void ring () {
	  System.out.println("ringing");
  }
  public void dial(long x) {
	  System.out.println("dialing... "+ x);
  }
}
