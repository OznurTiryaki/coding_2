package day64_july6;

import java.util.*;

public class CollectionIntro {

  public static void main(String[] args) {
    
    ArrayList<Integer> lst1 = new ArrayList<>();   
    
    List<Integer> lst2 = new ArrayList<>() ; //List is an interface and the have parent child relationship between them.
    
    Collection<Integer> lst3 = new ArrayList<>(); //Collection is an interface and the have parent child relationship between them.
    
    //Collection >List>ArrayList
    
    // lst3.get(0);     don't forget only reference type decide what you can access.
    //inside that interfaces just list have  INDEX THATS WHY IT IS NOT COMPILE
    
    
    System.out.println(  lst2.get(0)  );
    
    
  }

}
