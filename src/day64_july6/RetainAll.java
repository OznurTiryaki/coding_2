package day64_july6;

import java.util.*;
import java.util.Set;

public class RetainAll {

  public static void main(String[] args) {
    
    
    List<Integer> mylst = Arrays.asList(3,3,3,4,7,5,33,55) ; 
    
    // ANY TYPE OF COLLECTION HAS A CONSTRUCTOR TO TAKE 
    // ANOTHER COLLECTION OBJECT SO IT CAN COPY EVERYTHING INSIDE 
    Set<Integer> mySet = new HashSet<>( mylst ) ; 
    System.out.println(mylst); //[3, 3, 3, 4, 7, 5, 33, 55]
    System.out.println(mySet); // [33, 3, 4, 5, 7, 55] it removes dublicated
   //it changed order too don't care about order
    
    Set<Integer> mySet2 = new HashSet<>( Arrays.asList(3,3,3,3,3,3,34,34) ) ; 
    System.out.println(mySet2.size());  //2
    System.out.println(mySet2);  //[34, 3]
    /// remove all will cut the items that exists in both collection 
    //mySet.removeAll(mySet2) ;   remove common part but retainAll keep common part
    //System.out.println(mySet);
    
    // retainAll -- will keep the common part of two collection 
    mySet.retainAll(mySet2) ; 
    System.out.println(mySet); // [3]
    
    
    
  }

}
