package day58_june9;

public interface IndoorPet {

	public default void insideAnimal  () {
		System.out.println("interface default method");
	}
}
