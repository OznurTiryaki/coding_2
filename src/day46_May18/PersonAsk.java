package day46_May18;

public class PersonAsk {

	public static void main(String[] args) {
		
		    
		    Person p1 = new Person("Ganisher", 6.1f,'M');
		    Person p2 = new Person("Mavlida", 5.3f,'F');
		    
		    // static way to access static variable 
		    System.out.println( Person.race );
		    // non static way to access static variable 
		    // highly not recommended
		    System.out.println( p1.race);
		    
		    Person.race = "Humanoid";
		    System.out.println(p2.race);
		    
		    p2.race = "Spartan" ; 
		    System.out.println(p1.race);
		    
		    

		  }

		}

	