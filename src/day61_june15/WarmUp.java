package day61_june15;

import day58_june9.*;

public class WarmUp {
	
public static void main(String[] args) {
		
		int i = 10 ; 
		
		long l = i ; 
		
		
		double d = 3.14 ; 
		int a = (int) d ; 
		
		System.out.println(a);
		
		
		Dog d1 = new Dog() ; 
//		 // upcasting 
//		Animal a1 = d1 ;     // upcasting 	
//		Dog d2 =  (Dog) a1 ; // downcasting
		
		//Cat c = (Cat) d1 ; 
		
//		Object o = new Object() ; 
//		Dog d3 = (Dog) o ;   /// Dog d3  = new Object() ;
		
		Object o1 = new Dog() ; 
		Dog d4 = (Dog) o1 ;   
	
		Shape s = new Square("asdsa",6) ; 
		Square sq = (Square) s ; 
	
			
		
		
		
		
		
	}
	
	
	// polymorphism 
	  /*
	   *  Ability of object to take multiple form 
	   *   Ability of object to be referred by it's super type 
	   *   	and take object specific action at run time 
	   *   
	   *   Animal a = new Dog();       Animal is super class ,dog is sub class
	   *   		  a.makeNoise() ;      
	   *   		  a = new Cat(); 
	   *   	      a.makeNoise() ; 
	   *   Animal makeNoise -->> Dog --> woof , Cat miao 
	   *   
	   *    List<String>   lst = new ArrayList<>() ; 
	   * 
	   *   
	   *   It provide flexibility 
	   *   
	   *   we can group objects together by it's general type 
	   *   
	   *   Animal[] animals = {new Dog() , new Cat() , new Horse()} ; 
	   * 
	   *   Method parameters : 
	   *   for example : 
	   *   	
	   *   public static void AnimalNoiseTester(Animal anyAnimal) {
	   *   
	   *   }
	   *   
	   *   // what argument we can pass to above method 
	   *   AnimalNoiseTester(  new Dog()  ); 
	   *   AnimalNoiseTester(  new Cat()  ); 
	   *   
	   *   
	   *   Return Type  
	   *   public static Animal getMyAnimal(){
	   *   		 return -->>new Dog() or new Cat() or new Horse() 
	   *   }
	   *   
	   *   // each class in java implicitly extend Object if not already extending another class
	   *   // interface does not have this concept 
	   *   
	   *   
	   *   // 
	   *   WebDriver driver  = new ChromeDriver() ; 
	   *   
	   *   
	   *   
	   *   // What decide what member can be accessible using the reference variable 
	   *   		--- ONLY REFERENCE TYPE  
	   *   
	   *   		 Animal a = new Dog(); 
	   *   	     a can access only the members that visible to the Animal 
	   *   		 a.makeNoise() --->> woof 
	   *   	
	   *   	// What if we really want to access anything that only exists in Sub class 
	   *   		
	   *   		Dog d = (Dog) a ; 
	   *   	    d.dogStuff() ; 
	   *       
	   *   		 
	   *   
	   * */
	
	
	
}

