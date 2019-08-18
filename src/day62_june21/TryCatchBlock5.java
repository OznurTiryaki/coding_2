package day62_june21;

public class TryCatchBlock5 {

	public static void main(String[] args) {
		
		

				System.out.println("Beginning of the code ");

				String str = "ABC";

				int num1 = 10;
				int num2 = 0;

				try {
					System.out.println("Try started");

					System.out.println(str.charAt(1)); // -->> new StringIndexOutOfBoundsException()

					System.out.println(num1 / num2); // -->> new ArithmeticException()

					System.out.println("Try Ended");
				// RuntimeException is super class of StringIndexOutOfBoundsException, ArithmeticException
					// question , can we change below catch to catch RuntimeException
				//}catch (Exception ex) {
				}catch (RuntimeException ex) {
						
					//Exception ex =  new StringIndexOutOfBoundsException(); 
					//Exception ex =  new ArithmeticException(); 
					System.out.println( "The message : " + ex.getMessage() );
					
					System.out.println("SOME EXCEPTION HAPPEN");
				}

				System.out.println("Ending of the code ");

			}
			
			
			
			
			
			
			
			
			

		}