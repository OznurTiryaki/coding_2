package day62_june21;

public class Task1 {

	public static void main(String[] args) {
		
		// TASK 1  
	       
	       // try to divide a number by 0 to see ArithmaticException 
	       // and comment out that code and generate same exception using throw keyword 
	     
		
	//====>>>	throw keyword --->> is used to throw exception manually
//		throw  --> shut down the program
//		catch   --> don't allow program to shut down

		
		int num = 5;
		int result = 5/0; 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
				//	at day62Exception.Task1.main(Task1.java:10)

				
		//there is another constructor in every exception that every String
		//you can use it to provide more inforation about the cause
		
		
		//throw keyword --->> is used to throw exception manually 
		ArithmeticException a =new ArithmeticException("undefined result");
		System.out.println(a); //java.lang.ArithmeticException
//		 throw a;
//		 java.lang.ArithmeticException: undefined result
//			at day62Exception.Task1.main(Task1.java:15)

		//ORRRR here is another way to throw excp
		 throw new ArithmeticException("ANOTHER WAY undefined result");//JSUT TO CREATE OBJ
//		 java.lang.ArithmeticException: ANOTHER WAY undefined result
//			at day62Exception.Task1.main(Task1.java:27)


	}

}
