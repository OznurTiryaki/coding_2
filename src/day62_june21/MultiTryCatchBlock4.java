package day62_june21;

public class MultiTryCatchBlock4 {
	
	public static void main(String[] args) {
		
	
	// StringIndexOutOfBoundsException  , ArithmeticException
	
	
			System.out.println("Beiginning ");
			
			String str = "ABC" ; 
			
			int num1 = 10 ; 
			int num2 = 0 ; 
			
			try {
				System.out.println("Try started");
			
				System.out.println( str.charAt(100)  ); // -->> new StringIndexOutOfBoundsException()
			
				System.out.println( num1 / num2 ); // -->> new ArithmeticException()
				
				System.out.println("Try Ended");
				
			}catch(StringIndexOutOfBoundsException ex1) {
				
				System.out.println("does not have that index ");
				
			}catch(ArithmeticException ex2) {
				
				System.out.println("DO NOT DIVIDE BY 0 !!!!");
			}
			
			
			
			System.out.println("Ending ");
			

		}

	}
