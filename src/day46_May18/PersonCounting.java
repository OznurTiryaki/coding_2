package day46_May18;

public class PersonCounting {

	public static void main(String[] args) {
		
		Person p1 = new Person("Mavlida", 5.3f,'F');  //if it is static p1, 1 den baslar ve arrttirarak gider
	    System.out.println( p1.counter  );

	    Person p2 = new Person("Ganisher", 6.1f,'M');
	    System.out.println( p2.counter  );
	    
	    Person p3 = new Person("Manzire", 5.3f,'F');
	    
	    System.out.println( p1.counter  );  //if we delete static, it not shared and always start from 0
	    System.out.println( p2.counter  );
	    System.out.println( p3.counter  );
	    
	 //  System.out.println(Person.counter);
	    
	    //if it static ,they will have single value to share
	    
	 
	    
	    
	  }

	}