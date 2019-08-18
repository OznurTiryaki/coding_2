package day60_june12;

import day58_june9.Dog;

public class Director extends Manager{
	
	
	// -->>Director--->>Manager--->>Employee

		
		//double salary; 
		//int budget; 
		int stockOption = 50000; 
		
		public static void main(String[] args) {
			
			Director e1  = new Director(); //e1 ile herseye ulasabiliriz, director inherid everything
			//System.out.println( e  );
		
			
			Employee e = new Director();
			System.out.println(e.salary);  
			//burada sadece employee reference olarak alindigi icin director,
			//director employee icindekine ulasabilr. bu yuzden sadece salary i kabul ediyor
			
			// how to access Director's stock option 
			// in order to access Director specific field we need to refer the Director as a Director
			
			long myLong = 100 ;     // upcasting 
			int i = (int) myLong ;  // downcasting 
			
			Director d = (Director) e ; 
			System.out.println(d.salary);
			System.out.println(d.budget);
			System.out.println(d.stockOption);
			
			
			Object o = new Dog(); 
			Dog puppy = (Dog) o ;  //eger cast yapmazsak hash code verir
			puppy.makeNoise(); //WOOF WOOF
			
			
			
			
			
		}

	}