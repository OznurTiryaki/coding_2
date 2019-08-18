package day27_April13;

import java.util.Arrays;

public class Array12CopyOfRange {

	public static void main(String[] args) {
		
		String[] heroes = { "L", "N", "Aquaman", "Captain Kirk", "Batman", "Doctor Who" };
		System.out.println(Arrays.toString(heroes));

		/* create to copy of heroes string to keep it saved as original
		String[] herosCopied = new String[heroes.length];

		for (int i = 0; i < herosCopied.length; i++) {
			herosCopied[i] = heroes[i];
		}
		System.out.println(Arrays.toString(herosCopied)); */

		//Method 1 sort heroes array
		Arrays.sort(heroes);
		System.out.println("Descending order of heroes: " + Arrays.toString(heroes));

		//Method 2 loop thru heroes array to order all adding a dash between
		for (String word : heroes) {
			System.out.print(word + " - ");
			
		}
		System.out.println();
		
		
		System.out.println("Use copyOf method to certain part from 1st to last of the heroes");
		//isolate certain array element using copyOf method; look 1 and 2 
		
		String [] copyOf2 = Arrays.copyOf(heroes, 2);
		
		String [] copyOf4 = Arrays.copyOf(heroes, 4);
		
		 System.out.println(Arrays.toString(copyOf2));
		 System.out.println(Arrays.toString(copyOf4));
		 
		 //check out the print message 
		 System.out.println("copyOfRange method 1 to 3");
		 String [] copyOf1to3 = Arrays.copyOfRange(heroes, 1, 3);
		 System.out.println(Arrays.toString(copyOf1to3));
	}

}