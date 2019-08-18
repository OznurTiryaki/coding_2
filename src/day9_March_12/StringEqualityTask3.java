package day9_March_12;

import java.util.Scanner;

public class StringEqualityTask3 {

	public static void main(String[] args) {
		/* Task 3
		Create a simple program to check login 
		
		pre-define username and password as String and assign value 

		Ask user to enter username and password using scanner

		if username and password match 
			login successful 
		else 
			login failed 

		Optional Tasks : check for user name is admin or not 
			if user is admin , whatever password should work */
		
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter your username and password");
		
      String username = scan.next();
	  String password = scan.next();
        
		boolean expectedUsername = username.equals("oznurkarakus") ;
		boolean expectedPassword = password.equals ("mynewcode");
		 
		 if (expectedUsername && expectedPassword) { //we will use say without true because it already boolean
			 
			 System.out.println("login successful" ); 
		 } else {
			 
			 System.out.println("login failed" ); 
	}
		 
		 
		 /* WE WILL DO LIKE THIS TOO
		  * 
		  * 
		  * 
		  * String username = ("user");
		String password = ("abc123");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		
		username = scan.next();
		if (username.equals("admin"))
		System.out.println("Login successful");
		
		else System.out.println("Enter password:");
		password = scan.next();
		
		if (username.equals("user") && password.equals("abc123")) //if just put true
		                                                          //it will accept all passport
		                                                          // if (!true) all code fail
	or 
	
	if (expectedUsername ==true && expectedPassword ==true)
			System.out.println("Login successful");
		
		else
			System.out.println("Login failed");
		
	
	}
	

}*/

}
}