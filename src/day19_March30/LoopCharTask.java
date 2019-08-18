package day19_March30;

import java.util.Scanner;

public class LoopCharTask {

	public static void main(String[] args) {

		// Create A program like Above
		// to check whether user input first character
		//1 start with number
		//2 end with uppercase

		System.out.println("Enter a word");
		
		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();

		char firstCharacter = word.charAt(0);
		char lastCharacter = word.charAt(word.length() - 1);

		if ((firstCharacter >= '0' && firstCharacter <= '9') && lastCharacter >= 'A' && lastCharacter <= 'Z') {

			System.out.println("First character start with number, and last character with upper case");

		} else {

			System.out.println("First character not start with number or last character with upper case");
		}
	}
}
