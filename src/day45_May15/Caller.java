package day45_May15;

public class Caller {

	public Caller() {
   //  this(100);   //bunu da yazarsak ,kod bir loopa girer surekli birbirini cagirir ve compile olmaz
     
     // we call that RECURSIVE constructor call is not allowed 
		System.out.println("calling no arg");
	}

	public Caller(int x) {
		
		this(); //no argument olani cagirdigimiz icin parantez ici bos 
		System.out.println("calling 1 arg");
	}
}
///dikkat you cannot this (); in any method because this say it is constructor
//However you can call any method in constructor