package day9_March_12;

public class StringEqualityTask4 {

	public static void main(String[] args) {
		
		// MULTI BRANCHES IF STATEMENT INTRO
		
		//grade book
		
		int score = 84 ;
        
	// if the score is between 90-100 A
	// if the score is between 80-89 B	
		 //if the score is between 70-79 C		
		//else D and Print study harder
		
		if (score > 90 && score <= 100) { 
		
		System.out.println("Your Grade : A");
		
		} if (score > 80 && score <= 89) { 
			
			System.out.println("Your Grade : B");
			
		}if (score > 69 && score <= 79) { 	
		   
			System.out.println("Your Grade : C");
			
		}else if (score < 69) {
			
			System.out.println("study harder");
		}
			
			
	}

}
