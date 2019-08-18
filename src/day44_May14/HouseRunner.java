package day44_May14;

public class HouseRunner {

	public static void main(String[] args) {

		House h1 = new House("single house", 5, 120000); 
		House h2 = new House("town house", 4, 20000); 
		House h3 = new House("apartment", 2, 10000); 
		House h4 = new House("single house", 4, 110000); 
		
		// immutable object means //if we delete the setter method we cannot able to change it
			// once it's created , it can not be changed 
			// READ ONLY OBJECT 
		
		// non-resizable -- array 
			// it can not change in size , cant shrink cant expand 
		// can we change array -- yes , arr[0] = new value 
		
		
		// WRITE ONLY OBJECT /unusual create an object 

//		h1.setBedroom(6);  to change h1 house's bedroom we need to use set
//		h3.setType("single house");   // to change h3 house's type we need to use setType method
		
		System.out.println(h1);  //it is come from to String method
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		
		System.out.println(h1.getType());  //we can only read we cannnot set /change again if we delete the setter method from class
		System.out.println(h1.getBedroom());
		System.out.println(h1.getPrice());
		
		
		
		
		

	}

}