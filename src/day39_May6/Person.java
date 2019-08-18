package day39_May6;

import java.util.*;

public class Person {

	// properties of the object are defined
	  // by instance variable/field
	 
	String name;
	  int age;
	  char gender;
	  
	  public  static void eat() {   //how we can call this method from our custom class
		  
		                            // p.eat();   //we can call method from your classes
		  System.out.println("I want to eat something"); 
	  }

	  public void tellMeYourName () {  //when we call this method, we will see the name
		  System.out.println("My name is " + name);
	  }
	  public void printPersonInfo () {
		  System.out.println("My name is " + name+ " | my age is: "+ age +" | My gender is " + gender);
	  }
	}
   

