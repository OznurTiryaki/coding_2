package day58_june9;

public class Cat extends Animal implements IndoorPet {
	

//	public void makeNoise () {
//		System.out.println("General Noise");
//	}
//	
//	public default void insideAnimal  () {
//		System.out.println("interface default method");
//	}
	
	
	@Override
	public void makeNoise () {
		System.out.println("MEOW");
	}
	
	@Override
	public void insideAnimal () {	
		System.out.println("interface default method in Cat class");
	}
	
}
