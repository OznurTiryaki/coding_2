package day22_April3;

public class SUbStringLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    // Task 2 
	          //0123456
	    String str = "ABCDEBC" ;
	    
	    // print 2 letter at a time compared to one from previous tasks
	    // ABCDE  --> AB BC CD DE EB BC
	    
	    // Count the number of BC on this Sting 
	    int count = 0 ; 
	    
	    for (int i = 0; i < str.length()-1; i++) {
	      
	      String twoChar =  str.substring(i,i+2) ; 
	      System.out.println(twoChar);
	      if(twoChar.equals("BC") ){
	        count ++ ; 
	      }
	      
	    }
	    System.out.println(count);
//	    System.out.println(str.substring(0,0+1) ); 
//	    System.out.println(str.substring(1,1+1) ); 
//	    System.out.println(str.substring(2,2+1) ); 
//	    System.out.println(str.substring(3,3+1) ); 
//	    System.out.println(str.substring(4,4+1) ); 
	    
	    
//	 // Task 2 
//        //0123456   more dynamic
//  String str = "java kava ava " ;
//  
//  // print 2 letter at a time compared to one from previous tasks
//  // ABCDE  --> AB BC CD DE EB BC
//  
//  // Count the number of BC on this Sting 
//  int count = 0 ; 
//  int countOfChars = str.length(); //kac karakter
//  String target = "ava" ;    
//  int targetLength = target.length();  3
//                        //
//  for (int i = 0; i < str.length()- targetLength+1 ; i++) {
//  
//    String word = str.substring(i, i + target.length() );
//    System.out.println(word);
//    
//    if (word.equals(target)) {
//      ++count;
//   }

//  }
  
	    
	    
	  }

	}
