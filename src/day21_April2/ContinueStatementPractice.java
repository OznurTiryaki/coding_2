package day21_April2;

public class ContinueStatementPractice {

	public static void main(String[] args) {
		
		// Task 2
		//from 1 to 50 count odd number with continue
		// from 1 to 50 print divisible with 4 howmany time
		//
		
		
		
		
		for( int i = 1 ; i<=50 ; i++) { //or you can do i=i+2 and you dont need to if statement
			if (i%2!= 0) { //yani diyorki even number ise skip et 
			continue;
			}	//parantezi kapatip yazdirmayi unutma
			System.out.println("odd number is " + i);	
				
		}
		
//		int count = 0 ;
//		for( int a = 1 ; a <50 ; a++) {
//			if (a%4== 0) {
//			
//				count++;	
//			}
//			
//		}
//		System.out.println("count is " + count);	//sadece sonucu gormek icin en sona yazdir
//		
	//	other way
		
		
		int count = 0 ;
		
		for( int a = 1 ; a <50 ; a++) {
			
			if (a%4 == 0) {
			
			System.out.println("divisible number" + a);	
			continue;		
			}
			count++;	
		}
		System.out.println("count is " + count);	
		
		
		
	}
}
