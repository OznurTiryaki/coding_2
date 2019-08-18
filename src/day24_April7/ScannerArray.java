package day24_April7;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		int [] arr = new int [3];
		
		for (int i = 0 ; i <arr.length ; i ++) {

		
		System.out.println("Enter number:" + (i+1) ); //1 ile toplama sebebimiz o dan basladik
		
		arr [i] = scan.nextInt();	 //scannerdan sayi aliyoruz/ loop dondukce loop sayisi kadar sayi verecek
		System.out.println(arr [i]);  
		
		
		}
		 // BAD WAY TO GET THE MAX 
	    // INITIAL VALUE PREFERRABLY THE FIRST ITEM 
//	    int max = 0 ; 
//	    for (int i = 0; i < arr.length; i++) {
//	      
//	      if(arr[i]> max  ) {
//	        max = arr[i] ; 
//	      }
//	      
//	    }
//	    System.out.println(max);
	    
	    int min = arr[0] ; 
	    for (int i = 1; i < arr.length; i++) {
	      
	      if(arr[i]< min  ) {
	        min = arr[i] ; 
	      }
	      
	    }
	    System.out.println("min value is : "+ min);
	     
	    
	    
	    
	    
	    

	  }

	}
