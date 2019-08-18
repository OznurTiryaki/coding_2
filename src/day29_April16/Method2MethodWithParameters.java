package day29_April16;

import java.util.Scanner;

public class Method2MethodWithParameters {

	public static void main(String[] args) {
		
		// Arrays.sort (arr);
		
		holdYourHorse ("Anar");
	// holdYourHorse (123); if data type not match is not compile String ise string vermeliyiz
		holdYourHorse ("David");
		holdYourHorse ("Fatma");
		holdYourHorse ("Sumeyye");
		
		///Ismi scannerdan da alabilirsin, istersen metodun icinde ister burada  yazarsin
		
	    Scanner scan = new Scanner(System.in); 
	    String name = scan.next(); 
	    System.out.println("HOLD WHOESE HORSE?");
	    holdYourHorse(name); 
	    
	    
	}
                                        //parameters(degisken)
	public static void holdYourHorse (String owner) {
		
		//String owner = "Anar"; // if we wan to change/give different name always/
		                       //to modify it move String owner inside parantesis
		                       // methodunun icindeki paranteze tasi.
		
		System.out.println(owner + " hold your horse please!");
	}
		
}
