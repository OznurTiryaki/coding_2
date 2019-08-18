package day50_May25;

public class ExtremeSport extends Sport{
	
	@Override
	public void doSport () {
				System.out.println("doing regular sport");
	}

	
	public void doSport1 () {
		System.out.println("doing regular sport----sky diving");
	}
	
	
	
	@Override
	public String toString() {
		return "extreme message"; 
		//we dont want to see hashcode, you will define your version
		//
	}


	public static void main(String[] args) {
		
		ExtremeSport e1= new ExtremeSport ();
		e1.doSport();  //it print because 
		e1.doSport1(); 
		System.out.println(e1.toString()); 
		

		Sport s1=new Sport ();
		System.out.println(s1);  //hashcode
		
	}

	

}
