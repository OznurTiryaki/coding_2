package day13_march19;

import java.util.Scanner;

public class StringClassTask1 {

	public static void main(String[] args) {
		// TASK 1 
	    /*
	     * Ask user for two names 
	     * check for the equality without caring about the case   print result 
	     * 
	     * also compare the length of the names 
	     *    if name 1 has more character ---> print second character 
	     *    else  print 3rd character 
	     * 
	     *  // OPTIONAL 
	     *  store the last character of name 2 in char variable 
	     *  and create switch statement to check few cases as below 
	     *  
	     *  case 'a' --> print name ended with a 
	     *  case 'b' --> print name ended with b 
	     *  case 'c' --> print name ended with c 
	     *  if no match print  did not get abc 
	     *  
	     *  
	     * 
	     * */
	    
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two name");
		
		String name1= scan.next();
		
		String name2 = scan.next();
		
		//System.out.println("Is it Same name> "+ name1.equalsIgnoreCase(name2)) ;    seklinde yapabilirsin
		
		if (name1.equalsIgnoreCase(name2)){ 
		 
			System.out.println("entered names are equal");
		}else	{
			System.out.println("not equal");
			
		}
		
		int count1 = name1.length();
		int count2 = name2.length ();
		
		if (count1 >count2) {
		 System.out.println(name1.charAt(1)); //for second character
		
	     } else {
		 System.out.println(name2.charAt(2));   //for third character
		 
		 
		                     //      true
	//	 System.out.println("character is " +(    count1 >count2)? (name1.charAt(1) : (name2.charAt(2) ) ;
}
}}

// true --> name1.charAt(1) // false: name2.charAt(2)
// System.out.println( "character is " + ( (count1>count2) ?
// name1.charAt(1) : name2.charAt(2) ) );

// what type of data types are supported in switch variable

// WHOLE NUMBERS within the range of int (byte , short , int )
// char , String

/*
 * store the last character of name 2 in char variable and create switch
 * statement to check few cases as below
 * 
 * case 'a' --> print name ended with a case 'b' --> print name ended
 * with b case 'c' --> print name ended with c if no match print did not
 * get abc
 */
// get the last character


//int lastCharIndex = count1 - 1;
//char lastChar = name1.charAt(lastCharIndex);
//System.out.println("last char of name1 is " + lastChar);
//
//switch (lastChar) {
//  
//case 'a':
//  System.out.println("name as ended with a ");
//  break;
//case 'b':
//  System.out.println("name as ended with b ");
//  break;
//case 'c':
//  System.out.println("name as ended with c ");
//  break;
//default:
//  System.out.println("NO MATCH AT ALL ");
//  
//  
//
//Scanner input= new Scanner(System.in);
//System.out.println("Please put first name?");
//String firstName=input.nextLine();
//System.out.println("Please put second name?");
//String secondName=input.nextLine();
//if (firstName.equalsIgnoreCase(secondName)) {
//	System.out.println(firstName+" same as "+ secondName);
//	
//}else {
//	System.out.println(firstName+ " NOT same as "+ secondName);
//}
//if (firstName.length()>secondName.length()) {
//	System.out.println("second character "+firstName.charAt(1));
//} else {
//	System.out.println("third character "+firstName.charAt(2));
//} 
////optional
//char newChar=secondName.charAt(secondName.length()-1);
//switch (newChar) {
//case 'a' :
//	System.out.println("name ended with a");
//	break;
//case 'b' :
//	System.out.println("name ended with b");
//	break;
//case 'c' :
//	System.out.println("name ended with c");
//	break;
//
//default:
//	System.out.println("did not get abc");
//	break;
//}
//
//
//}
//
//}