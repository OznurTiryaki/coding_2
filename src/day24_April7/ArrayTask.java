package day24_April7;

public class ArrayTask {

	public static void main(String[] args) {
		
	
	 char characters [] = new char[5]; 
		
		characters [0] =  'O' ;
		characters [1] =  'z' ;
		characters [2] =  'n' ;
		characters [3] =  'u' ;		
		characters[4] =  'r' ;	
		
//		System.out.print(characters [0] + " ");    for yapazsak bu sekilde uzun uzun yazmamiz lazim
//		System.out.print(characters [1] + " ");
//		System.out.print(characters [2] + " ");
//		System.out.print(characters [3] + " ");
//		System.out.print(characters [4] + " ");
//		
		System.out.println();
		
		for(int x =0 ; x <characters.length; x ++) {   //  character.length bu bize count'u vermez uzunlugu verir yani 5 
			                                          // bu yuzden sadece < kullanacagiz or <= vee -1 seklinde yapacagiz
		System.out.println(characters [x] + " ");
		}
		
		char[] chr = new char[] {'O','z','n','u','r'} ; 
		
		for(int x =0 ; x <=4 ; x ++) {
			System.out.print(chr [x]);
		}
		
		
		System.out.println();
		
		char[] character = new char[8];
		
		character [0] = 'b';
		character [1] = 'e';
		character [2] = 'n';
		character [3] = 'j';
		character [4] = 'a';
		character [5] = 'm';
		character [6] = 'i';
		character [7] = 'n';
		
		for (int x = character.length-1 ; x >=0 ; x-- ) {
	    	 System.out.print(character [x] + " ");
	     }
		
        /// how do we get last items 
		System.out.println();
	     int count = character.length ; 
	     
	     System.out.println( "item in last index : " +  character[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " + character[midIndex] );
	     
	     //geriye dogru yazdirma reverse
	     
	    
	     

		
		
		
		
	
		
	}

}
