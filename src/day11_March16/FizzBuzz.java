package day11_March16;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		int a = scan.nextInt();
		
	     String result;
		
	//	if ( a%5==0 && a%3 ==0) {
		   //String result = "fizzBuzz";
		   
		//  }else {
			  
		//	  String result= "notfizzBuzz";
		 
	     result = ( a%5==0 && a%3 ==0)? "fizzBuzz" : "notfizzBuzz";
	     
	     System.out.println(result);
}
}
