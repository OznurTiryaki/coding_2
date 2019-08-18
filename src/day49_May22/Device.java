package day49_May22;

public class Device {

	int serialNumber;

	public Device() {

		System.out.println("Device Constructor");
	}

	public Device(int serialNumber) {
	
		System.out.println("1 arg Constructor");
	
		this.serialNumber = serialNumber;
	}
	

}
