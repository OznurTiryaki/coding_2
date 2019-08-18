package mentoring;

import java.util.*;

public class Day2Set {

	public static void main(String[] args) {
	
//		Set interface  define a data structure of unique element
//		It does not have concept of index --NO INDEX
//		It does not maintain insertion order 
//		It doesn’t accept multiplication

		SortedSet<Long> longTreeSet = new TreeSet <>();

		System.out.println(longTreeSet.add(1L));  //true
		System.out.println(longTreeSet.add(2L));  //true
		System.out.println(longTreeSet.add(3L));  //true
		System.out.println(longTreeSet.add(1L));  //false
		
		System.out.println(longTreeSet); //[1, 2, 3]
		 
		longTreeSet.addAll(Arrays.asList(15L,18L,15L,18L));
		
		System.out.println(longTreeSet); //[1, 2, 3, 15, 18]
		
		//subSet (from elements, to elements--exclusive)
		System.out.println(longTreeSet.subSet(3L, 18L)); //[3, 15] exclusive last elements
		
		//headSet(from beginning -to element--exclusive)
		
		System.out.println(longTreeSet.headSet(18L));  //[1, 2, 3, 15]
		
		//tailSet (from element--inclusive-- to last elements)
		
		System.out.println(longTreeSet.tailSet(3L)); //[3, 15, 18]	 
		
		///ALL method LINKED with orijinal set
		
		SortedSet<Long> linked = longTreeSet.tailSet(3L);
		
    //before upload
		System.out.println("Before Upload linked Set: "+ linked);  //[3, 15, 18]
		
		System.out.println("Before Upload Set: "+longTreeSet); //[1, 2, 3, 15, 18]
		
		linked.remove(15L); //true
	//after upload	
		System.out.println("After Upload linked Set: "+linked); // [3, 18]
		
		System.out.println("After Upload Set: "+longTreeSet);  //[1, 2, 3, 18]  --15  
		
		
		
		

	}

}
