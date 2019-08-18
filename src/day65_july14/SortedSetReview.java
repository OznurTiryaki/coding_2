package day65_july14;

import java.util.*;

public class SortedSetReview {

	public static void main(String[] args) {

//		SortedSet<String> sSet = new TreeSet<>(); //When we add item, it directly add like sorted,
//		                                                     // between them not just behind and front
//		
//		sSet.add("Uulkan"); 
//		sSet.add("Secil"); 
//		sSet.add("Mavlida"); 
//		sSet.add("Uulkan");
//		sSet.add("Emine");
//		sSet.add("Emine");
//		sSet.add("Emine");
//		
//		System.out.println(  sSet  );  //[Emine, Mavlida, Secil, Uulkan]
//		
//		sSet.forEach( each -> System.out.println(each)  );  //to print each one

		// Comparator<String> revStrCom = Collections.reverseOrder(); Comparator is a
		// interface. It help us compare to String and collection 
		
		Comparator<String> revStrCom = Comparator.reverseOrder(); 

		SortedSet<String> sSet = new TreeSet<>( revStrCom ); 
		
		sSet.add("Uulkan");
		sSet.add("Secil");
		sSet.add("Mavlida");
		sSet.add("Uulkan");
		sSet.add("Emine");
		sSet.add("Emine");
		sSet.add("Emine");

		System.out.println(sSet);  //[Uulkan, Secil, Mavlida, Emine]
	

		sSet.forEach(each -> System.out.println(each));

	}

}