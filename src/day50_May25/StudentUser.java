package day50_May25;

public class StudentUser extends SlackUser {
//	String name;
//	   String status;
//	   int timeZone;
//	  
//	 
//	   public void sendMessage(String message) {
//		   System.out.println("name <" + name + "> is sending message <"+message+ ">");
//	   }
//	   public String changeStatus(String newStatus) {
//		   status=newStatus;
//		   return status;
	
	int groupNumber;

	
	
	public StudentUser() {
		
	/* 	this.name = "Spartan";
		this.status = "I can do it!";
		this.timeZone=5;
		or we can use this keyword to set value   */
		this( "Spartan","I can do it!",5,0); //we have just 4 arg constructor, so if we enter 3 not accept
		//we call with this, because we call same class constructor
	  System.out.println("Student User no arg");
	}


	StudentUser (String name, String status,int timeZone , int groupNumber) {
		//we dont have 4 argument construction in super class
		//parent class dont see groupNumber
		//but if we want to set as different, for example we dont want to default and say something else
		//we need to use traditional way, not call the super and write each item
		/*
		 * this.name = "Spartan";
		this.status = "I can do it!";
		this.timeZone=5;
		 * 
		 */
		
//		this.name = name;
//		this.status = status;
//		this.timeZone=timeZone;     we can use both way but we don't want to repeat code
		
		super(name, status,timeZone );
		this.groupNumber=groupNumber;
		
		System.out.println("Student user 4 arg constructer");
		
	}
	
	
	public void displayGround () {
		System.out.println("<"+name+ "> is member of group <"+groupNumber+ ">");
		
	}

	
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", name=" + name + ", status=" + status + ", timeZone="
				+ timeZone + "]";
	}

	public static void main(String[] args) {
		
		StudentUser s1= new StudentUser();  
		/*   1-it is go no argument constructor
		 *   2-but it call 4 arg constructor inside
		 *   
		 */
		
		/*not compile if we dont create a no arg const in studentUser
		we turn and create no arg const in sub class
		public StudentUser() {
		
	     System.out.println("Student User no arg"); */
		
		StudentUser s2 = new StudentUser ("Sumeyye","available",6,26);  
		
		/*   1-it is go 4 argument constructor
		 *  
		 */
		
		System.out.println(s2);  //s2 and s2.toString() same thing! but if we dont create toString method,
		//it gave us hashcode
		
		
		/*when we call first call, it call the super class and then call sub class
		
		SlackUser no arg constructor
		Student User no arg  */
			}
	}
	
	
	

