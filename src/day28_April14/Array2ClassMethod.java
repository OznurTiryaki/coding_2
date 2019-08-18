package day28_April14;

import java.util.Arrays;
import java.util.Scanner;

public class Array2ClassMethod {

	public static void main(String[] args) {
		/*
	     * Arrays Class methods to work with array object 
	     * 
	     * toString(arrObject) --->> return string rep of array items 
	     * sort(arrObject) ; --->  sort the array 
	     * copyOf(arrObject , lengOfNewArr) ---> new array with length defined 
	     *               and everything copied from original 
	     * copyOfRange(arrObject, from,to)  --> works like subString
	     * equals(arr1, arr2) ---> true false if all elements are the same and in same order
	     * 
	     * binarySearch
	     * */
	    String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"}; 
	     
	     Arrays.sort(words);
	     System.out.println( Arrays.toString(words) );
	     
	     String[] first2words = Arrays.copyOf(words, 2) ;
	     System.out.println( Arrays.toString(first2words) );
	     
	     String[] tenItem = Arrays.copyOf(words,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	     // create a program to add items to an array by users input 
	     // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}  
	    
	     Scanner scan = new Scanner(System.in); 
	     System.out.println("Enter your word to be added ");
	     String usersWord = scan.next() ; 
	     
	     String[] newWords = Arrays.copyOf(words, words.length + 1) ; 
	     System.out.println( Arrays.toString(newWords) );
	     
	     int lastSpotIndex = newWords.length-1 ; 
	     newWords[lastSpotIndex] = usersWord ; 
	     System.out.println( Arrays.toString(newWords) );
	       
	     
	     
	     
	     
	    
	    
	    

	  }

	}