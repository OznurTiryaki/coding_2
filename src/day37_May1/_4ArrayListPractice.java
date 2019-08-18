package day37_May1;

import java.util.*;

public class _4ArrayListPractice {

	public static void main(String[] args) {
		
		//where do we put the type of items
	    //we put it inside <> diamond operator
		
		

		

		

	   // where do we put the type of items 
	    // we put it inside <> diamond operator 
	    ArrayList<String> lst1 = new ArrayList<>(); 
	    
	    // this is possible to use List as type 
	    // this will be explained when we learn Inheritance topic
	    //List<String> ls2 = new ArrayList<>(); 
	    
	  //normalde list ve ArrayList icin ayri ayri import etmemiz lazim, fakat * yapinca buna gerek yok.
		
	    
	    
	    /// ArrayList is a class that we can use to create 
	    // arraylist objects 
	    // it has lost of built in functionality to work with data easily 
	    
	    // Adding items 
	    lst1.add("Yasar"); 
	    lst1.add("Kursat"); 
	    lst1.add("Erdem"); 
	    lst1.add("Emine"); 
	    lst1.add("Tugba"); 
	    lst1.add("Mavlida"); 
	    
	    // what we will see if we print out arrayList variable directly
	    // everything inside 
	    System.out.println(  lst1 );      
	    // getting single items we use get method and provide index

	    System.out.println(  "item 1 : " + lst1.get(0) ) ; 
	    System.out.println(  "item 2 : " + lst1.get(1) ) ; 
	    System.out.println(  "item 3 : " + lst1.get(2) ) ; 
	    System.out.println(  "item 4 : " + lst1.get(3) ) ; 
	    System.out.println(  "item 5 : " + lst1.get(4) ) ; 
	    
	    String str = lst1.get(5); 
	    System.out.println(  "item 6 : " + str ) ; 
	  
	    // getting the count of the items inside 
	    // we use size() method 
	    int count = lst1.size(); 
	    System.out.println(   "item count is : " + count );
	    
	    /// iterating over each items using loops 
	    //for (int i = 0; i < lst1.size() ; i++) {  
	    for (int i = 0; i < count ; i++) {
	      //System.out.println(  "item " + (i+1) + " : " + lst1.get(i)   );
	      System.out.println( lst1.get(i)   );
	    }
	    
	    
	    

	  }

	}
