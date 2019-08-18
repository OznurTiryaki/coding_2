package day37_May1;

import java.util.*;

public class _7ArrayListMethod {

	public static void main(String[] args) {
	
		ArrayList <Integer> numlst = new ArrayList <> ();
		
		numlst.add(100);
		numlst.add(200);
		numlst.add(300);
		numlst.add(400);
		System.out.println(numlst);
		
		numlst.add(1, 500);  //inserting at certain location/add 500 as second item
		System.out.println(numlst); //it is not delete other, just add between them
		
		// numlst.add(7, 500);   if we gave index of out exception like 7, give error
		// System.out.println(numlst.get(7)); or like this
		
		//updating a value inside ArrayList item
		//set (index, newValue)
	
		numlst.set(2, 900);  // set value delete 2nd one, and put new one, replace it
		System.out.println(numlst);
		
		//deleting everything from the list
//		numlst.clear();
//		System.out.println(numlst);
		
		System.out.println(numlst.contains(1000)); //false
		System.out.println(numlst.contains(300));   //true
		
		//finding out location of item
		
	    
	    int indexOf1000 =  numlst.indexOf(1000) ; 
	    System.out.println(" index Of 1000 "+ indexOf1000);
	    
	    
	    boolean isitEmptyOrNot = numlst.isEmpty() ; 
	    System.out.println(" isitEmptyOrNot " + isitEmptyOrNot);
	    
	    // counting items 
	    System.out.println(" size of list  "+ numlst.size());
	    
	    
	    // removing items from arrayList 
	        // remove(ItemValue)
	        // remove(index)
	    
	    numlst.remove(1) ; 
	    System.out.println( numlst );
	   

		// numlst.remove("300"); we cannot do this
		  
		numlst.remove(new Integer (300));  //because it is getting confuse, you say 300 as a index or number
		// or numlst.remove(Integer.valueOf(300)); 
		
		System.out.println(numlst);
	}

}
