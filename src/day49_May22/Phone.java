package day49_May22;

public class Phone extends Device{
   
	
	//int serialNumber;
	
	String brand;
	int screenSize;
	
	public Phone() {
		super();  //ilk super class icindekini yazidrir
		//eger one parameter degilde baska bir cons cagirmak istersek 
		//parantez icinde parametreyi yazdirmak gerekiyor
		//super (20);  //this is implicit behavior
		System.out.println("Creating Object");
	}
	
	//whenever we create constructer, it gave us super
	
	public Phone(String brand, int screenSize,int serialNumber) {
		super();
		this.brand = brand;
		this.screenSize = screenSize;
		this.serialNumber=serialNumber; //normally we cannot write param
		//from other class but now we did a inherit between classes
	}





	public static void main(String[] args) {
		
		Phone p= new Phone();
		
		/*it print;
		  Device Constructor
          Creating Object
		 
    --> when we create object it call no parameter constructor 
          with super keyword
		  super keyword is go to your super class constructor
		 
	     public Device() {

		System.out.println("Device Constructor"); 
		


	public Phone(String brand, int screenSize) {
		super();
		this.brand = brand;
		this.screenSize = screenSize;
	} */
	}
}
