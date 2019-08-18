package day51_May26;

public class Horse extends Animal{
 
	@Override
	public void makeNoise () {
		//e want to do when we call the horse noise, it make first a general animal noise
		//and later a horse voice
		//for this we need to use super this key word to call animal classes makeNoise()
		//method to call it. 
		super.makeNoise(); //superi koymazsak tanimaz kendisi zanneder
		super.makeNoise();
		System.out.println("Horse make NAI NAI NAI noise" );
		super.makeNoise();  //methodlari cagirirken constracter gibi bir tane ve 
		//sadece first line da olmasina gerek yok, birden fazla cagirabilirsin
		//ayni seyi ayni siniftaki this ile de yapabilirsin.
		//mesela ayni siiftan iki method cagirisan this.methodname
		//birden fazla methodu da super clastan cagirabilirsin.
	}
}
