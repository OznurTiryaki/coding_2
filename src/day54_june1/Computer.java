package day54_june1;

public class Computer extends Electronic{


	//@Override  this is a new method ,it's not overriding 
//	private void turnOn() {
//		System.out.println("computer");
//	}
	
	@Override
	// overriding methdo in sub class can be optionally final 
		// to block sub class of computer overrrding turnOff

	public final void turnOff() {
		System.out.println("COmputer off");
	}

}



class Electronic{
	
	
//	private void turnOn() {
//		System.out.println("electronic");
//	}
	
	public void turnOff() {
		System.out.println("electronic off");
	}
	
	
	
	
}

