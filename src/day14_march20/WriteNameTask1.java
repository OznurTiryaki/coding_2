package day14_march20;

public class WriteNameTask1 {

	public static void main(String[] args) {
		

//		 Task 1
//		
//		Store your name into String
//		find your name lenght
//		find first character
//		find last character
//		find first and second character
		
		String name = "Oznur";
		
		int count= name.length(); // if we dont know name 
		
		System.out.println(name.substring(count-1, count)); //count last character -1
		
		//because count = length is how many number starting at one, -1 to get index of last character
		//so if you start at last and end at length you will only get the last character. 
		
		System.out.println(name.length());
		
		System.out.println (name.charAt(0));
		
		System.out.println (name.charAt(4));
		
		System.out.println (name.substring(0,2)); // 2 because not include end one, it print one before

		
		
		
	}

}
