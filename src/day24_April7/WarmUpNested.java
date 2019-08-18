package day24_April7;

public class WarmUpNested {

	public static void main(String[] args) {
		// WARM UP TASKS
        /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */

		for (int x =0 ; x<5 ; x ++) {
		for (int y =0 ; y<5 ; y ++) {
			System.out.print("java" + " ");
		}
		System.out.println();
		}
		
		//TASK2
		
		for (int x =1 ; x <=5 ;x++) {   //eger index or ise numara givi genelde 1 den basla
			
			for (int y =1 ; y <= x ; y ++) { //x e esitledigimizde looptan z den kucuk oldugu an al lopptan cikip
				                           //ustten devam ediyor. sayi ne kadarsa o kadar tekrar ediyor.
			System.out.print(x + " ");
			}
			System.out.println();
		}
			
		//Task3
		
		for (int i ='A' ; i <='Z' ; i ++) {
		for (int j = 'A' ; j <= i ; j ++) { //we need to do casting to see character not number

			System.out.print((char)j + " ");	
				
		}
		System.out.println();
		}
		
		
		
		
//  actually we do this with loop
//	    for (int j = 1; j <= 1; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 2; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 3; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 4; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
//	    for (int j = 1; j <= 5; j++) {
//	      System.out.print(j + " ");
//	    }
//	    System.out.println();
	    
	    
	    
		
	
	}
}
