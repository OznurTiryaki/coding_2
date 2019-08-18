package day12_March17;

import java.util.Scanner;

public class DayPrinter2 {

	public static void main(String[] args) {
		// new requirement---- case 1-5 weekday/ 6-7 weekend
		
		 int dayNum ;
			
			String dayWord; 
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Day number : ");
			
			dayNum = scan.nextInt();
			
			switch ( dayNum   ) {
			
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				dayWord = "Weekdays";
				break;
			case 6:
			case 7:	
				dayWord = "Weekends";
				break;
		  default :
		        dayWord = "invalid day";
		        break;
     
		
		
//		BU YONTEMLE COK UZUN OLUYOR			
//			switch ( dayNum   ) {
//		case 1 :
//			dayWord = "Weekdays";
//			break;
//		case 2 :
//			dayWord = "Weekdays";
//			break;
//		case 3 :
//			dayWord = "Weekdays";
//			break;
//		case 4 :
//			dayWord = "Weekdays";
//			break;
//		case 5 :
//			dayWord = "Weekdays";
//			break;
//		case 6 :
//			dayWord = "Weekends";
//			break;
//		case 7 :
//			dayWord = "Weekends";
//			break;	
//		default :
//			dayWord = "invalid day";
//			break;
//			
//	}
//		System.out.println(OPPPSSSS!);

		        
	}
	}
}
