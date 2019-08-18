package day20_March31;

public class BreakStatement {

	public static void main(String[] args) {
		
		// break statement is used to break out of switch statement
		//and loops
		
		int x = 10;
		
		do {
			
			System.out.println(x);
			
			x++;
		
			if (x> 50) {
				
				break;
			}
		}while (x<100); //if I dont want to print at 100, we want to 50, we will add break

	}

}
