package day42_May11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReverse {

	public static void main(String[] args) {

		ArrayList<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
		
		System.out.println(lst1);
		
		// creating a new list and adding items from the back will just work 
		
		ArrayList<Integer> lst2 = new ArrayList<>(); 
		
		for (int i = lst1.size()-1 ; i>=0 ; i-- ) {
			
			//System.out.println(lst1.get(i) ) ;
			lst2.add(  lst1.get(i)   ) ; 
		}
		//System.out.println(lst2);
		
		
		// new requirement -- DO NOT CREATE NEW LIST , JUST MODIFY ORIGINAL LIST 
		
		// swap first item with last item
		
		 // storing first item value in temp 
//		Integer temp = lst1.get(0);  
//		// updating first item value to last item value
//		lst1.set(0, lst1.get( lst1.size() -1)  ); 
//		// updating last item value to original first item value 
//		lst1.set(lst1.size() -1 , temp) ; 
//		
//		System.out.println(lst1);

		
//		// swapping 1st item with 5th item 
//		Integer temp = lst1.get(0);  
//		lst1.set(0, lst1.get(5 -1)  ); 
//		lst1.set(5 - 1 , temp) ;
//		
//		// swapping 2nd item with 4th item 
//		temp = lst1.get(1);  
//		lst1.set(1, lst1.get(5 -2)  ); 
//		lst1.set(5 - 2 , temp) ;

		for(int i = 0 ; i < lst1.size()/2 ; i ++ ) {
			
			Integer temp1 = lst1.get(i);  
			// updating first item value to last item value
			lst1.set(i, lst1.get( lst1.size() -1 -i )  ); 
			// updating last item value to original first item value 
			lst1.set(lst1.size() -1- i , temp1) ;

		}
		
		
		
		
		
		
		
		
		
		
		

	}

}