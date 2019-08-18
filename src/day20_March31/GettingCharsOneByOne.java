package day20_March31;

public class GettingCharsOneByOne {

	public static void main(String[] args) {

		String name = "Muhammed Hayrullah Cisem";

		int count = name.length();

		for (int i = 0; i < count; i++) {
			System.out.print(name.charAt(i) + " ");
		}
		System.out.println();
		
		for (int i = count -1 ; i >=0 ; i--) {  ///reverse always come at interview questions
			System.out.print(name.charAt(i) + " ");
		}
	}

}
