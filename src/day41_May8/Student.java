package day41_May8;

public class Student {
 
	
	/*Access modifiers
	 * 
	 * public/protected /default/private
	 * 
	 * you can use it for any methods/ like static non static
	 * 
	 * we can use it for fields
	 * 
	 * 
	 */
	
	
//	you will write private
//	public String name;
//	public int age;
//	public long ssn;
	
	String name;
	int age;
	long ssn;
	
	public void displayName () {
		System.out.println("name is: " +name );
		
	}
	public void displayNameandAge () {
		System.out.println("name is: " +name + " | age is: "+age);
	}
	private void showSSN () {    //we can do this is private
		System.out.println("The SSN is: " +ssn );
	}
}
