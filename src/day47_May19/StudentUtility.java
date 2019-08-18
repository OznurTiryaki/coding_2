package day47_May19;

import java.util.ArrayList;
import java.util.Arrays;

    public class StudentUtility {

	private static ArrayList <String> studentList ;
	
	static {
		System.out.println("Welcome to Student Utility");
	}
	
	static {
		//we will do this as a method to like loadAllMyData (); and call in block
		//it is make same thing.
//		studentList= new ArrayList (Arrays.asList("Ahmet", "Mehmet","Murat", "Mustafa","Ayse",
//				"Selin","Fatma","Oznur","Betul","Fatih"));
		//lets do with method
		System.out.println("ALL STUDENTS HAS BEEN LOADED");
		loadAllMyData ();
	}
	
	private static void loadAllMyData () { //we did private, because we dont want anybody change it
		 
		studentList= new ArrayList (Arrays.asList("Ahmet", "Mehmet","Murat", "Mustafa","Ayse",
				"Selin","Fatma","Oznur","Betul","Fatih"));
	}
	public static void displayAllStudents () {
		
		for (int i = 0; i < studentList.size(); i++) {
		      
		      System.out.println( "No : " + (i+1)  + "-> " +  studentList.get(i) );
		      
		    }
	}
	public static void addStudents (String name) {
		studentList.add(name);
	}
	public static void updateStudents (String newName, int i) {
		
		studentList.set(i, newName);
	}
	
     public static void removeStudents (int j) {
		
		studentList.remove(j);
     }
     
     public static void resetStudent( ) {
 		studentList.clear();
     }
 		
} 
