package march_10;

import java.util.Scanner;

public class ConditionalStatementTask2 {

	public static void main(String[] args) {
		// TASK 2
		
	     /*  BestBuy store : 
	     *  declare double variables for price of iphone , Ipad , yourBudget
	     *  assign value for iPhone as 599.99, ipad 899.99 
	     *  declare 2 more int variables for phoneCount and tabletCount
	     *  ask user to enter the budget 
	     *  ask user to enter quantity you want to buy 
	     *  calculate the total price 
	     *
	     *  write a conditional statement to check whether total price is more than your budget
	     *  if it's more print , out of budget
	     *  else print I Will take it !!
	     */
		
		Scanner scan = new Scanner (System.in);
		
	   double iphone = 599.99; 
	   
	   double ipad = 899.99;
		
       
	   System.out.println("Please enter how money phone do you want: ");
	   
	   int phoneCount = scan.nextInt();
		
	   System.out.println("Please enter how money tablet do you want: ");
	   
	   int tabletCount= scan.nextInt();
	
       System.out.println("Please enter your budget: ");
	   
	   double budget = scan.nextDouble();
	   
	   double totalPrice = (iphone * phoneCount) + (ipad * tabletCount);
	   
	   System.out.println(totalPrice);
	   
	   if (budget > totalPrice) {
		
		   System.out.println("YOU WIll BUY PRODUCTS ! ");
	      
	  }
	   else {
		      System.out.println("SORRY, YOU CANNOT BUY PRODUCT \n  NO MONEY NO HONEY");
		      
		      System.out.println("You need extra " + (totalPrice-budget));
		  

	}
	
	}

}