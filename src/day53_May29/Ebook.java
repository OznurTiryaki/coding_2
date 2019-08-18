package day53_May29;

public class Ebook extends Book{
 
	//SUBCLASS CAN HIRE SUPER CLASS'S FILED BY REDECKARING IT
	//THE ONLY THING MATTWE IS THE <NAME> !!!! DONT CHECH THE DATA TYPEE
	
	float name; //--->  0.0
	long page;
	private static double weight=-1;
	
	public static void main(String[] args) {
		
		Ebook e= new Ebook();
		
		System.out.println(e.name);  //we chech a name with ebook classes objective
		//so it give us float name
		
		e.showValues ();   
		
	}
	public void showValues () {   //normal method super. olmasi icin iverride olmasina gerek yok
		 //ama super.ile cagirmak icin obj kullanmam lazim, main icinde yazamam
		System.out.println(super.name+ " --- " + this.name);  //null (in super class name is String) ---(in Ebook it name is float-- 0.0)
		System.out.println(super.page+ " --- " + this.page);  //0 --- 0
		
		 // static fields can be accessed directly in instance method 
	    // or we can make it obvious to call in static way EBook.weight
		System.out.println(super.weight+ " --- " + Ebook.weight);  //0.0 --- -1.0

	}
	
}


class Book{
	String name;
	int page;
	double weight;
	
}