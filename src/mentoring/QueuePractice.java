package mentoring;

import java.util.*;

public class QueuePractice {

	public static void main(String[] args) {

//		Queue methods
		
		
		Queue <Integer> q= new LinkedList <>();
		
		
		// add(e);  => insert -- form collection
		
		// offer(e);  => insert --from Queue 
				
		q.offer(1);
		q.add(2);
		q.add(3);
		q.offer(4);
		q.offer(4);
		q.add(5);
		q.offer(4);
		q.addAll(Arrays.asList(6,7,8,9,10));
		
		
		
		System.out.println(q);  //[1, 2, 3, 4, 4, 5, 4, 6, 7, 8, 9, 10]  
		
		
		// remove();  => remove ==> It throws NoSuchElementException when the queue is empty.
		
		
		System.out.println(q.remove(1)); //true
		
		System.out.println(q.remove(11)); //false
		
		System.out.println(q); //[2, 3, 4, 4, 5, 4, 6, 7, 8, 9, 10]
		
		q.clear();
		
////		System.out.println(q.remove());  //Exception in thread "main" java.util.NoSuchElementException
//		
//	
//		// poll();     => remove
//		
//		System.out.println(q.poll());  //null
//		
		// element();   => examine  //NoSuchElementException
		
		System.out.println(q.size());  //0
		System.out.println(q.element());  //java.util.NoSuchElementException
		
		
//		System.out.println(q.peek()); //null
		
		
	}

}
