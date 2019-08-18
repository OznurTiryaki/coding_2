 package day5;
 
 public class Vtask1 {

	public static void main(String[] args) {

		byte b = 10;
		
		short sh = 20;
		
		// short total = b + sh; not compile because the value is big
		
		int total = b + sh;
		
		System.out.println(total);

		/*if one of the values is integral and the other is floating-point, 
		 * Java will automatically promote the integral value to the floating point value's data type.
		 */
		
		sh = 100 + 2;
				
		double d = 10.5;
		
		int i = 4;
		
		/*int j = d* i; not compile because the result is double,
		 * cannot convert from double to int
		 *  we need to write as double
		
		*/
		
		double  j = d* i;
		System.out.println(j);
		
		double d2 = 3.4;
	    double d3 = d- d2;
	    //all data type is same, it promoted operants
	    
	    System.out.println(d3);
	
	}

}
