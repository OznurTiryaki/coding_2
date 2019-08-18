package day5;

public class Task3 {

	public static void main(String[] args) {
		// celcius Note: you have to write celcius = (5.0 / 9) * (fahrenheit – 32)
		
		double fahrenheit = 80;
		double celcius = (5.0/9) * (fahrenheit - 32); 
		//one number need to be write as a double to get double result.
		//thats why we wrote 5.0
		//or put d to say it is double (5d/9)or (5/9d)
		
		System.out.println("the celcius value is " + celcius);
		
		//System.out.println(5/0); make me error always, you cannot divide the zero
				
	}

}
