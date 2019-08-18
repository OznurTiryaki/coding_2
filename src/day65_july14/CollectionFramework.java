package day65_july14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFramework {

	public static void main(String[] args) {

		// GIVEN 
		String str = "ABCABCEFGADBHYKJSGD"; 
		// Find Out how many unique character 
		
		// HINT : 
		
	//	char[] arr = str.toCharArray();  // Convert this to an array or make String array
		
		String[] strArr = str.split(""); 
	
		List<String> lst = Arrays.asList(strArr ) ; // store it in List 
		
		System.out.println(lst);  //we will see all elements inside list
		 
		Set<String> charSet = new HashSet<>( lst ); // use one of data structure that store unique element 
		  //set methodu sadece unique elemanlari icine alir.
		System.out.println(charSet);  //[A, B, C, D, E, F, G, H, J, K, S, Y] 
		System.out.println(charSet.size());  //12
		
//		for loop ile dondurerek her bir elemani icine ekleyedebiliriz.
		
//		Set<Character> charSet = new HashSet<>();  sag tarafin imlement eden siniflardan olmasi lazim. Set is interface object olusturamayiz.
		                                          //<Character> dedik cunku collectionlar primitive degil sadece object kabul eder.
//		
//		for (int i = 0; i < str.length(); i++) {
//			//System.out.println(  str.charAt(i)  );
//			charSet.add( str.charAt(i) ) ; 
//		}
//		System.out.println(  charSet);
//		
//		
		
		
	}

}