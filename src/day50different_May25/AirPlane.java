package day50different_May25;

import day50_May25.Vehicle;

public class AirPlane extends Vehicle{

//	private String brand;
//	private String model;
//	protected int year;
	
	private int wingCount;

 public AirPlane(String brand,String model,int year,int wingCount) {
	//we already have funchtionality to set these 3 fields value
	//so we are just using super class cons to set these value
	 
	 super(brand,model,year);
	 //so could we have done it without it? 
	// we can call it , it is private so we neet to do with set method
	
	 /* setBrand(brand);
	 this.setModel(model);
	 this.year=year;
	 this.wingCount=wingCount;
	 but be careful  if we dont write this---->super(brand,model,year);
	 even we wrote all information it still give error because call default constructor 
	 automatically
	 
	 */
	 
	 
	this.wingCount = wingCount;
	System.out.println("Airplane 4 arg constructor");
}


 

public String toString() {
	return "AirPlane [wingCount=" + wingCount + ", year=" + year + ", getBrand()=" + getBrand() + ", getModel()="
			+ getModel() + "]";
}



public static void main(String[] args) {
	
	 Vehicle v1= new Vehicle ("Airbus","A320",1988);  //just print vehicle's construtor
	 
	 AirPlane a1= new AirPlane("Boeing","737",2012,4);  //it print vehicle and then airplane constructor
	 System.out.println(v1);
	 System.out.println(a1);
	 System.out.println(a1.year);  //we can access because it is protected
	 //private olanlari get ile yazdiriyoruz!
	
}
    
	
	
	
	
	
	
	
	
}
