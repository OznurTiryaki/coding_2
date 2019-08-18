package day65_july14;

import java.util.*;

public class QueueInterface {

	public static void main(String[] args) {
		
		
		//  Collection 
		// 	Queue Interface  extends Collection interface 
		//  LinkedList , PriorityQueue
		
		Queue<Integer> queue = new LinkedList<>(); 
		/*
		 * Summary of Queue methods
			          Throws exception	Returns special value
			Insert	   add(e)	            offer(e)
			Remove	   remove()	            poll()
			Examine	   element()	        peek()
		 * 
		 * */	
		queue.offer(10); //first in first out. ilk eklenen ilk remove olur
		queue.offer(20); //eger emty olursa NoSuchElementException verir.
		queue.offer(30); 
		queue.offer(40); 
		queue.offer(20); 
		
		while( ! queue.isEmpty() ) {
			
			
			System.out.println("PROCESSING AND REMOVING " + queue.poll() );
			//eger emty olursa NULL verir.
		}
		
//		System.out.println(  queue );
//		
//		System.out.println("REMOVING FROM HEAD : " + queue.remove() ) ; 
//		System.out.println("REMOVING FROM HEAD : " + queue.remove() ) ; 
//		System.out.println("REMOVING FROM HEAD : " + queue.remove() ) ;
//		System.out.println("REMOVING FROM HEAD : " + queue.remove() ) ; 
//		System.out.println("REMOVING FROM HEAD : " + queue.remove() ) ;  //eger emty olursa NoSuchElementException verir.
//		
//		System.out.println("REMOVING FROM HEAD : " + queue.poll() ) ;
//		
//		System.out.println("DO YOU HAVE NEXT ELEMENT: " + queue.peek() ) ;
		
		

	}

}