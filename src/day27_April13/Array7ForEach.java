package day27_April13;

import java.util.Arrays;
import java.util.Scanner;

public class Array7ForEach {

	public static void main(String[] args) {
	
		//logic get first integer as a max or min and later compare with all item
		
		Scanner scan = new Scanner (System.in);
		
		int [] numbers = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		
		System.out.println(Arrays.toString(numbers)); //to print number in array
		int sum= 0;
		for (int num :numbers) {
			
			sum+=num;
				
			}
			
		System.out.println("Sum = " + sum);	
		

  // Task 2  max
		int max=numbers [0];
		int min = numbers[0];
		
		for (int num :numbers) {
		
		if (num >max) {
			max= num;
		}else if (num <min) {
			min= num;
		
		}
	
			}
		System.out.println(max);
		System.out.println(min);
		}
		
}	
		
		
		
