package day11_March16;

public class TernaryOperator2 {

	public static void main(String[] args) {
		
		// Nested Ternary Conditional Statement
		
		
		int discount;
		
		int bill = 1400 ;
		
		int quantity = 11 ;
//    if (bill > 1000) {
		
//      if (quantity > 11 ) {
		
//        discount = 10 ;
//    
//		  }else {

//        discount = 9;
			  
//      } else {
//         discount = 5;
//		}
		 
		discount = (bill >1000) ? (quantity > 11 ) ? 10 : 9 : 5 ;
		
		System.out.println (discount);  
		
		}	  
	}


