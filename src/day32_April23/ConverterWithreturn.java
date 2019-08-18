package day32_April23;

public class ConverterWithreturn {

	public static void main(String[] args) {

		// create a method called meterToCM
		// it takes one int as parameter and return CM

		// create a method called FeetToInch
		// it takes one int as parameter and return Inch as double

		// create a method called FaToCelcius
		// it takes one double as parameter and return celsius as double

		int centi=  meterToCM(15);
		System.out.println(centi);
		
		//or 
		System.out.println(meterToCM(15));
		
		double inc= FeetToInch(30);
		System.out.println(inc);
		//or
		System.out.println(FeetToInch(30));
		
		double celc= FaToCelcius(80);
		System.out.println(celc);
		//or
		
		System.out.println(FaToCelcius(80));
		
		
		// new requirement: 
				/* what if i want to get the result as int 
				 * without changing the method return type to int
				 * but store the generated result as int
				 * */
				int cel = (int) (FaToCelcius(80)) ; //boylece int e casting etmis olduk
				System.out.println(cel);
				
				//int cel = (int) 27.22222222222222 ; 
	}

	public static int meterToCM(int m) {

		int cm = m * 100;

		return cm;

	}

	public static double FeetToInch(int feet) {
		double inch = feet * 12;
		return inch;
	}

	public static double FaToCelcius(double fah) {
		double cel = (fah - 32) * 5 / 9;
		return cel;
	}
}
