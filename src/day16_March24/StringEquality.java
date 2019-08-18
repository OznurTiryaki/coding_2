
package day16_March24;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "abc"; //using string literal
		
		String s2 = new String("abc"); //using new keyword //like creating two different object

		
		System.out.println(  s1 == s2  );
		
		String s3 = s1 ; 
		
		System.out.println(  s1 == s3  );
		
		
		
		
	}

}
