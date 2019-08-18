package day15_March23;

public class NumberToChar {

	public static void main(String[] args) {
		

		int x = 100 ;
		
		char myChar = (char) x ; //you need to convert, int bigger than char
		
		System.out.println(myChar);

		double y = 100.99 ; 
		
		char myChar2 = (char) y ; 
		
		System.out.println(myChar2); //lost information
	}

}
