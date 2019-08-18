package day4;

public class Task5 {

	public static void main(String[] args) {
		
		//ARITMETIC OPERATORS
		
		
		int i = 13;
		int j = 5;

		System.out.println("The result of multiplication is ---" + (i + j) + ".The result of subtraction is ---"
				+ (j - i) + ".The result of divison is ---" + (i / j));

		// sonuc kalanli ise ve tam sonuc cikasini istiyorsan double ile yazman lazim

		/*
		 * biri int biri double yazarsan sonucu buyuk olana gore alir ve tum sayilari
		 * kalanli yazar. tam sayilari da ex:12.0 gibi yazar
		 */

		int a = 12;
		double b = 5;

		System.out.println("The result of multiplication is:" + (a + b) + ".The result of subtraction is:"
				+ (a - b) + ".The result of divison is:" + (a / b) + "." + " The remainder of division is:" + (a%b));

		// "\n" ile sonuclari alt alta new line a gecerek sonuclari alt alta yazdirdim
		
		System.out.println("The result of multiplication is:" + (a + b) + "\n" + "The result of subtraction is:"
				+ (a - b)+ "\n" + "The result of divison is:" + (a / b) + "."+ "\n" + "The remainder of division is:" + (a%b));

	}

}
