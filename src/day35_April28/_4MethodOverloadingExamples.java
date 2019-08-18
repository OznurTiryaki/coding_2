package day35_April28;

public class _4MethodOverloadingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name = "Java";
		    
		    System.out.println(  name.indexOf("a") );
		    System.out.println(  name.indexOf("a",2) );
		    
		    System.out.println(  name.replace('a', 'B')    );
		    System.out.println(  name.replace("va", "java")    );
		    
		 
		    System.out.println(addNums (10,20));  
		    System.out.println(addNums (10,20,30));  
		    addNums (10,20,30,40);
			      
		    

	}
   public static int  addNums (int a, int b) {
	   int sum= a+b;
	   return sum;
   }
   
   public static int  addNums (int a, int b,int c) {
	  
	   int sum= a+b+c;
	   return sum;
   }
   public static void addNums (int a, int b,int c,int d) {
	   int sum= a+b+c+d;
	   System.out.println(sum);
   }
}
