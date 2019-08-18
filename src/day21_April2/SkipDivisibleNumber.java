package day21_April2;

public class SkipDivisibleNumber {

	public static void main(String[] args) {

//		skip all numbers divisible by 3 and 5
//		at the same time
//		
//		4, get the sum of above numbers///sum too important for interview

		int sum = 0;
		for (int x = 0; x < 50; x++) {
			
			if (x % 3 == 0 && x % 5 == 0) {
				continue;
			}
			System.out.println(x);
			sum = sum + x;
		}

		System.out.println(sum);
	}

}
