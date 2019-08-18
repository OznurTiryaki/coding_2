package day53_May29;

public class TropicalFruit extends Fruit{

	  
	  public static void main(String[] args) {
	    
	    generateJuice(); //en yakina gider
	    Fruit.generateJuice();
	    TropicalFruit.generateJuice();
	  }
	  // hiding static methods
	  
	  
		//EGER SUB CLASSDA BU METHOD OLMASAYDI YUKARDAKILERIN HEPSI boyle olacakti
//		generate general juice
//		generate general juice
//		generate general juice
		
		//EGER SUPER CLASSDA BU METHOD OLMASAYDI YUKARDAKILERIN 
		//Fruit.generateJuice(); COMPILE etmeyecekti
		
	  
	  public static void generateJuice() {
	    System.out.println("generate TropicalFruit Juice ");  
	  }
	  
	  
	}




	/// -----------------------different class --------



	class Fruit{
	  
	  public static void generateJuice() {
	    System.out.println("generate general Juice ");  
	  }
	}
