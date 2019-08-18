package march_10;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// LOGICAL OPERATOR-2
		
		boolean isHungry = true;
		boolean isBreakTime = false;
		boolean isYourLunchReady = true;
		
		
		
		//AND one operation false and all false &&
		
		System.out.println("are you hungry and it is break time " + (isHungry && isBreakTime) );
		
		// OR || if one is true,still true
		
		System.out.println ("are you hungry and it is break time " + (isHungry || isBreakTime) );
		
		//! Not operator

		boolean reverseIsHungry = ! isHungry ; // is give not meaning 
		
		System.out.println("Original ishungry " + isHungry);
		
		System.out.println("After reversing ishungry " + reverseIsHungry);
		
		boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady ;
		
		System.out.println("hungry,break time ,meal is ready " + areWeSuperReady);
		
		
		
		
	}

}
