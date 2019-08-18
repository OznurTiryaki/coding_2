package day20_March31;

public class DoWhilePractice {

	public static void main(String[] args) {

		int x = 100;

		do {
			System.out.println("action refeated");  //eger while loop ile yapsaydik hic yazdirmayacakti ilkini 
			                                         //cunku condition false

		} while (x > 200); // condition false oldugu an looptan cikar, and while loopta once check ettigi icin 
                           //direk end e duser
		System.out.println("End");
	}

}
