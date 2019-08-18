package day44_May14;

public class _1ReviewConstructor {


	public void ReviewConstructor() {	  // Careful this is not a constructor, because it has a void 
		System.out.println("BOOM ");      //it is method
		
	}
	// we can use any access modifier for constructor 
	public _1ReviewConstructor(String abc) {     // this is constructor because it has a same class name
		                                         //also not return anything
		
		System.out.println("BOOM REAL " + abc); 
	}
	
	
	public static void main(String[] args) {
		
		_1ReviewConstructor c1= new _1ReviewConstructor ("cbKBCkw"); //arg yazmazsak compile olmaz
		                                                             //yukari da o sekilde yazdigimiz icin
		
		
		// does not compile -- there is no no-arg constructor defined 
		
		
		// ReviewConstructor re = new ReviewConstructor(); eger boyle bir object olustursaydik fakat
		//constructor olusturmasaydik yukarda yine constractor'i otomatik cagiracakti. default constractor olacakti
		
	}

}
