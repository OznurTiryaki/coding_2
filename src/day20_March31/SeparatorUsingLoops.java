package day20_March31;

public class SeparatorUsingLoops {

	public static void main(String[] args) {
		// java20awesome------>javaawesome 20

		String mix = "Aonline132x";

		int i = 0; // this our starting index
		String numberStr = "";
		String azStr = "";
		while (i < mix.length()) {

			char c = mix.charAt(i);

			if (c >= '0' && c <= '9') { // print 132 because just them in condition 0 ya da 9 yerine harf yazsak onlari
										// yazacakti
				System.out.println(c);
				numberStr = numberStr + c;
			}

			i++;

		}
		System.out.println(numberStr);
		
		System.out.println("**********************");

		int y = 0 ; 
	    
		do {
	      
	      char c = mix.charAt(y);
	      
	      
	      if(c  >= 'a' && c  <= 'z') {
	        System.out.println(c);
	    	azStr = azStr + c;
	        
	      }
	      y++; 
	      
	    } while (y< mix.length());
	    
	    
	    System.out.println(  azStr );

	}

}
