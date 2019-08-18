package day26_April10;

import java.util.Arrays;

public class Array6CharArrayToString {

	public static void main(String[] args) {
		

		String str1 = "Muattar" ;
		
		char [] nameChars = str1.toCharArray();
		
		System.out.println(Arrays.toString(nameChars));

		String str2 = ""; //
		
		for (int i =0; i <nameChars.length ; i ++) {
		
			char c = nameChars[i];
			
			str2 =str2 +c ;
			//System.out.println(c + " ");
		}
		
		System.out.println(str2);
		
//		 String str2  = new String( nameChars  ) ;      or we can do like this
//		    System.out.println( str2);
	
	
	}

}
