package day32_April23;

public class ReturnedValue {

	public static void main(String[] args) {
		
		

		char mylastchar = giveMeLastChar ("oznur");
		System.out.println(mylastchar);
		
		//or
		
		System.out.println(mylastchar);
		
		char cLast = giveMeLastChar("ABDUL KHAN") ; 
		
		System.out.println(cLast + "" + cLast);  //bu sekilde farkli islemler yapabiliyoruz eger retun ile donerse
		
	}
    
	public static char giveMeLastChar (String name) {
	 char  lastchar= name.charAt(name.length()-1);
	 return lastchar;
}
}
