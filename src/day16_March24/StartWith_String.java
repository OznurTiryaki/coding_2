package day16_March24;

public class StartWith_String {

	public static void main(String[] args) {
		

		String str = "Busra" ;
		
		System.out.println(str.startsWith("B") );
		System.out.println(str.startsWith("ABC")  );
		
		boolean  b = str.startsWith("Bu");
		
		if (b) {
			
			System.out.println("successful");
			
		}else {
			
			System.out.println("Not a Bu");
		}

	}

}
