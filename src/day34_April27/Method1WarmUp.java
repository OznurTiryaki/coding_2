package day34_April27;

public class Method1WarmUp {

	public static void main(String[] args) {
		
//write a funchtion to test String palindrome
		// static method calles is palindrom
		//it takes one String as a parameter
		
		System.out.println(reverse("race car"));
		System.out.println(isPalindrom ("race car"));
		
		
	}
  public static boolean isPalindrom (String word) {
	  word=word.replace(" ", "") ;  //eger sadece palindromu kontrol edeceksen bunu replace yapman yeterli.
	 if (reverse(word).equalsIgnoreCase(word)){
		 return true;
	 }else {
		 return false;
	 }
  }
  
  public static String reverse( String str) {
	 
	String newStr= "";
	 str=str.replace(" ", "") ;
	 for (int i=str.length()-1 ;i>=0 ;i--) {
		 newStr += str.charAt(i);
	 }
	
	 return newStr;
  }
}
