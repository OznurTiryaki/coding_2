package day55_june2;

public abstract class AbstractionClassWithNoAbstractMethod {
  
	
	int id;
	String name;
	public static final String SCHOOL= "Cybertek";
	
	
	public AbstractionClassWithNoAbstractMethod(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public static void main(String[] args) {
		
	/*	AbstractionClassWithNoAbstractMethod obj=
				new AbstractionClassWithNoAbstractMethod ();
	
	we cannot create a object from abstract class
	*/
	}
}
