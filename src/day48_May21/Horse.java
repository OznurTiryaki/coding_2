package day48_May21;

public class Horse extends Animal{

	int shoesCount;
	int horsePower;

	public static void main(String[] args) {
  
	/*
    * IF IT IS PRIVATE WE CANNOT INHERIT 
    * IT NEED TO BE ALL VISIBLE
    * IT GAVE US COMPILER ERROR
    * 
    * 
    * IF OUR HORSE CLASS AND ANIMAL CLASS IS DIFFERENT PACKAGE
    *WE HAVE TO IMPORT IT, BECAUSE IT GAVE US COMPILE ERROR WITHOUT IMPORT
    * 
    * 
    */
		
		Animal a1= new Animal ();  ///we cannot call Animals variable from Horse class because it is general class.
		a1.wild=false;
		
		System.out.println(a1.breed);
		System.out.println(a1.legcount);
		System.out.println(a1.color);
		System.out.println(a1.wild);
		
		Horse h1= new Horse ();
		h1.breed="spartan";
		h1.wild=false;
		h1.horsePower=600;
		System.out.println(h1.breed);  //if we don't extend the Horse it not except breed
		//because it is from animal class
		
		System.out.println(h1.breed);
		System.out.println(h1.horsePower);
		
		
	}
}
