package day31_April20;

import java.util.Scanner;

public class Method4AnyParameterswithDash{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan= new Scanner (System.in);
		 
		System.out.println("Enter size");
		
		int size = scan.nextInt();
		
		int [] arr = new int [size];
		
		for (int i = 0; i < size; i++) {
			 
			arr[i] = scan.nextInt();
		}
		AnyParameterswithDash (arr);
		
	}
  
	public static void AnyParameterswithDash (int [] num){
		 
	    
		for (int i = 0; i < num.length; i++) {
			 
			if (i < num.length-1) {
		   System.out.print(num[i] + "-");	
			}else {
		  System.out.print(num[i]);	
   }
		}
		System.out.println();
}
}