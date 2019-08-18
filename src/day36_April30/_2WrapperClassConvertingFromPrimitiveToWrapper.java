package day36_April30;

public class _2WrapperClassConvertingFromPrimitiveToWrapper {

	public static void main(String[] args) {
	
		/*
		 * from String to primitive
		 * 
		 * 
		 * 
		 */

		String str1 = "True";   
		
		boolean b1 = Boolean.parseBoolean(str1);   //'it is a static method come from class Boolean
		
		boolean b2 = Boolean.parseBoolean("ABC"); 
		
		boolean b3 = Boolean.parseBoolean("FALSE");  //TURN FALSE CASE NOT MATTER JUST CHECK BOOLEAN VALUE (TURE/FALSE) OR NOT
		
		boolean b4 = Boolean.parseBoolean("TRUE"); 
		
		System.out.println(b1);
		
		System.out.println(b2);   //it just turn false because it is not same thing with boolean
		
		System.out.println(b3);    //TURN FALSE
		
		System.out.println(b4);   //TURN FALSE
		
		//***************************************************************
		
		String d = "3.14" ;
		
		Double d1 = Double.valueOf(d);   //after the convert as a object we can take some action
		
		System.out.println(d1.toString());  //it gave is a String value 
		
		//***************************************************************
		
		double d2 =d1; // ----> auto unboxing
		
		//***************************************************************
		
		//invalid coversion
		
		System.out.println(Double.parseDouble("3.14"));  //bu sekilde Stringi double a cevirdik
	
		//System.out.println(Double.parseDouble("3.14abc")); //double bir number olmadigi icin olmadi
		
		//System.out.println(Integer.valueOf("3.14"));  //int bir number olmadigi icin olmadi
		
		
		
		
		
		
	}
	
}
