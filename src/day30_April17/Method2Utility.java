package day30_April17;

import java.util.Scanner;





public class Method2Utility {
	  
	public static void printUsersName() {
		  
		    Scanner scan = new Scanner(System.in) ;   //hepsini icine yazdigimiz icin tekrar yazmaya ihtiyacimiz yok
		    System.out.println("Enter your name please");
		    
		    String name = scan.next(); 
		    System.out.println("You entered : " + name);    
		    
		  }
	public static void main(String[] args) {
		
		  
		Method2Utility.printUsersName() ;  //bu sekilde de kullanabilirsin.
	    printUsersName() ; 
	    Method1.sayHello ();
   //to use some method from others package mendatory the write class and in front
	    // We can call methods coming from 
	    // different classes 
	    // if the class is under same package no import needed
	    // if the class is under different package import is mandatory
	   
	  
	  }
	  
	
	  
	  // 

	  
	  
	  
	}