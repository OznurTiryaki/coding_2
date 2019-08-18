package day39_May6;

public class HorseRunnerClass {

	public static void main(String[] args) {

		Horse h2 = new Horse();

		h2.breed = "Arabian";

		h2.age = 2;
		h2.color = "black";
		h2.height = 2.3;

		
		System.out.println(h2.breed);
		System.out.println(h2.age);
		System.out.println(h2.color);
		System.out.println(h2.height);
		
		h2.color ="Brown";  // we change color re-assign
		System.out.println(h2.color);
		
	//	System.out.println(h2.toString); we cannot write with to String
		//to see everything in one shot we need to concat
		
		System.out.println(h2.breed+" : "+h2.age+" : "+h2.color+" : "+h2.height);
	}

}
