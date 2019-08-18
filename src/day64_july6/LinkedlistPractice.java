package day64_july6;

import java.util.*;

public class LinkedlistPractice {

  public static void main(String[] args) {
    
    // List has two popular implementation 
    // ArrayList , LinkedList
    
    List<Integer> lst1 = new ArrayList<>(); 
            //lst1 = new LinkedList<>() ; 
    
    List<Integer> lst2 = new LinkedList<>(); 
    lst2.add(2) ;   // new Integer(2) ;  
    lst2.add(5) ; 
    lst2.add(8) ;
    lst2.add(1) ;
    
    for (int i = 0; i < lst2.size(); i++) {
      System.out.println(lst2.get(i) + " -  ");
    }
    
    System.out.println(lst2.toString() );
    
    //System.out.println(lst2);    we can write directly too
    
    lst2.remove(2);   //remove index 2 
    System.out.println(  lst2 );   
    lst2.remove( new Integer(5) );  //remove element 5
    System.out.println(  lst2 );  //this is only a problem for integer because of autoboxing.
    
    List<Long> lst3 = new LinkedList<>(); 
    lst3.add(1L) ;   // new Integer(2) ;  
    lst3.add(50L) ; 
    lst3.add(80L) ;
    lst3.add(10L) ;
    System.out.println(lst3); //[1, 50, 80, 10]
    
    // CAN WE PASS long TO 
    // A METHOD THAT ACCEPT int  -->> NO 
    
    lst3.remove(1L); // -->> new Long(1L) it makes autobox automatically;       if we say  lst3.remove(1) , instead of lst3.remove(1L) it remove index 1
    System.out.println(lst3);  //[50, 80, 10]
    
    
    
    /**
     * Arraylist 
     *   is backed by array 
     *   whenever we try to add or remove item 
     *   it's automatically resizing underlying array 
     *   for us , so we can just call the method  
     * 
     * 
     * 
     */
    
    
    // Adding items 
       // linkedList is faster 
        // because it just need to create new pointer to the neiboughr
       // ArrayList relatively slower because of 
          // resizing operation in underlying array 
    
    // removing items 
       // linkedList is faster 
        // because it just need to create new pointer to the neiboughr
       // ArrayList relatively slower because of 
          // resizing operation in underlying array 
        
    // ACCORDING TO ABOVE SITUATION 
      /**
       * if you have situation that you have to alwayse add or 
       * remove items intensively , Linkedlist is better
       */
    
    //  get(4)   / random access by index 
    
      // ArrayList is faster because it can directly 
      // jump to the element since it's backed by array 
      
      // linkedList is slower because it has to go through 
        // each and every neiboughr before the element 
    
    /**
     * if you have situation that you have to always randomly 
     * access items by it's index , ArrayList is faster 
     */ 
       
    
      
    
    
    
    
    
    
    

  

  }

}