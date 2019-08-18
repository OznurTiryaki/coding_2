package day64_july6;

import java.util.*;

public class TreeSetExamples {

  public static void main(String[] args) {
    
    // SortedSet interface extends Set interface
    // TreeSet implements SortedSet 

    Set<Integer> myTreeSet3 = new TreeSet<>(); 
    
    SortedSet<Integer> myTreeSet2 = new TreeSet<>(); //is a relation
    
    //HashSet<Integer> myTreeSet4 = new TreeSet<>();  // BAD !!!!
    //Hashset implement set, TreeSet implement Sorted Set but Hashset and TreeSet
    //doesnt have any relation
    
    TreeSet<Integer> myTreeSet = new TreeSet<>(); 
    myTreeSet.add(23) ;
    myTreeSet.add(23) ;
    myTreeSet.add(23) ;
    myTreeSet.add(3) ; 
    myTreeSet.add(3) ; 
    myTreeSet.add(3) ; 
    myTreeSet.add(13) ; 
    myTreeSet.add(20) ; 
    myTreeSet.add(-230) ;
    
    System.out.println( myTreeSet  );  // [-230, 3, 13, 20, 23]  remove dublicate
    System.out.println( myTreeSet.size() );  // 5
    
    // GETTING LOWERST ELEMENT 
    System.out.println("LOWERST ELEMENT  : " + myTreeSet.first());
    
    // GETTING HIGHEST ELEMENT 
    System.out.println("HIGHEST ELEMENT  : " + myTreeSet.last());
    
    
    // GETTING THE VIEW OUT OF THE SET -subSet()
    //3 den 20 e kadar alir. 20 exclusive
   
    SortedSet<Integer> myView = myTreeSet.subSet(3, 20) ; 
    System.out.println( myView );
    
    // GETTING THE VIEW OUT OF THE SET -headSet()
    //head set o rakamdan oncekileri yazdirir 
   
    SortedSet<Integer> myView2 = myTreeSet.headSet(13) ;
    System.out.println( myView2 ); //[-230, 3]
  
    System.out.println(myTreeSet.headSet(13));//[-230, 3] 
    //bu sekilde direk de methodu kullanabilirz
    
    
    // GETTING THE VIEW OUT OF THE SET -tailSet()
    
    SortedSet<Integer> myView3 = myTreeSet.tailSet(13) ; 
    System.out.println("my TreeSet.tailSet(13) : "+myView3);
    //[13, 20, 23]  from value to end 
  }

}
