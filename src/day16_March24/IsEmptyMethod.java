package day16_March24;

public class IsEmptyMethod {

	public static void main(String[] args) {
		

		String str = "";
		
		System.out.println(  str.isEmpty()  );  //true because we did not put anythig inside
		
		String str2= "xx";
		
		System.out.println(  str2.isEmpty()  );
		
       String str3= " ";
		
		System.out.println(  str3.isEmpty()  ); //false cunku space is a character at table
		
	//	String actualResult = "Amazon Search : " + " "); //we can use is empty to use searching product name. 
		
	}

}
