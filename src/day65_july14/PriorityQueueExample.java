package day65_july14;

import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		
//		Queue<Integer> pQue = new PriorityQueue<>( ) ; 
//		pQue.offer(10);  //When it add a element. It makes a sort.
//		pQue.offer(50); 
//		pQue.offer(30); 
//		pQue.offer(40); 
//		pQue.offer(5);
//		
//		System.out.println( pQue  );  //[5, 10, 30, 50, 40]
//		
//		while(! pQue.isEmpty()) {
//			
//			System.out.println( pQue.poll());
//			
//		}
		
		
//		 THIS IS HOW WE CAN CREATE COMPARATOR of Integer in reversed order 
		
		// priorityQueue maintian internal natural order for data type 
		// we can also provide our custom comparator
		//Collection<Integer> revAgeCom = Comparator.reverseOrder(); or COmparator we can use
		Comparator<Integer> revAgeCom = Comparator.reverseOrder(); 
		Queue<Integer> pQue = new PriorityQueue<>( revAgeCom) ; 
		pQue.offer(10);  //When it add a element. It makes a sort.
		pQue.offer(50); 
		pQue.offer(30); 
		pQue.offer(40); 
		pQue.offer(5);
		
		System.out.println( pQue  );  //[50, 40, 30, 10, 5]
		
		while(! pQue.isEmpty()) {
			
			System.out.println( pQue.poll());  
			
		}
		

	}

}