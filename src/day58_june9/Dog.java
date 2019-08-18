package day58_june9;

public class Dog extends Animal implements IndoorPet {

	
//	public void makeNoise () {
//	System.out.println("General Noise");
//}
//
//public default void insideAnimal  () {
//	System.out.println("interface default method");
//}
	
	public String breed; 
	  public String legsCount = "Dog leg"; 

	  @Override
	  public void makeNoise() {
	    System.out.println("WOOF WOOF");
	  }
	  @Override
	  public String toString() {
	    return "DOG VERSION OF TOSTRING" ; 
	  }
	//  public static void doStatic() {
//	    System.out.println("Dog Static");
	//  }
	  
	}