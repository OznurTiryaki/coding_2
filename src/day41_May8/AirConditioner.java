package day41_May8;

public class AirConditioner {

	
	
	/*
	 * WARM UP 
	  Create a class called AirContitioner 
	  Add instance fields 
	    brand as String 
	    currentTemp as float  
	    isOn as boolean  

	  Add below behaviors 
	    displayTheBrand() ;
	      accept no paramter and print out the brand  
	    showCurrentTemp
	      accept no paramter and
	      simply display current temp on console 

	    displayAllInfo 
	      accept no paramter and display all AC info 

	    turnOn 
	      accept no parameter 
	      and set isOn value to true if it's not already true

	    turnOff 
	      accept no parameter 
	      and set isOn value to false if it's not already true
	    
	    increaseTemp
	      it accepts one parameter int 
	      and increase the value by the amount passed

	    decreaseTemp
	      it accepts one parameter int 
	      and increase the value by the amount passed
	    
	    setTemperature
	      it acceps one paramter int 
	      and set the value to that paramter passed 

	  Create a class called ACTester 
	    Create 3 object set their field value 
	    then call the methods 


	 * */

	String brand;
	float currentTemp;
	boolean isOn;

	public void displayTheBrand() {
		System.out.println("The brand: " + brand);

	}

	public void displaycurrentTemp() {
		System.out.println("The temperature : " + currentTemp);

	}

	public void allInfo() {
		System.out.println("The brand: " + brand + " | The temperature : " + currentTemp + " | it is on? " + isOn);
	}
	
	public void turnOn() {
		System.out.println("current as is " +isOn);
         
		if(isOn=false) {
         isOn=true;
         System.out.println("It turned on" );
         } else {
        	 System.out.println("It is already off");
         } 
         
	
	}
	public void turnOff() {
		System.out.println("current as is " +isOn);
        
		if(isOn) {
         isOn=false;
         System.out.println("It has been turned off");
         } else {
        	 System.out.println("It is already off");
         } 
	}
	
	public void increaseTemp(int increaseAmount) {
		
		currentTemp += increaseAmount;
		 
		displaycurrentTemp(); //or you can call current temp directly
		
		//System.out.println("New temp after increase: " + currentTemp );
	}

	public void decreaseTemp(int decreaseAmount) {

		currentTemp -= decreaseAmount;
		System.out.println("New temp after decrease: " + currentTemp );
	}
	public void setTemperature (int newTemp) {
		currentTemp=newTemp;
		System.out.println("The current temperature : " + currentTemp);
	}
}
