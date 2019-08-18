package day45_May15;

public class SpartanRunnerClass {

	public static void main(String[] args) {
 
		
		
		Spartan s1= new Spartan ();
		
		System.out.println(s1);
		
		//Spartan [name=Cybertek, studyHour=5, horsePower=320, tired=0, certificates=null]
		//it print above because we set in default constructor
		
		String[] certs = { "OCA","PSM","AWS","OCP"};
		
		Spartan s2 = new Spartan("Coder", 8, 600, false, certs); 
	    System.out.println(s2);
	    
	    Spartan trueSpartan =new Spartan ("Oznur",5,600, true, new String []{"SM"});  //you will do string array object directly
	    System.out.println(trueSpartan);
	    
	    
	    Spartan trueSpartan2 =new   Spartan(true); //one parameter costructor
	    System.out.println(trueSpartan2);
	    
	    Spartan s4 = new Spartan("Coder2", 12, 200, false, new String[] {}  );  //here emty array object but down null
		Spartan s5 = new Spartan("Coder3", 3, 100, true, null); //bu sekilde baskalarini default ta birakabiliriz
	  }


}
