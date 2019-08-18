package day50_May25;

public class Vehicle {

	private String brand;
	private String model;
	protected int year;
	
	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		System.out.println("Vehicle 3 arg constructor");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}
	
	

}

                         //Task
/// add constructors to set all the fields values 
/// provide getters and setters for only private fields 



// create a package called day50.difPackage

//Create Airplane class , sub class of Vehicle 
// add private instance field wingCount and encapsulate this field
// Add 4 args constructors to set all the fields values 

// create a toString method to print out all the field 

// create main methods and create few objects and print it out 