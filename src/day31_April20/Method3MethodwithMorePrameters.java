package day31_April20;

import java.util.Scanner;

public class Method3MethodwithMorePrameters {

	public static void main(String[] args) {
		 // create a static method called login 
		  /* 
		   * it return nothing
		   * It takes 3 parameters : 
		   *     user as String , password as String, 
		   *     rememberMe as boolean
		   * inside body 
		   *     You entered username : ----
		   *     You entered password : ----
		   *     print you checked remeberMe checkbox if it's true 
		   *     print you did not check remeberMe checkbox if it's false
		   * */
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your username");

		String username = scan.next();
		
		System.out.println("Enter your password");
		
		String password = scan.next();
		
        System.out.println("Do you want remember password");
		
		boolean remember = scan.nextBoolean();
		
		login(username,password,remember) ;
	
	}
	public static void login(String username, String password, boolean rememberMe) {
		
		System.out.println ("You entered username: " +username);
		System.out.println("you entered password: " + password);
		
		if (rememberMe=true) {

		System.out.println("You checked rememberMe checkbox");
		
		} else {
			System.out.println("You didn't checked rememberMe checkbox");	
		}
	}
}
