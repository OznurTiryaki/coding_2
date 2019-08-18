package day27_April13;

import java.util.Arrays;

public class Array11CopyOf2 {

	public static void main(String[] args) {
		String[] dcComicHeros = {"Superman",//0
	            "Batman",//1
	            "Aquaman", //2
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern"
	          } ;  
	    
	    
	    System.out.println(Arrays.toString(dcComicHeros));
	    
	    String[] copyOf2 =  Arrays.copyOf(dcComicHeros, 2) ; // like substring
	    String[] copyOf6 =  Arrays.copyOf(dcComicHeros, 6) ; 
	    
	    String[] copyOf0 =  Arrays.copyOf(dcComicHeros, 0) ; 
	   
	    String[] copyOf10 = Arrays.copyOf(dcComicHeros, 10) ; 
	   
	    copyOf10 [7] = "eskiya";
	    
	    System.out.println(Arrays.toString(copyOf2));
	    System.out.println(Arrays.toString(copyOf6));
	    System.out.println(Arrays.toString(copyOf0));
	    System.out.println(Arrays.toString(copyOf10));
	    
	    
	    
	    
	    
	    
	  }

	}


