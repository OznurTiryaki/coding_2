package day62_june21;

import java.util.Scanner;

public class TryCatchBlock2 {

	public static void main(String[] args) {
		

	    System.out.println( "Beginning of the code " );

	    System.out.println("start here");
	     
	    Scanner scan=new Scanner(System.in);
			
			int t=scan.nextInt();
			int[] arr= {1,2,3,4};
			try {
				//int[] arr= {1,2,3,4}; buradada olur disardda
				System.out.println(arr[t]);// => this generates ArrayIndexOutOfBoundsException  obj
				System.out.println("end of try block");//==>>out of bound olursa Any code under exception is unreachable
			}catch(ArrayIndexOutOfBoundsException e) { // this catches the obj hered
				System.out.println("check your index! your index does not exist");
				
				//here is the scenario if this exception happen
				//if just want to print last item of the array
				System.out.println("just returrning last item intead:");//CATCH OLMAZSA BURAYA UGRAMAZ
				System.out.println(arr[arr.length-1]);
				
				
			}
			System.out.println("The end");
		
		
		
	    

	  }

	}