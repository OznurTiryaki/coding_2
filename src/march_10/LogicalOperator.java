package march_10;

public class LogicalOperator {

	public static void main(String[] args) {
		// LOGICAL OPERATOR
		
		int a =10, b= 20 , c = 10 ;
		
		boolean b1 = a > b;
		
		boolean b2 = a >=c ;
		
		
		//Logical and operator &&
		//Logical or operator ||
		//Logical not operator !
		
		System.out.println( "a is more than b " + b1);
		
		System.out.println( "a is more than or equal to c " + b2);
		
		
		boolean bothMeetRequirement = b1 && b2 ;
		
		System.out.println ("are both condition met" );

		
		
		
		
	}

}
