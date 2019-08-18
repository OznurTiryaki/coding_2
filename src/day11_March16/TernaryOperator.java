package day11_March16;

public class TernaryOperator {

	public static void main(String[] args) {
		
		// used for conditionally assigning a value
		
		int score = 98 ;
		
		String abc = "";
		
		if (score >75)
			abc = "pass";
		else
			
			abc = "fail";
		
		abc = (score >75) ? "pass" : "fail";   //with that we dont need to write like up,
		                                       //it make code really short
		
		System.out.println(abc); 
	}

}
