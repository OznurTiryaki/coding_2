package day20_March31;

public class BeforeLoopEra {

	public static void main(String[] args) {
		// LOOP BURADA YAPTIGIMIZ SEYI UZUN UZUN YAZDIRIYOR.

		int x = 1;
		int sum = 0;

		if (x < 5) {

			sum = sum + x;

			System.out.println(sum);
			x++;
		}
		if (x < 5) {
			sum = sum + x;
			x++;
			System.out.println(sum);
		}
		if (x < 5) {
			sum = sum + x;
			x++;
			System.out.println(sum);
		}
		if (x < 5) {
			sum = sum + x;
			x++;
			System.out.println(sum);
		}
		if (x < 5) {
			sum = sum + x;
			x++;
			System.out.println(sum);
			
		}
		if (x < 5) {      //MESELA ARTIK X 5 GECTIGI ICIN ONU YAZDIRMADI
			sum = sum + x;
			x++;
			System.out.println(sum);
		}
	}
}
