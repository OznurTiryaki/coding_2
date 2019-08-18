package day18_March27;

public class WhileLoopDoesAlwaysGoesToBack {

	public static void main(String[] args) {
	

		int x = 100;

		while ( x < 200) {
			
			System.out.println("do something");
			
			//x++ ; 
			x = x+ 10 ; 
		}
		
		System.out.println(" END ");
		
	}

}