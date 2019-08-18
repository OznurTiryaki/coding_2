package day31_April20;

public class Method1WarmUp {

	public static void main(String[] args) {
//		WARM UP TASK 
//
//		Create few static methods with no return type with below name and logic
//
//		1, create a method called countFrom1To10
//		take no parameters 
//		print 1-10 in one line with space
//
//		2, create a method called countFrom1ToN
//		take 1 int as parameter  
//		print 1-N(number user passed) in one line with space
//
//		3, create a method called CountDown
//		take 1 int as parameter 
//		and count down till 1 in method body
		
		countFrom1To10 ();
		countFrom1ToN (15);
		CountDown(15);
	}

	public static void countFrom1To10 () {
	for (int i = 1; i <= 10 ; i++) {
		System.out.print(i+ " ");
		
	}
	System.out.println();
	}
	public static void countFrom1ToN (int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		
		}
		System.out.println();
	}
		public static void CountDown (int n) {
			for (int i = n; i>=1; i--) {
		System.out.print(i+ " ");
			}
			System.out.println();
		}
}
