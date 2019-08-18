package day36_April30;

import java.util.*;

public class _3ArrayListIntro {

	public static void main(String[] args) {
		

		int i = 10 ; 
		Scanner scan = new Scanner(System.in); 
		Double d = new Double("2.14"); 
		float f = 1.4f ; 
		
		
				// an ArrayList variable lst1 is created 
				// an ArrayList object is created and assigned to lst1
				// it did not specify what we can store in this arraylist
				// so we can store any type 
		
		ArrayList list1 = new ArrayList ();    //we need to import it and give us suggestion 
		                                      //the to choose specific object

		ArrayList <String> list2 = new ArrayList <> ();
		
		
		
		list1.add("abc"); 
		list1.add("efg");
		list1.add( new Integer(10) );
		list1.add( Character.valueOf('A') );
		 
		System.out.println(  list1  );  //we we print directly it gave us all of them
	
	}

}