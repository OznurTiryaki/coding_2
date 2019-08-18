package day49_May22;

public class Employee extends Object {
	
	/*if a class not extendss another class explicitly
	 * it will extends a class called inpilicitly
	 * 
	 * 
	 * 
	 */
	
	
	
	//Employee---> FullTimeEmployee--->Teacher
	
	private String title;
	private int id;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Spartan";
	}

	
	
	/*if we do private title and and id in employee class
	 we cannot see in FullTimeEmployee classes
	String title;
	int id;
	
	*if it is private we need to do encapsulation
	*after that we can access the private one
	*/

}
