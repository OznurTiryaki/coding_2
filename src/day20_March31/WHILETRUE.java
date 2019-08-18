package day20_March31;

public class WHILETRUE {

	public static void main(String[] args) {

		int x = 0;

		while (true) { // true always true. it goes forever. we need to put break

			x++;
			System.out.println("ACTION");

			if (x == 10) {  //break koydugumuzda 10'da durdu
				break;
			}
		}
	}
}