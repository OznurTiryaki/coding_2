package mentoring;

import java.util.*;


public class Day2Set2 {

	public static void main(String[] args) {
		
		NavigableSet<Long> longTreeSet = new TreeSet<>(); //poly
	
		System.out.println(longTreeSet.add(1L));  //true
		System.out.println(longTreeSet.add(2L));  //true
		System.out.println(longTreeSet.add(3L));  //true
		System.out.println(longTreeSet.add(1L));  //false
		
		longTreeSet.addAll(Arrays.asList(15L,18L,15L,18L));
		
		System.out.println(longTreeSet); //[1, 2, 3, 15, 18]
		
		//Navigable Set Methods
		
		
//		 Lower(E e) : 
		
		System.out.println(longTreeSet.lower(3L)); //2
		
		
//		 Floor(E e ) :
		
		System.out.println(longTreeSet.higher(15L)); //18
		
//		 Ceiling(E e) :  ---greater or equal
		
		System.out.println(longTreeSet.ceiling(4L)); //15
		
//		 Higher(E e) :--greater
		
		System.out.println(longTreeSet.higher(16L)); //18
		
//	     pollFirst() : ---if there is not first element return null not a no such element exception 
		
//		longTreeSet.clear();  //removeAll
		
		System.out.println(longTreeSet.pollFirst());  //null  //1
		
		
//		 pollLast() :
		
		System.out.println(longTreeSet.pollLast());  //null  //18
		
//descendingSet();		larger to smaller/reverse
		
		
		System.out.println(longTreeSet); //[2, 3, 15]   
		
		System.out.println(longTreeSet.descendingSet()); //[15, 3, 2]
			
	}

}
