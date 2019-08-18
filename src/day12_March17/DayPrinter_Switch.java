package day12_March17;

import java.util.Scanner;

public class DayPrinter_Switch {

	public static void main(String[] args) {
		// Task 4 
	    /*
	     * Switch VS Ternary VS if else 
	     * 
	     * Switch : should be used when checking for equality of certain variable 
	     *     in multiple specific case
	     * Ternary : conditionally assigning a value . 
	     *       we can not take actions we can only assign value according to condition
	     * If else : most flexible , can do anything  
	     *       
	     *  use switch statement to accomplish this task 
	     *  
	     *  declare a int variable dayNum 
	     *  declare a String variable dayWord
	     *  
	     *  use switch to check for equality of dayNum 
	     *  case 1  --- assign the value for dayWord as Monday  : dayWord = "Monday" ; 
	     *  case 2  --- assign the value for dayWord as Tuesday 
	     *  case 3  --- assign the value for dayWord as Wednesday
	     *  case 4  --- assign the value for dayWord as Thursday 
	     *  case 5  --- assign the value for dayWord as Friday 
	     *  case 6  --- assign the value for dayWord as Saturday 
	     *  case 7  --- assign the value for dayWord as Sunday
	     *  
	     *  if nothing match assign value dayWord as invalid day 
	     *  
	     *  after switch statement -- print out the dayWord value 
	     * 
	     * new requirement---- case 1-5 weekday/ 6-7 weekend
	     * */
		
        int dayNum ;
		
		String dayWord; 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Day number : ");
		
		dayNum = scan.nextInt();
		
		switch (dayNum) { 

		case  1:

			System.out.println("Monday");
			break;
		
		case 2:

			System.out.println("Tuesday");
			break;
		
		case 3:

			System.out.println("Wednesday");
			break;
		
		case 4:

			System.out.println("Thursday");
			break;
		case 5:

			System.out.println("Friday");
			break;
		case 6:

			System.out.println("Saturday");
			break;
		case 7:

			System.out.println("Sunday");
					
			
			break;
		
		default:

			System.out.println("OPPPPPSSSS!!!!");
			break;
	
		}
	}

}

		
//		switch ( dayNum   ) {
//		case 1 :
//			dayWord = "Monday";
//			break;
//		case 2 :
//			dayWord = "Tuesday";
//			break;
//		case 3 :
//			dayWord = "Wednesday";
//			break;
//		case 4 :
//			dayWord = "Thursday";
//			break;
//		case 5 :
//			dayWord = "Friday";
//			break;
//		case 6 :
//			dayWord = "Saturday";
//			break;
//		case 7 :
//			dayWord = "Sunday";
//			break;	
//		default :
//			dayWord = "invalid day";
//			break;
//			
//	}
//		System.out.println(dayWord);    bu sekilde de yazabilirsin
