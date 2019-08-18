package day5;

public class Vtask6 {

	public static void main(String[] args) {
		// INCREMENT AND DECREMENT- Example 3
		
		int pears = 3;
		
		
		          //   4     * 5 /  4      +    2
		int basket = ++pears * 5 / pears-- + --pears;
		
		/*ilk kisimda arti onde oldugu icin hemen deger yukselti ve 4 oldu
		 * ikinci kisimda eksi sonda oldugu icin hala 4 kaldi
		 * ucuncu kisimda bir onceki islemde bir azaldi 3 oldu
		 * ve eksi onde oldugu icin bir daha azaldi 2 oldu
		
		*/
		
		
		System.out.println(basket);
		
		System.out.println(pears); // 2 olarak kaldi value en son
		
		
		

	}

}
