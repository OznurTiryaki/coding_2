package day45_May15;

import java.util.Arrays;

public class Spartan {
	
	
	/*calling a Constructor
	 * Where:when object is being created
	 * a constructor can only be called inside another constructor of same class
	 * Rule;
	 * this(args...) use this keyword with () and pass arguments 
	 * 
	 * 
	 * 
	 * 
	 */

	String name;
	int studyHour;
	int horsePower;
	boolean tired;
	String [] certificates;
	
	public Spartan () {   //how you can set for arg constructor
		//this no arg constructor should set default value for name, study value, horsePower
		//because we didnt set the name. 
		//generally no arg cons give default but this have specific requirement
		System.out.println("no arg");
		
//		this.name= "Cybertek"; we have already as a constructor
//		this.studyHour=5;
		this.horsePower=320;
		 //this.certificates = new String[] {"OCA","OCP"};you will also do in one shot 
	}
	
	public Spartan (boolean tired) {
		
		  this ("Oznur",5,600, true, new String []{"SM"});
		  		
	  }
		
	
	public Spartan (String name, int studyHour) {  //kod tekrari gibi oldugunda bir diger constructor'u cagirabilirsin
		//we call that chain constractor , we do with this();
		
		this.name=name;
		this.studyHour=studyHour;
	}

	public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
		
		this.name = name;
		this.studyHour = studyHour;
		this.horsePower = horsePower;
		this.tired = tired;
		this.certificates = certificates;
	}

	//whenever an object is being printed directly
	//compiler will call this method to get String representation
	  public String toString() {
	    return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
	        + ", certificates=" + Arrays.toString(certificates) + "]";
	  }
	  
	  
	  
	
}
