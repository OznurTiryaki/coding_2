package day27_April13;



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practiceccccc {

	public static void main(String[] args) {
		

		String[] comicheros = {"Superman", "Batman"};
		
	    String [] herosCopies = new String [comicheros.length];
	    

	    
	    for (int x =0 ; x< herosCopies.length ;x++) {
	    	herosCopies[x]=comicheros[x];
	    }
	    Arrays.sort(herosCopies);
	    System.out.println(Arrays.toString(herosCopies));
	    
	  
	    
	    System.out.println(Arrays.toString(comicheros)); 
	    
	    
	    
	    
	    
	    
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	