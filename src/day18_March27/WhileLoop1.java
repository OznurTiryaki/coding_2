package day18_March27;

public class WhileLoop1 {

	public static void main(String[] args) {
		

		//Dry Principle 
	    // Dot Repeat yourself
		
		int x =10 ;
		if (x>5) {
			System.out.println("Do This");
		}else {
			System.out.println("Do That");
		}
		
		int y = 10;  //9 dan basliyor yazdirmaya
		 
	//	while (y > 5) { // with ++ it will go forever, we need to put good condition
			
		while (y > 5) { 
		 
				
			System.out.println("Print This" + y--); //y -- yukarida yazmak yerine parantez icin 
			                                        //--y de yazabilirsin eger saga koyarsan 9dan yazar geriye
			                                        //y-- yazarsan 10 dan geriye yazar
		}
	}
}
