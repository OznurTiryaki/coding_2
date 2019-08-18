package day12_March17;

import java.util.Scanner;

public class SeasonHomework {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for the month as a number");
		
		String season = "";
		int monthNum;
		monthNum = sc.nextInt();
		switch (monthNum) {
		case 12:
		case 1:
		case 2:
			// System.out.println("WINTER");
			season = "WINTER";
			break;
		case 3:
		case 4:
		case 5:
			// System.out.println("SPRING");
			season = "SPRING";
			break;
		case 6:
		case 7:
		case 8:
			// System.out.println("SUMMER");
			season = "SUMMER";
			break;
		case 9:
		case 10:
		case 11:
			// System.out.println("AUTUMN");
			season = "AUTUMN";
			break;
		default:
			System.out.println("Invalid Entry");
		}
		System.out.println(season);
		sc.close();

	}

}
