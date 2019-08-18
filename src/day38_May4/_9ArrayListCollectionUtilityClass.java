package day38_May4;

import java.util.*;

public class _9ArrayListCollectionUtilityClass {

	public static void main(String[] args) {
		
		// Arrays class is a class that have a lot of 
	    // static methods to perform common array operation 
	    // Arrays.sort(arrayObject)
	    
	    // Collections is a class under java.util package 
	    // to perform common collection object related operation 
	    
	    ArrayList<String> lst = new ArrayList<String>(); 
	    lst.add("Etka") ;
	    lst.add("Umut") ;
	    lst.add("Aygul") ;
	    lst.add("Izdar") ;
	    lst.add("Amir") ;
	    lst.add("Mehmet") ;
	  //  lst.add("talmurat");
	    
	    System.out.println(lst);
	    // sorting arraylist using sort method of Collections class 
	    Collections.sort(lst);    
	    System.out.println(lst);
	    
	    // looking for the index of an item in the sorted list    
	    int amirLocation = Collections.binarySearch(lst, "Amir") ; 
	    System.out.println("index is : "+ amirLocation);
	    
	    int talmuratLocation = Collections.binarySearch(lst, "talmurat") ; 
	    System.out.println("index is : "+ talmuratLocation);
	    
	    // reversing collection 
	    Collections.reverse(lst);
	    System.out.println(lst);
	    
	    // shuffle items inside the list 
	    Collections.shuffle(lst);
	    System.out.println(lst);
	    
	    
	    
	    
	    
	    // sort method from ArrayList excect an object called Comparator we did not learn
	    // However even we don`t know this type of object
	    // we do know that any reference variable can be set to null 
	    // so we can just pass null to this method 
	    // and it will just work 
	    //lst.sort(null); 
	    
	    
	    
	    
	    
	    
	  }

	}
