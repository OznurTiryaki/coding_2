package day11_March16;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username ="user";
		String password ="pass";
		
		if (username.equals("user") && password.contentEquals("pass")) {
			
			System.out.println("login successful");
		
		}else {
		
		    if (!username.equals("user")) {
			
			System.out.println("Username not found");
			
		    }else {
			System.out.println("password not correct");
			
			
			/*if (!username.equals("user")) { eger burada curly braces koymazsak nested oldugunu anlamaz ve direk 
			 * yaziyi print eder. burada kullanip alt asamasinda kullanmak zorunda degilsin.
			 * eger single statement varsa print eder without curly braces
			 * if (password.equals("pass"))
			 * System.out.println("Yes log in success):
			 * 
			 */
		    }		
	}
	}
	}
