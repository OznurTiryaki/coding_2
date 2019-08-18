package day27_April13;

import java.util.Arrays;

public class Array8SortMethod {

	public static void main(String[] args) {
	

		// Array is mutable meaning  items inside can change 
	    // it's not resizable we can not increase or decrease the capacity 
	    // Arrays sort method will internally shuffle the items around 
	    // to make it sorted order , low-to-high 
	    
		int[] nums = {1,4,5,2,77,45} ; 
	    
	    System.out.println(Arrays.toString(nums));
	    
	    // sort method from Arrays class 
	    // it take array object and sort it's items in ascending order 
	    Arrays.sort(nums);
	    
	    System.out.println(Arrays.toString(nums));
	    
	    // char array is sorted by ASCII Code value low to high 
	    
	    // ASCII Code value low to high 
	    // -- most of the special chars --numbers -- uppercase -- lowercase 
	    
	    
	    
	    
	    String name = "CybeterTek 123" ; 
	    char[] nameChars = name.toCharArray() ; 
	    
	    Arrays.sort(nameChars);
	    System.out.println(Arrays.toString(nameChars));
	      
	    // Sorting a string array , it's based on first character
	    // ASCII Code value low to high 
	        // -- most of the special chars --numbers -- uppercase -- lowercase 
	        
	    String[] names = {"abc","efg"," " , "123","Ku"} ; 
	    Arrays.sort(names);
	    System.out.println(Arrays.toString(names));
	    
	    // if multiple items have same first char 
	    // it will move on to compare the next character
	    String[] names1 = {"abc","afz","afZ"} ; 
	    Arrays.sort(names1);
	    System.out.println(Arrays.toString(names1));
	    
	    String[] names2 = {"a19999","a2","afZ"} ; 
	    Arrays.sort(names2);
	    System.out.println(Arrays.toString(names2));
	    
	    
	    
	    
	    
	    
	    

	  }

	}
