package day48_May21;

public class StudentTester {

	public static void main(String[] args) {
	
		    
		    Person p1 = new Person();
		    p1.name = "Lili";
		    p1.age = 25;
		    p1.height =5.5f;
		    p1.gender = 'M';
		    
		    System.out.println(p1.height);
		    
		    Student s1 = new Student();
		    s1.name = "Oguzhan";
		    s1.age = 15;
		    s1.gender = 'M';
		    s1.height = 5.10f;
		    s1.studentId = 123;
		    
		    System.out.println(s1.studentId);
		    
		    
		    
		//almost all information dublicated here. we need to use extend
		//keyword to build this relationship
		
		
		/*public class Teacher extends Person {
		 * Teacher happen sub class after extends 
		 * sub class more specific type
		 * person is a super class
		 * super class always more general one
		 * 
		 * Is-A -Relationship
		 * Student is a person
		 * 
		 * 
		 */
		
	}

}
