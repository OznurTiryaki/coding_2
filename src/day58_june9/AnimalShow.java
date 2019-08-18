package day58_june9;

public class AnimalShow {

	public static void main(String[] args) {
		
	
	// Dog is a Dog 
//reference type	   actual object type 
		Dog d    =        new Dog(); 	
		// Dog is a Animal 
		
		//reference type	   actual object type 
		Animal a1    =        new Dog(); 
		
		// Dog is a IndoorPet
	//reference type	   actual object type 
		IndoorPet d2  =       new Dog(); 
		
		// Horse 
		Horse h1 = new Horse(); 
		Animal h2 = new Horse(); 
		// Horse and IndoorPet has no relationship  
		//IndoorPet h3  =   new Horse(); 
		
		//  
		//Dog d1 = new Animal() ; 
		//Animal a3 = new IndoorPet() ; 
		
		

}

}