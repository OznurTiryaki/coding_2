package day39_May6;

public class CarsRunnerClass {

	public static void main(String[] args) {
		

		Car c1=new Car();
//		c1.model="Toros";
//		c1.make="Toyota";
//		c1.year=2019;
//		c1.price=60000;
//		c1.horsePower=200;
		
		
		//if we close above and print some give null some give 0
		//default values for fields\//if it is not defined
		//any reference type field---- null
		//Any whole number of typer ---0
		//any fractional number ----0.0
		//char -----empty char ascii 0
		//boolean---- false
		
		//int i;
		//does not compile 
		//loca variable need to initialize before usage
		
		System.out.println(c1.model);
		System.out.println(c1.make);
		System.out.println(c1.year);
		System.out.println(c1.price);
		System.out.println(c1.horsePower);

	}

}
