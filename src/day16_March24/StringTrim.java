package day16_March24;

public class StringTrim {

	public static void main(String[] args) {
		

		String str ="         GO      JAVA  SPARTAN    ";
		
		
		System.out.println(str);
		
//task
//get java spartan from above
		
		System.out.println(str.indexOf("J")); // bununla j harfinin yerini belirledik
		
		String newStr = str.substring(17, str.length()-1);   //dedikki 17den sona kadar yazdir- yeni string bu
		
		System.out.println(newStr);
		
		System.out.println(newStr.trim()); //bununla kestik yanidaki boslugu
	}

}
