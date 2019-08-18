package day37_May1;

import java.util.*;

public class _8ArrayListRemoveItemFromIntegerList {

	public static void main(String[] args) {
		
		
		ArrayList <Integer> lst = new ArrayList <> ();

		lst.add(1); 
	    lst.add(2); 
	    lst.add(3); 
	    lst.add(4); 
	    
	    lst.remove(2);   //this remove index of 2 -yani  3 u kaldirir
	    //lst.remove( new Integer(2));     //2 yi kaldirmak icin bu sekilde yapman lazim
	    //lst.remove( Integer.valueOf(2));
	    
	    System.out.println(lst);
	    

	  }

	}
	