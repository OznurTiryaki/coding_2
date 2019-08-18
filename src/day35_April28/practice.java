package day35_April28;

public class practice {

	public static void main(String[] args) {
		
	System.out.println(	at3("longword","foo"));
	}
		
	
	public static String at3(String target,String word) {
	    
	    String newStr= target.substring(0,3)+ word+ 
	    target.substring(3);
	    return newStr;
	  }
	
	}