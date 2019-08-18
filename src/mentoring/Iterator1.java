package mentoring;

import java.util.*;

public class Iterator1 {

	public static void main(String[] args) {
		
	
	//Iterable ---super interface
	//iterator have 3 methods --->cool.iterator();
	//hasNext()--->return boolean 
	//next()--> gives us the next elements
	//remove--> it removes element
	
	
	Collection <Integer> cool= new ArrayList <> (Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	//List Iterator
	List<Integer> list = new ArrayList<>(); 
	 list.add(2) ;   // new Integer(2) ;  
	 list.add(5) ; 
	 list.add(8) ;
	 list.add(1) ;
	 list.add(7) ;
	
	 ListIterator  <Integer> listIter= list.listIterator();
	
	 
//	hasNext() --> return boolean 
	System.out.println(listIter.hasNext());   //true

//next()==>give next element
	
//	System.out.println(listIter.next()); //2 --0 index
//	System.out.println(listIter.next());   //5   ---1 index
	
//nextIndex();
//	System.out.println(listIter.nextIndex());  //2  ---2nd index
	
	System.out.println("==================");
	
	while (listIter.hasNext()){
	
	Integer each=listIter.next();
	System.out.println(each);
	
	if(each<=2) {
		listIter.remove(); //[5, 8, 7]
}
	}
	System.out.println(list);

	
	System.out.println("==================");
	
//previous();
	System.out.println(listIter.previous());  //7
	System.out.println(listIter.previous());  //8
//previousIndex();
	
	while (listIter.hasPrevious()){  //boolean 
		
	
		System.out.print("list previous index :  " + listIter.previousIndex());
		Integer item= listIter.previous();
		System.out.println (" | The item is " + item );
		
		if(item<8) {
			
			listIter.remove();  // [8, 7]

		}
		
		}
		System.out.println ( list );
		

	
	
}
}
