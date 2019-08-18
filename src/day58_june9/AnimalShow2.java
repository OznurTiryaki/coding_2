package day58_june9;

public class AnimalShow2 {

	public static void main(String[] args) {
      

		String[] arr = new String[3]; 
		
		// create Animal array with capacity 3

		// create 3 objects Dog , Cat , Horse
		// use reference of Animal for all of them
		
		// then store it to Animal Array
		Animal[] animals = new Animal[3];

		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Horse();

		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		
		
		for (Animal each : animals) {
			each.makeNoise();
		}
		
		
		

	}

}












