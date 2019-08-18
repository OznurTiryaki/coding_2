package day18_March27;

public class LocalVariable {

	public static void main(String[] args) {

		int x ;
		
		int y = 10 ;
		
		if (y > 5) {
			
			x=10 ;
			
		}else {
			
			x =5;
		}
     System.out.println(x);  //not compile  else e deger vermezsek cunku x if olmazsa degersiz kalir ve compile olmaz
     
	}

}
