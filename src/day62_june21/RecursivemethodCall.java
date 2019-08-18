package day62_june21;

public class RecursivemethodCall {

	public static void main(String[] args) {
		

		callYou();
		System.out.println("End");
		
		
	}

	public static void callMe() {
		
		callYou();
		
	}

	public static void callYou() {
		
		callMe();
		
	}

}

	