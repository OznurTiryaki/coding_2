package day16_March24;

public class LastIndexOf_String {

	public static void main(String[] args) {
		

		String str = "Java is fun !" ;
   
		//give me part of string from location 6 till 10
		
        int index = str.lastIndexOf(" "); 
        
        System.out.println(str.substring(6,11));
		
		System.out.println("lastIndexOf : " + index  );
		
		System.out.println("lastIndexOf : " + str.lastIndexOf("a") );

		
	}

}
