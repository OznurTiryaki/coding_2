package day21_April2;

public class StringAndLoop {

	public static void main(String[] args) {

//       while  loop
//		use for loop to print name char by char
//		and print reverse order char by char
//		optinally save it into another variable

		String name = "Oznur";

		for (int x = 0; x < name.length(); x++) {

			System.out.print(name.charAt(x) + " ");

		}
//	System.out.print(name.charAt(0) + " "); //her seferinde 1 arttirinca asagiya geciyor
//	System.out.print(name.charAt(1) + " ");
//	System.out.print(name.charAt(2) + " ");
//	System.out.print(name.charAt(3) + " ");
//	System.out.print(name.charAt(4) + " ");   aslinda bunu yapmak yerine loop yapiyoruz

		// TASK2
		System.out.println();

		for (int a = name.length() - 1; a >= 0; a--) { // bu sefer a ne kadar harfse ondan basladi
														// eksi 1 cunku sifirdan baslayarak sayiyor

			System.out.print(name.charAt(a) + " "); // son harften geriye dogru yazdir

			// TASK3

			String newStr = "";

			for (int d = name.length() - 1; d >= 0; d--) {
				// System.out.print(name.charAt(d) + " ");
				char eachChar = name.charAt(d);
				newStr = newStr + eachChar;
			}
			System.out.println(newStr);

		}

	}

}