package day21_April2;

public class Task3 {

	public static void main(String[] args) {
		

//		skip all numbers divisible by 3 and 5
//		at the same time
//		
//		4, get the sum of above numbers///sum too important for interview
		
		
		int sum=0;
		for( int b = 1 ; b<50 ; b++) {
			
			if (b%3 ==0 && b%5==0) { //it means skip that numbers
				                     //it skip 15,  etc
				continue;
				
			
			}
			System.out.println( b);	
			sum = sum+b;
	}
		System.out.println( sum);	
		
	}

}
