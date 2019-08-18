package day46_May18;

public class FlyingCarAction {

	public static void main(String[] args) {

//		FlyingCars f = new FlyingCars();
//		FlyingCars f1 = new FlyingCars();
//		FlyingCars f2 = new FlyingCars();
		
		
		FlyingCars car1= FlyingCars.getInstance();
		System.out.println(car1);
		FlyingCars car2= FlyingCars.getInstance();
		System.out.println(car2);
		
	}

}
