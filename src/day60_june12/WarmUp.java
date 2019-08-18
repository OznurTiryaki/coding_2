package day60_june12;
import day58_june9.Dog;
public class WarmUp {


	  public static void main(String[] args) {
	    
	    // AKA --- ALSO KNOWN AS 
	    
	    // Polymorphism is ability of the object taking many form 
	    // in another word , an object can be refered by it's own type or it's super class type 
	       /// or it's interface type that the class implemeted 
	    
	    // Power of Polymorphism --
	      ///making correct decision at runtime according actual object type to call the overriden version of the method 
	    
	    // Animal a1 = new Dog(); 
	    // a1.makeNoise() --->>> woof woof 
	    
	    // This will give us alot of flexibility while writing to code 
	    // we can easily swap the impelmentation to get correct behavior at runtime 
	    // we can group objects together by it's general types and take general actions without worrying about details 
	    
	    // Animal[] allAnimals = {new Dog(), new Cat(), new Horse} ; 
	    // for(Animal each : allAnimal){
	       // each.makeNoise();   --->>> 
	     //}
	    
	    
	    // Animal a2 = new Horse(); 
	    //  what you can access using a2 reference 
	    
	    //  ONLY the members that available in Animal class 
	    //  in order to acces Horse specific members we must have a Horse reference 
	    
	    // ONLY REFERENCE TYPE DECIDE WHAT IS ACCESSIBLE USING THE REFERENCE VARIABLE 
	    Object o = new Dog(); 
	    System.out.println( o.toString()  );
	    // AT RUNTIME -->> new Dog().toString()
	    
	    // Dog d = new Object() ; 
	    
	    
	  }

	}

