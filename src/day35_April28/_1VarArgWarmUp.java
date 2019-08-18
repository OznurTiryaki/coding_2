package day35_April28;

public class _1VarArgWarmUp {

	public static void main(String[] args) {
		
		/*
		 * 
	     * // Warm up Create a static method called findLongestWord this method have one
	     * parameter as String vararg and return the longest word as String
	     */
		
		System.out.println(findLongestWord ("Ali","Mehmet","Mustafa"));
		//or
		String [] names = {"Ali","Mehmet","Mustafa","oznuruu"} ;
		System.out.println(findLongestWord (names));
		
	}
   public static String findLongestWord (String ...words) {

	 String longest =words[0];
	 
	for (int i = 1; i < words.length; i++) {   
		if (words [i].length() >= longest.length()) {   //if you add equal it will give last bigger one, 
			                   //it should be same size.//simdi mustafa ile ayni olmasina ragmen last wordu verir
			longest = words [i];	
		}
	}
	return longest;
}
}
