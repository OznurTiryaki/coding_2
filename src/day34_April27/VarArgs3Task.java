package day34_April27;

public class VarArgs3Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(sentencesBuilder ("I", "love", "you", "so" , "much")) ;
		System.out.println(wordBuilder ("I", "love", "you", "so" , "much")) ;
	}
	
  public static String sentencesBuilder (String ...words) {
	  
	  String newStr="";
	  
	  for (int i = 0; i < words.length; i++) {
		  newStr += words[i]+" ";
		  
	} 
	  return newStr;
  }
  public static String wordBuilder (String ...characters) {
	
	  String lastChar= "";
	  for (int i = 0; i < characters.length; i++) {
		  lastChar += characters[i].charAt(characters[i].length()-1)+" ";
	}
	  return lastChar;
  }
}
