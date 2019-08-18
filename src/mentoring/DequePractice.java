package mentoring;

import java.util.*;

public class DequePractice {

	public static void main(String[] args) {
	
		
		//two implementation LinkedList and ArrayDeque

		Deque <Integer> q= new ArrayDeque <>();
//		add();		

//		q.add(1);
//		q.add(2);
//		q.add(3);
//	    q.add(4);
//		q.add(5);   //[1, 2, 3, 4, 5]
//		
		
  //    push(element): Adds an element from tail to the head.
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5); //[5, 4, 3, 2, 1]
		
		
		System.out.println(q);
		

//		addFirst
	   q.addFirst(6);
	   System.out.println(q); //[6, 5, 4, 3, 2, 1]
	   
//addLast
	   
	   q.addLast(0);
	   System.out.println(q);   //[6, 5, 4, 3, 2, 1, 0]
		
//		pop():pop(element): Removes an element from the head and returns it.
	   
	   q.pop();
	   System.out.println(q);  //[5, 4, 3, 2, 1, 0]
	   
//		peekFirst();   Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	   
	   q.peekFirst();
	   System.out.println(q);
//	q.clear() ;  
//	System.out.println(q);  //[]
	
//		peekLast();  Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	
//	q.peekLast();
//	System.out.println(q); // []
	
	
//		remove();
	q.remove(3);
	System.out.println(q);  //[5, 4, 2, 1, 0]
	
//	q.clear();
//	System.out.println(q.remove());   //java.util.NoSuchElementException
	
//		removeFirst();
	
	System.out.println(q.removeFirst());  //5
	
//		removeLast();
	
	System.out.println(q.removeLast());   //0
		
	}

}
