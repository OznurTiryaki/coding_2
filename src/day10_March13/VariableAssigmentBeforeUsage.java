package day10_March13;

import java.util.Scanner;

public class VariableAssigmentBeforeUsage {

	public static void main(String[] args) {
		
	    int i =0;   //     int i ; dersek sadece assign etmedigimiz icin hata verdi
		
		//if local cariable has a single chance
		//to not get a value before usage,
		//compiler will not compilee the code
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to give value to i :");
		
		String yesNoAnswer = scan.next(); //yes no olarak cevap verip vermedigini ogrenmek icin
		                                   // equality yapmamiz lazim
		
		
		if ( yesNoAnswer.contentEquals("yes")) {
			
			System.out.println("You said yes");
			
			System.out.println("Enter your number");
			
			 i = scan.nextInt();
			
		//	i=10; yani buraya girersek ve hayir derse elimizde i nin degeri yok ve compile olmaz
			//bu yuzden yukarida sifir degeri veriyoruz i ye
		}
		
		System.out.println(i); // before use any local valuable we need to asssign value

	}

}
