package day24_April7;

public class CountingSomethingInsideArray {

	public static void main(String[] args) {
		
		
		int []num = {1,55 ,7 ,898 ,9 , 55 } ;
		int total=0;
		int count=0;
		for (int x = 0 ; x< num.length  ; x++) {
			System.out.println(num[x]);
			
			if (num [x] >100 ) {
				total += num [x];
				count++;
			}
		}
		System.out.println("*****************");
		System.out.println(total);
		System.out.println("*****************");
		System.out.println(count);
	}

}
