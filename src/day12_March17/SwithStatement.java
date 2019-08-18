package day12_March17;

import java.util.Scanner;

public class SwithStatement {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("How is weather today?");

		String weather = s.next();
		
		weather = weather.toLowerCase(); //bunu yaparsak sadece kucuk harfle kabul eder
				

//		if (weather.equals("sunny")) {
//			
//		 System.out.println( "go swimming")	;
//			
//		}else if (weather.equals("windy")) {
//			
//	     System.out.println( "go fly a kite")	;	
//		
//		}if (weather.equals("rainy")) {
//			
//			 System.out.println( "stay home")	;
//			 
//		}if (weather.equals("snowy")) {
//			
//			 System.out.println( "go snowboarding")	;
//			 
//		} else{
//		      System.out.println("are you sure this is a right weather");
//		
//	}

//		SWITCH // breakleri koymassan hepsini yazdirir

		switch (weather) { ///buraya ignore case yazmak mumkun degil

		case "sunny":

			System.out.println("go swimming");
			break;
		
		case "windy":

			System.out.println("go fly a kite");
			break;
		
		case "rainy":

			System.out.println("stay home");
			break;
		
		case "snowy":

			System.out.println("go snowboarding");
			break;
		
		default:

			System.out.println("are you sure this is a right weather");
			break;
		}

	}
}
