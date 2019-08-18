package day5;
import java.util.Scanner;



public class Vtask3 {

	public static void main(String[] args) {
		
		//Scanner Class
 // kullanicida bilgi almak icin scanner classini kullanicaz
		
		Scanner scan = new Scanner(System.in);
		
		//yanda uyari cikacak ve bize tanimla scanneri diyecek
		//orada import java util'i seciyorsun
		
		System.out.println("Bir sayi giriniz");
		
		/*int a= scan.nextInt(); // bu kullanicidan bilgiyi beklemek icin, sayiyi bekliyoruz
	 almak istedigimiz deger double vs ise degiskeni de o sekilde degistirmelisim
		 seklinde degistirmek lazim
		
		System.out.println("a degiskeninin degeri " +a); */
		
	
        double a= scan.nextDouble();
		
		System.out.println("a degiskeninin degeri " +a);
		
		/* ya da degeri string olarak degistirip 
		 * 
		 * System.out.println("Bir yazi giriniz");
		 * String a= scan.nextLine ();
		 * System.out.println("a degiskeninin degeri " +a);
		 */
		
	}

}
