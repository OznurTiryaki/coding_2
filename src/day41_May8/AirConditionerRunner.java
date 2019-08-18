package day41_May8;

public class AirConditionerRunner {

	public static void main(String[] args) {

		AirConditioner ac = new AirConditioner ();
		
		ac.brand= "Samsung";
		
		ac.currentTemp=79.7f;
		ac.isOn=true;

		
		ac.displayTheBrand();
		ac.displaycurrentTemp() ;
		ac.allInfo();
		ac.turnOff();
		ac.turnOn();
		ac.increaseTemp(3);
		ac.decreaseTemp(3);
		ac.setTemperature (67);
	}

}
