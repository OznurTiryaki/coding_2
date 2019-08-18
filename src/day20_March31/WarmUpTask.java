package day20_March31;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
		/*while (some condition is true){
		 *       action to be repeated
		 * }
		 * 
		 * do{ 
		 * 
		 * action to be repeated
		 * 
		 * }while (some condition is true);
		 * 
		 
		 */
		//keep asking same question to user until correct answer
		String name = "";
		String pass = "";
		Scanner scan= new Scanner (System.in);
		
		do {
			
			System.out.println("Enter username:");  //dogru cevabi alana kadar sor.
			                                        //once sor sonra tekrar et, at least one work
			
			name = scan.next();
			
			System.out.println("Enter password:");
			
			pass=scan.next();
			
			
		}while (  !(name.equals("abc") && pass.equals("123")  ) ); //eger dogru degilse sormaya devam et
	     
		System.out.println("END");
	
	}

}
