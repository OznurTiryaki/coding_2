package day32_April23;

public class Utility {

	public static void main(String[] args) {
		
		String name = "Emine ";
		System.out.println(  name.length()   );
		
			/// There are two ways to call static methods 
			/*
			 * 1, if the method is in same class 
			 * 		we can just directly call the method by it's name 
			 * 			and passing the value it required
			 * 2, or we can use className.staticmethodName(params..)
			 * */
		
		 /// we can use directly staticMethod(params) to call static methods 
		 
		 // we are printing out so we can see the result of method call 
		 System.out.println(   giveMeFive()	   );
		 //System.out.println(  5  );  -->> this is what it will become at runtime
		 
		 /// we can use className.staticMethod(params) to call static methods 
		 System.out.println(   Utility.giveMeFive()	   );
		 
		 // here we are saving the result so we can use it again later 
		 // instead of calling method again
		
		 int myNum = giveMeFive(); 
		 System.out.println(myNum);

		 
		
		 
		 
	}
	
	public static int giveMeFive(){
		
		return 5 ; 
		
	}
	
	
	
	

}