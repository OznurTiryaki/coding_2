package day41_May8;

public class Teacher {
	
	private String name ; 
	
	private String specialty;
	
	//getters and setters just like other methods
	
	//it 's specifically for getting the fields value
	//it accepts no paramater
	//and returning it from the method
	//it accepts no parameters

	
	
	public String getName () {
	return name;
	
	}
	
	public void setName(String newName) {
		name= newName;
	}
	
	public String getSpecialty() {
		return  specialty;
		
		}
		
		public void setSpecialty(String newSpecialty) {
			 specialty= newSpecialty;
		}
}
