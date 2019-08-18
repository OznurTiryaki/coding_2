package day65_july14;

import java.util.*;



public class IteratingThings {
	
	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<>(); //we can use Collection as a reference type and create a Arraylist object
		                                             //because of Polymorphism
				
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(10);
		nums.add(32);
		nums.add(51);
//		for (Integer each : nums) {
//			System.out.println( "each : " + each);
//			if(each>10) {
//				nums.remove(each) ; 
//			}
//		}
		
		System.out.println(nums);

	// 	[1, 3, 5, 10, 32, 51] 51 is a still there, it doesnt remove eveything
		
		// creating Iterator instance by calling  iterator() method 
		
		 Iterator<Integer> myIter = nums.iterator(); //iterator is a interface
		 
		 System.out.println("myIter.hasNext() " +  myIter.hasNext()  ); //hasNext() check have next element or not-boolean 
		 
	//	 next() ==>  method check the next element-jump next item

		 
		 while( myIter.hasNext() ) {//yani son itema kadar kontrol eder. elemanlari bittiginde falsea doner ve looptan cikar.
			 
			 Integer each = myIter.next(); 
			 System.out.println(  each ); //oncesinde hepsini yazdirir sonra kontrol ettiginde
			                             
			
			 if( each > 9) {
				 myIter.remove(); //sonra control ettiginde remove eder ve listi en son print ettigimizde [1, 3, 5] kalir.
			 }
			 
		 }
		 System.out.println( nums  );
		 
		 //System.out.println("myIter.next() " +  myIter.next()  );
		 
//		 System.out.println("myIter.next() " +  myIter.next()  );
//		 System.out.println("myIter.next() " +  myIter.next()  );
//		 System.out.println("myIter.next() " +  myIter.next()  );
////		 System.out.println("myIter.next() " +  myIter.next()  );
////		 System.out.println("myIter.next() " +  myIter.next()  );
////		 System.out.println("myIter.next() " +  myIter.next()  );
//		 
//		 System.out.println("myIter.hasNext() " +  myIter.hasNext()  );
//		 System.out.println("myIter.next() " +  myIter.next()  );
//		 
//		 myIter.remove();
		 
		//System.out.println( myIter  ); //to print it we cannot print iterating name
		 
		 //System.out.println( nums  );
		 
		
	}	
	}