package day19_March30;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner (System.in);
		
		String sentence="";
	 
		while (! sentence.toLowerCase().contains("java")) { //eger lower case olacaksa parantez ici de oyle olacak
			                                                //burada equal ignore case kullanamazsin ya ayirip 
			                                                 //cift kondition yapacaksin equals case just check whole sentences
		 
			System.out.println("Do you love Java?, Enter a sentences contains Java");
			
			 sentence = scan.nextLine();
		 
	 }
		System.out.println("Correct answer, Java love you too :)");
	}

}
