package day24_April7;

public class ArraySum {

	public static void main(String[] args) {
		
		int [] numbers = {1,4,6,8,9};
		
		for (int x =0 ; x <numbers.length ; x++) {
			System.out.print(numbers [x] + " "); 
	 }
	 System.out.println();
	 
	 
	 int sum = 0;
	 for (int x =0 ; x < numbers.length; x++) {
			System.out.print(numbers [x] + " "); 
			sum=sum + numbers [x];
			
	 }
	 System.out.println();
	 System.out.println(sum);
	 
	 
//	OR with do while
//		 
//		
//	 int j = 0 ; 
////   do {
////     sum = sum + nums[j] ; 
////     j++ ; 
////   } while (j<nums.length);
////  
	//OR WHILE 
//   int z = 0 ; 
//   while (z<nums.length) {
//     sum = sum + nums[z];
//     z++ ; 
//   }
//   
//   System.out.println(sum);
//
//	 
//	 
//	 
	 
	}

}