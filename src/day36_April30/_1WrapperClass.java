package day36_April30;

public class _1WrapperClass {

	public static void main(String[] args) {
		
		int i =10; 
		
		//boolean, char, byte, short, int ,long, float, double
		
		/*
		 * Wrapper class--->
		 * 
		 * specifically designed to 
		 * store primitive values as object
		 * (in primitive we dcn't to anything like using method like string.indexOf
		 * for that reason we can use wrapped class to create object from primitive
		 * 
		 * 
		 */

		
		Boolean b = new Boolean(true);  //boolean (boolean)   one take boolean 
		
		Boolean b1 = new Boolean("false") ;   //as a string boolean (String) ---> this taking a string value
		
		Boolean b2 = Boolean.valueOf(true);
		
		Boolean b3 =Boolean.valueOf("true");
		
		
		System.out.println(b);
		
		System.out.println(b1);
		
		System.out.println(b2);
		
		System.out.println(b3);
		
		//no differences between them just a different way to create new object
		
		Integer i1= new Integer(123);
		
		Integer i2= new Integer("123");
		
		Integer i3 = Integer.valueOf(123);
		
		Integer i4 = Integer.valueOf("123"); //Integer.valueOf is a static method to create new object
		
		
		System.out.println(i1);   //when we do i1. it show us lots of method to take action. 
		
		                          //normally in int not possible to take any action with methods.
		
		System.out.println(i2);
		
		System.out.println(i3);
		
		System.out.println(i4);
		
		System.out.println("equal? "+ i1.equals(123));   //it gave us true// we will compare with that way, because it is like a string now. object!
		
		
		
//		int j =10;
//		System.out.println(j.equals(10)) ;  //it now compile because not object ,it is primitive
		
		
		Character c1 = new Character ('c');
		
		Character c2 = Character.valueOf('c'); //we can write just with this way
		
		System.out.println(c1);
		
		System.out.println(c2.toString()); //we can use String method because it is already object now.
		
		
		
		
		
		
		
		
		
	}

}
