package day38_May5;

import java.util.ArrayList;

public class _8ArrayLIstTask5 {

	public static void main(String[] args) {

	    ArrayList<String> lst1 = new ArrayList<>();
	    lst1.add("Superman"); 
	    lst1.add("Batman"); 
	    lst1.add("Aquaman"); 
	    
	    ArrayList<String> lst2 = new ArrayList<>();
	    lst2.add("Wonder Woman"); 
	    lst2.add("Cyborg"); 
	    lst2.add("Flash");
	    
//	    lst1.addAll(lst2) ; 
//	    System.out.println(lst2);
	    
	    lst1.addAll(2, lst2); 
	    
	    System.out.println("Justice league : " + lst1);
	    
	    ArrayList<String> lst3 = new ArrayList<>(lst1); //you can create arrayList all the items from another list
	    
	    System.out.println("Justice league Earth 2 : " + lst3);
	    
	    
	  //How to get String representation out of arraysList 
	    
	    String lstAsString =lst3.toString();
	    
	    System.out.println(lstAsString); //whenever you print out a reference variable 
	    System.out.println(lst3.toString());
	    System.out.println(lst3);
	    
	    //that point to an object,
	    //it will automatically call toString() method implicitly 
	    //kullan veya kullanma otoatik olarak toString methodunu cagiriyor		
	  }
	}