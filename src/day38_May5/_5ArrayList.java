package day38_May5;

import java.util.*;

public class _5ArrayList {

	public static void main(String[] args) {
		
		ArrayList <String>  myList = new ArrayList <>();
		
		// List <String> list2 = new ArrayList <>();
		
		    myList.add("Zuccini");
	        myList.add("Cucumber");
	        myList.add("Cabbage");
	        myList.add("Watermelon");
	        myList.add("BlueBerry");
	        myList.add("Apple");
	        myList.add("Bananas");
	        myList.add("Milk");
	        System.out.println(myList);

	       //to update first item   
	        myList.set(0, "Tomatoes");
	        
	        System.out.println(myList);
	        
	        //insert new item , after cucumber
	        
	        myList.add(2, "Rasberry");
	        
	        System.out.println(myList);
	         
	        //check an item exists in the list
	        
	        boolean haveMilkOrNot= myList.contains("milk");
	        
	        System.out.println("Got milk? " +haveMilkOrNot); //false because case matter/ not with Upper Case
	        
	        //check the location of certain items
	        
	        int indexOfCabbage= myList.indexOf("Cabbage");
	        
	        System.out.println("Index of cabbage " +indexOfCabbage);
	        
	        //How we can see size
	        
	        System.out.println("The size of Array List: " + myList.size());
	        
	        //How we can remove one of them
	        
	        myList.remove(4); //to remove watermelon
	        
	        System.out.println(myList);
	        
	        myList.remove("kiwi"); //if you try to remove we don't have nothing happen
	        
	        System.out.println(myList);
	        
	        //deleting all from the list
	        
	        myList.clear();
	        
	        System.out.println( myList);
	        
	        //how i can see list is empty or not
	        
	        System.out.println("checking the list is emty or not: "+ myList.isEmpty());
	        
	}

}
