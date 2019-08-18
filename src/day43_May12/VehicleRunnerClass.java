package day43_May12;

public class VehicleRunnerClass {

	public static void main(String[] args) {
		
	Vehicle v1= new Vehicle ();
	
	v1.setModel("Camry");
	v1.setMake("Toyota");
	v1.setSpeed(60);
	
	
	System.out.println(v1.getModel());
	System.out.println(v1.getMake());
	System.out.println(v1.getSpeed());
	
	v1.updateIncrease(5);
	System.out.println(v1.getSpeed());
	v1.decreaseSpeed(5);
}
}