package day48_May21;

public class Animal {

	
	 String breed;   //if we do private in other class, it gave us compile error
	//we will inherit just all visible 
	protected String color;
	protected boolean wild;
	int legcount;
	
	
	/*WHAT IF I WANT TO ACCESS THE MEMBERS
	 * IN SUB CLASSES LOCATED IN DIFFERENT PACKAGE
	 * 
	 * protected access modifier enable sub classes package
	 * to access super classes protected (access modifier)fields
	 */
	
	
}
