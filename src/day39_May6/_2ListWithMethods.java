package day39_May6;

import java.util.*;

public class _2ListWithMethods {

	public static void main(String[] args) {
		

		List<String> lst = new ArrayList<>(); 
	    lst.add("apple"); 
	    lst.add("orange"); 
	    lst.add("banana"); 
	    lst.add("Kiwi"); 
	    
	    printItems(lst);
	    printItems(lst);
	    
	    
	    System.out.println(  getListFrom(7)  ) ; 
	    System.out.println(  getListFrom(17)  ) ; 
	    System.out.println(  getListFrom(3)  ) ; 
	    
	    
	    //System.out.println(numList);
	    
	  }
	  
	  public static void printItems(List<String> strLst ) {
	    
	    for (int i = 0; i < strLst.size() ; i++) {
	      
	      System.out.print(strLst.get(i) + " - "); //
	      
	    }
	    System.out.println();
	    
	  }
	  
	  // create a method that accept a number as ending point 
	  // and return List of Integer from 1 - that number 
	  public static ArrayList<Integer> getListFrom(int x ){
	    
	    ArrayList<Integer> numList = new ArrayList<>(); 
	    for (int i = 1; i <= x ; i++) {
	      numList.add(i); 
	    }
	    
	    return numList; 
	    
	  }
	  

	}
