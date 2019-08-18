package day27_April13;

import java.util.Arrays;

public class Array10CofyOf {

	public static void main(String[] args) {
		
		String [] dcComicHeros = {"Superman", 
				"Batman",
				"Aquaman", 
				"Wonder Woman",
				"The Flash" , 
		"Green Lantern"} ;
		
		String [] herosCopied =  new String [ dcComicHeros.length];  //we did copy to put inside all String we need loop
		
		for (int i = 0; i < herosCopied.length; i++) {
		      herosCopied[i] = dcComicHeros[i] ; 
		    }

		
		
		System.out.println(Arrays.toString(dcComicHeros));
		
		//sort this array
		//use for each loop to loop through all of them
		//if this array has the hero you are looking for
		//print bingo
		
		
		//Arrays.sort( dcComicHeros); // bunu yaptigimizda asil arrayizi kaybediyoruz. 
		                             //eger onu da muhafaza etmek istiyorsak new variable olusturacagiz
		
	    Arrays.sort(herosCopied);
	    System.out.println( Arrays.toString( herosCopied) );
	    System.out.println( Arrays.toString( dcComicHeros) );
	    
	    
	    
	    
	    for (String hero : dcComicHeros) {
	      //System.out.println(hero);
	      if(hero.equals("Vasyl")) {
	        System.out.println("Bingo");
	      }
	      }
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	 