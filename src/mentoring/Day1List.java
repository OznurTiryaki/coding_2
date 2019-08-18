package mentoring;

import java.util.*;

public class Day1List {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
	//	List<String> list = new LinkedList<>();

		
		//add(Element)
		list.add("Erhan"); //0
		list.add("Halil"); //1 
		list.add("Ibrahim"); //2
		list.add("Yusuf");
		list.add("Fatih");
		list.add("Said");
		list.add("Halid");

		// size

		System.out.println(list.size());

		System.out.println(list.isEmpty()); // return boolean

		List<String> list1 = new ArrayList<>();

		list1.addAll(list);
		list1.add("Betul");
		list1.add("Sude");
		list1.add("Ozge");
		
		list1.remove("Ozlem");  //if we print it, it gives us false, it return boolean

		System.out.println(list1); //[Erhan, Halil, Ibrahim, Yusuf, Fatih, Said, Halid, Betul, Sude, Ozge]

	//	list1.removeAll(list);  // [Betul, Sude, Ozge]

		System.out.println(list1);
		
		System.out.println(list1.containsAll(list)); //return boolean -->true
		
	
	
		// addAll(Collection)
		// remove(Element)
		// removeAll(Collection)
		// contains(Element)
		// containsAll (Collection)
		// clear() --> faster than removeAll methods.
		// Collection.reverseOrder()

		// iterate method
//nextIndex()
//previousIndex()
//hasPrevious()
//Iterator.previous();	

// inserting all elements, list2 will get printed 
// after list1 
//  arrlist1.addAll(arrlist2); 

		Collections.reverse(list);  
		System.out.println(list);  // [Halid, Said, Fatih, Yusuf, Ibrahim, Halil, Erhan]


		
		

		// retainAll(Collection)
		
		
		// Creating an empty array list
		ArrayList<String> bags = new ArrayList<String>();

		// Add values in the bags list.
		bags.add("pen");
		bags.add("pencil");
		bags.add("paper");

		// Creating another array list
		ArrayList<String> boxes = new ArrayList<String>();

		// Add values in the boxes list.
		boxes.add("pen");
		boxes.add("paper");
		boxes.add("books");
		boxes.add("rubber");

		// Before Applying method print both lists
		System.out.println("Bags Contains :" + bags);
		System.out.println("Boxes Contains :" + boxes);

		// Apply retainAll() method to boxes passing bags as parameter
		boxes.retainAll(bags); // we try to find a bags elements in boxes, and remove others
	//	Boxes Contains :[pen, paper]
		// Displaying both the lists after operation
		System.out.println("\nAfter Applying retainAll()" + " method to Boxes\n");
		System.out.println("Bags Contains :" + bags);
		System.out.println("Boxes Contains :" + boxes);

	

	    List<Integer> list3 = new ArrayList<>();
	    
	    list3.add(1);   
	    list3.add(2);
	    list3.add(3);
	    list3.add(4);
	    list3.add(5);
	    list3.add(6);
	    list3.add(7);
	    
	    List<Integer> partOflist = list3.subList(2, 6) ;  //6 --> exclusive 
	    
	    System.out.println(partOflist); //[3, 4, 5, 6]
	     
	    partOflist.set(0, new Integer (74)); // [74, 4, 5, 6]
	    
	    System.out.println(list3); //[1, 2, 74, 4, 5, 6, 7 ]       
	    
	    // what if we want to create an independent list with portion of 
	    // the original list items  use new ArrayList 
	    
	    List<Integer> independentLst = new ArrayList<>( partOflist   ) ; 
	    
	   // List<Integer> independentLst2 = new ArrayList<>( list3.subList(2, 6) ) ;
	    
	    System.out.println(independentLst); //[74, 4, 5, 6]
	    independentLst.set(0, new Integer (12));  
	    System.out.println(independentLst); // [12, 4, 5, 6]
	    System.out.println(list3); //[1, 2, 74, 4, 5, 6, 7]
	
	}
}
