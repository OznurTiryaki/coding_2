package day10_March13;

import java.util.Scanner;

public class AmazonUser2 {

	public static void main(String[] args) {
		
		
			 Scanner scan = new Scanner(System.in);
			 
			 System.out.println("Welcome Amazon shopper!");
			 
			 System.out.println("Please enter price:");
			
			 double price = scan.nextDouble();
			 
			 if(price>=35) //nested if once konditioni soruyorsun
			 {
			  System.out.println("Free shipping. Total amount" + price +"dollars");
			 }
			 else
			 {
			 
			 System.out.println("Do you have Amazon Prime membership?: ");
			 
			 String isPrimeMember = scan.next();
			 
			 if(isPrimeMember.contentEquals("yes") || (price > 35))
			 {
			  System.out.println("Free shipping. Total amount 34"
			  		+ "" + price +"dollars");
			 }
			 else if(isPrimeMember.contentEquals("no") || price<=35)
			 {
			  System.out.println("Would you like to add Amazon membership today?");
			  
			  String addMembership = scan.next();
			  
			  if(addMembership.contentEquals("yes"))
			  {
			   price = price+120;
			   System.out.println("Add 120$ Prime Membership fee. Total amount: " + price +" dollars");
			  }
			  else
			  {
			  price = price+5;
			  System.out.println("Add 5$ shipping fee. Total amount: " + price +" 25dollars");
			 }
			 
			}
			}
			}

		
	}


