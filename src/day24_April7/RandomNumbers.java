package day24_April7;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		

	    Random rand = new Random() ; 
	    int[] nums = new int[10] ; 
	    
	    for (int x = 0; x < 10; x++) {
	      // 0- 100-1
	      nums[x] = rand.nextInt(100);  //100 hangi sayi araliginda sayi almak istedigimiz ile alakali.
	  //	System.out.println(nums[x]);  bu sekilde yazarsak aldigimiz degerleri print etmis oluyoruz.
	    }
	    
	    System.out.println( Arrays.toString(nums) ); //bu degerleri array olarak yazmamizi sagliyor.

	  }

	}
