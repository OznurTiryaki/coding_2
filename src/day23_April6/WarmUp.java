package day23_April6;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "aaabbccc";
		String newStr= "";
		
		for (int x = 0 ; x< str.length() ; x++) {
	
		String eachCharacter= str.charAt(x)+"";
		if (newStr.contains(eachCharacter)) {
		
		}else {
			newStr +=eachCharacter;
			
		}
		}
		System.out.println(newStr);
		
		
		
		
//		for (int i = 0; i < str.length(); i++) {
//		      
//		      String eachChar = str.substring(i, i+1) ; 
//		      
//		      if(! uniqueStr.contains(eachChar) ) {
//		        uniqueStr += eachChar ; 
//		        System.out.println(eachChar);
//		      }
		
	}

}
