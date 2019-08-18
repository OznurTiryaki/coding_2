package day34_April27;

public class VarArgs5 {

	public static void main(String... args) {

		// CMD ARGUMENT

		// String[] args is called command line arguments
		// and we can pass value using command line

		System.out.println(args.length);
		for (String item : args) {
			System.out.println(item + " ");
		}
	}
}
