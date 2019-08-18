package day20_March31;

public class DoWhileSum {

	public static void main(String[] args) {
		//use do while
		
		int sum = 0;
		
		int count = 1;
		
		
		do {
			sum= sum+count;
			
			System.out.println( "count is "+ count+" current sum :"+sum );
			
			//System.out.println(count);
			count++;
			
			if (sum >= 40) {   //burada kesmek istiyorsan break yapiyorsun.
				
				break;
			}
		}
		
		while (count <= 10);
		
	
      System.out.println(sum);

}
}
