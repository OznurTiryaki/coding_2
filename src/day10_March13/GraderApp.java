package day10_March13;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
		// Warm Up
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score here:");
		
		int yourGrade = scan.nextInt();
		
		if ( yourGrade >= 90) { 
			System.out.println("Great score : A!");
			
		} else if (yourGrade >= 80) { //burada tekrar 90 arasi diye yazmamiza gerek yok cunku yukarida
		                              //onu kontrol etti.
			System.out.println("Great score : B!");
		
		} else if (yourGrade >= 70) {
			
			System.out.println("Great score : C!");	
		}else
			System.out.println("Study Harder!");	
	}

}
