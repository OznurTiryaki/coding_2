package day50_May25;

public class SlackUser {
   String name;
   String status;
   int timeZone;
  
   SlackUser (){
	 //  super();    parent class call obj class constructor otomatically
	   System.out.println("SlackUser no arg constructor");
   }

   SlackUser(String name, String status,int timeZone ) {
	
	this.name = name;
	this.status = status;
	this.timeZone=timeZone;
	
}
   public void sendMessage(String message) {
	   System.out.println("name <" + name + "> is sending message <"+message+ ">");
   }
   public void changeStatus(String status) {
	   this.status=status;
	 
   }
   
   
}

/*TASK 1 
Create classes as below 
SlackUser
    displayName as String
    timezone as int
    status as String
constructor --
    no arg
    3 args to set All fields value
    sendMessage    
        have one parameter as message and has no return type
        print --- <displayName> is sending<Message>
    changeStatus
        accept one String as parameter and change status to new status
2 sub classes :
StudentUser
    groupNumber as int 
    
    Create a 4 args constructor to set all field values of StudentUser
    
    // generate toString method so we can print out object directly 
Optional : 
AdminUser
    adminLevel as int 
  
    Create a 4 args constructor to set all field values of AdminUser
   // generate toString method so we can print out object directly 
      
*/
