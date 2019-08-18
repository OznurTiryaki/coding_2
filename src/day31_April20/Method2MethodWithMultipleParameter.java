package day31_April20;

import java.util.Scanner;

public class Method2MethodWithMultipleParameter {

	public static void main(String[] args) {

		repeat("java", 5);
		repeat("spartan", 30);

		Scanner scan = new Scanner(System.in);
		System.out.println("Give me word to repeat");

		String str = scan.next();
		System.out.println("Give me number of time to repeat");
		int i = scan.nextInt();

		repeat(str, i);

	}

	public static void repeat(String word, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
}
