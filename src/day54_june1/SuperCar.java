package day54_june1;

public class SuperCar {
	
	final String model;
	final String make;
	final Engine engine;

	public SuperCar(String model, String make, Engine engine) {
		this.model = model;
		this.make = make;
		this.engine = engine;
	}

	public static void main(String[] args) {
		
//		Engine e = null ;
//		e.start();
		
		
		Engine e1 = new Engine("Turbo", 8); 
		
		//System.out.println(e1);
		//
		//System.out.println(e1.cylinderCount); 
	
		
		SuperCar spartanHorse = new SuperCar("SpartanHorse", "Cybertek", e1);
		System.out.println(spartanHorse.toString()); 
		spartanHorse.start();
	}
	
	
	
//	start() accept no param and return nothing 
//			call the Engine's start method 
//
//			print out super car <Make> <Model> 
//				with <EngineCilinderCount> is starting  
	public void start() {
		
		//super.start();     BAD 
		//this.engine.start();  GOOD 
		engine.start();  // GOOD 
		System.out.println("Super Car MAKE "+ make + " MODEL : "
				+ model+ " with engine cilinder count "
				+ engine.cylinderCount
				+ " is starting");
		
	}


	@Override
	public String toString() {
		return "SuperCar [model=" + model + ", make=" + make + ", engine=" + engine + "]";
	}
	
	
	
	
}

