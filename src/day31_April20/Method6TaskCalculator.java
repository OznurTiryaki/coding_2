package day31_April20;

public class Method6TaskCalculator {

	public static void main(String[] args) {
		
		add(100, 30);
		sub(100, 30);
		mult(100, 30);
		div(100, 30);
		mod(100, 30);
		calculate('*', 100,30);
	}
	public static void add(int num1, int num2) {
		int add = num1 + num2;
		System.out.println(add);
	}
	public static void sub(int num1, int num2) {
		int sum = num1 - num2;
		System.out.println(sum);
	}

	public static void mult(int num1, int num2) {
		int multi = num1 * num2;
		System.out.println(multi);
	}

	public static void div(int num1, int num2) {
		int div = num1 / num2;
		System.out.println(div);
	}

	public static void mod(int num1, int num2) {
		int mod = num1 % num2;
		System.out.println(mod);
	}
	
	 /*
	   * OPTIONAL :
	   * calculate method that take 3 paramEters and do below 
	   *  
	   * calculate("+" , 100, 30)  -- print 130
	   * calculate("-" , 100, 30)  --  print 70
	   * calculate("*" , 100, 30)  -- print 3000
	   * calculate("/" , 100, 30)  -- print 3
	   * calculate("%" , 100, 30)  -- print 10
	   * calculate("abc" , 100, 30)  -- print INVALID OPERATION CODE

	   * */
	 public static void calculate(char operator,int firstNum, int secNum) {
		    
		    switch (operator) {
		    case '+':
		      System.out.println("result of addition is : " + (firstNum+secNum));
		      break;
		    case '-':
		      System.out.println("result of subraction is : " + (firstNum-secNum));
		      break;
		    case '*':
		      System.out.println("result of multiplation is : " + (firstNum*secNum));
		      break;
		    case '/':
		      System.out.println("result of divition is : " + (firstNum/secNum));
		      break;
		    case '%':
		      System.out.println("result of mod is : " + (firstNum%secNum));
		      break;

		    default:
		      System.out.println("INVALID OPERATOR");
		      break;
		    }
		    
	 }
}