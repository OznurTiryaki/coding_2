package day27_April13;

import java.util.Arrays;

public class Array9ArrayEquality {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1,3,4,65,2} ; 
	    int[] arr2 = {1,3,4,65,2} ; 
	    int[] arr3 = {3,1,4,65,2} ; 
	    
	    // comparing two variable 
	    // it will alwayse check whether they have 
	    // same exact thing stored inside the variable 
	    System.out.println(  arr1==arr2  );// you cannot compare like that
	  
	    /*if we say int[] arr1 = {1,3,4,65,2} ;
	   *          int[] arr2 = arr1; 
	   *  System.out.println(  arr1==arr2  ); o zaman bu true verir cunku ikisi ayni memoryi kullaniyor
	   * 
	   * 
	   */
		
	    // Arrays class has equals method to check whether 2 array 
	    // has same content or not 
	   
	    
 boolean compare1 = Arrays.equals(arr1, arr2); //true
	    
	    System.out.println(compare1);
		
		
  boolean compare2 = Arrays.equals(arr1, arr3);
	    
	    System.out.println(compare2);   ///false
		
		
  Arrays.sort(arr3);  //rakamalr ayni ama siralama farkli
  Arrays.sort(arr1);    
	    boolean compare3 = Arrays.equals(arr1, arr3); //true after sort
	    
	    System.out.println(compare3);
			
		
		
		
	    
	    

	  }

	}