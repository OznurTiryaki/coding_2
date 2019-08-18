package day15_March23;

public class ComparisionOperatorOnChar {

	public static void main(String[] args) {
		
		// comparison/ relation operator
		
		char c1 = 'A' ;   //ASCI tablosundaki degerlerine gore bakiyoruz
		
		char c2 = 'B' ;
		
		System.out.println(c1 == c2);
		
		System.out.println(c1 != c2);
		
		System.out.println(c1 >= c2);
		
		System.out.println(c1 < c2);
		
		System.out.println(c1 <= c2);
		
		
		c1 = 'a' ;
		
		System.out.println( (int) c1);   //lowerase bigger than upper case at table
		

		System.out.println( (int) c2);
		
		char c3 = ' ';
		
		System.out.println( (int) c3);  //space is lowest one
		
	//	lowercase> uppercase>number>special character  ( higher  to lower ASCII value )
	}

}
