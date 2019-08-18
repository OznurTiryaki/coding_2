package day46_May18;

public class Person {
	
	String name; 
	  float height; 
	  char gender; 
	  
	static int counter ; 
	  
	  static String race = "Human";

	  public Person(String name, float height, char gender) {
	    this.name = name;
	    this.height = height;
	    this.gender = gender;
	    
	    counter++;
	  } 
	  
	  

	}