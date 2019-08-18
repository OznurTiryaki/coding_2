package day64_july6;

import java.util.*;

public class SubListPractice {

  public static void main(String[] args) {

    List<Double> lst = new ArrayList<>();
    lst.add(2d);   //be careful it not do 2 steps together. It already do autoboxing.It doesn't do autoboxing.
                    //if we don't put d end of number , it give us compile error.
    lst.add(5d);
    lst.add(8d);
    lst.add(13d);
    lst.add(12d);
    lst.add(111d);
    lst.add(7d);
    
    System.out.println(lst);    
    // we can get the view out of the list 
    // using sublist which is linked to original list     
    List<Double> partOflist = lst.subList(2, 6) ; //it gets from index 2 to 5 -looks like substring methods.
    
    System.out.println(partOflist);
    System.out.println("PART OF LIST FIRST ITEM "+ partOflist.get(0));
    partOflist.set(0, 8.99999999); //bunu set ettigimizde original listtekini de degistirdi.cunku birbirine baglantili
    System.out.println("==================changed the sub list result =======================");
    
    System.out.println(lst);    
    System.out.println(partOflist);
    
    // what if we want to create an independent list with portion of 
    // the original list items  use new ArrayList 
    
    List<Double> independentLst = new ArrayList<>( partOflist   ) ; 
    List<Double> independentLst2 = new ArrayList<>( lst.subList(2, 6) ) ; 
    
    independentLst.set(0, 9.9999) ; //now update not effect original one because
                                    //we create independent with new keyword
    System.out.println(independentLst);  //[9.9999, 13.0, 12.0, 111.0]
    System.out.println(lst);  //[2.0, 5.0, 8.99999999, 13.0, 12.0, 111.0, 7.0]
    
    
    System.out.println("======================================================================= ");  
    for(Double each:lst) {
    	System.out.println("item value " +each);
    }
    
   // optional with lambda
   System.out.println("======================================================================= ");  
lst.forEach(each-> System.out.println("item value "+each));
  }

}

