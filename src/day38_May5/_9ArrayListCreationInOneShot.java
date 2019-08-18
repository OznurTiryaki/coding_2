package day38_May5;

import java.util.*;

public class _9ArrayListCreationInOneShot {

	public static void main (String [] args) {
		//INTERVIEW QUESTIONS

		  
	    // Arrays.asList(var arg) can be used to 
	    // add items while object is being created 
	    
	    // However , 
	    // 1 , The variable type MUST BE A LIST 
	    // because the method return List not ArrayList 
	    // 2 , It will generate a unmodifiable list 
	      // can not add or remove item 
	    // add or remove operation is forbidden 
	    // update will work by using set 
	    List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3);   
	    //lst.add(100) ;   // does not work 
	    //lst.remove(0);   // does not work 
	    //lst.set(0, 100); //  work 
	    System.out.println(  lst );
	    
	    // Since we can not add or remove item from above list 
	    // we want to copy everything from the list 
	    // into the new list that we can modify 
	    
	    ArrayList<Integer> myCoolList = new ArrayList<>( lst ); 
	    myCoolList.add(100); 
	    myCoolList.remove( Integer.valueOf(3) ); 
	    System.out.println(myCoolList);
	    
	    
	    
	    
//	    List<String> JLA = Arrays.asList("Superman","Batman","Wonder Woman"); 
//	    System.out.println(  JLA );
	    
	    
	    ArrayList<String> JLA=
	     new ArrayList<>( Arrays.asList("Superman","Batman","Wonder Woman") ); 
	        
	    JLA.add("Flash"); 
	    JLA.add("Thanos") ; 
	    JLA.remove("Thanos") ; 
	    System.out.println(JLA);
	    
	    
	    
	    

	  }

	}