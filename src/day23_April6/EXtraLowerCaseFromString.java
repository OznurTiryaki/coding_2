package day23_April6;

public class EXtraLowerCaseFromString {

	public static void main(String[] args) {
	

		String str= "5 little monkey Jumping on The Bed";
		String letters ="";
	    for (int x =0 ; x < str.length() ; x ++) {
	    	
	    	char eachChar= str.charAt(x);
	    	
	    	if (eachChar >= 'a' && eachChar <= 'z') {
	    	
	    		letters =letters +eachChar ;
	    	
	    	}
	    	
	    }
	    System.out.println(letters);	
	}

}
