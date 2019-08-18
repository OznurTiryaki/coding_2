package day32_April23;

public class Method3Task3 {

	public static void main(String[] args) {
		
		// TASK 3 :
		
		// CREATE static method called giveMeBiggerNumber
		// it takes 2 int as parameters 
		// and return bigger number 
		
		// call the method couple times with different result 
		
		int max = giveMeBiggerNumber (5, 8);
		System.out.println(max);
		
		//or
		
		System.out.println(giveMeBiggerNumber (5, 8));

	}
        public static int giveMeBiggerNumber (int num1, int num2) {
    	
    	int max= (num1>num2)? num1 : num2 ;
    	return max;
    }
}
