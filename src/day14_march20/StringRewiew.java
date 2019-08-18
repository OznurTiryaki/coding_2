package day14_march20;

public class StringRewiew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name = "Oznur";
		
		System.out.println(name.length()); //kac harf oldugunu hesaplar
		
		System.out.println(name.toUpperCase());  //cover to all letter uppercase
		
		System.out.println(name.toLowerCase()); //cover to all letter lowercase
		
		char secondChar = name.charAt(2);
		
		System.out.println(secondChar);     //ismin icindeki characteri bulmak icin bulunuyor.
		//System.out.println(name.charAt(2); it is exactly same, you dont need to create variable
		
		int lastCharacter = name.length()-1; //you don't need to write this..
		System.out.println(name.charAt(name.length()-1));
		
 		
//		first character index is always 0
//		last character index is always one less than actual count of character
//		
//		word.length()-1  -----but if we take a input for word 
//		
//		System.out.println(word.charAt(word.length()-1));
//		
//		
//		
//		length () no taking external data and returning a number
//		
//		charAt(1) one external data/argument and returning data
	}

}
