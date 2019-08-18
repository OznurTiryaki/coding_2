package day42_May11;

import java.util.ArrayList;

public class Employee2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(); 
		e1.name="Abdul";
		e1.age=100;
		e1.title="Project Manager";
		e1.salary=120000.01;
		e1.printAllInfo();
		
		Employee e2 = new Employee(); 
		e2.age = 23;
		e2.name = "Makintosh";
		e2.salary=99000.0;
		e2.title = "Dev";
		e2.printAllInfo();	
		
		Employee e3 = new Employee(); 
		e3.name="mavlida";
		e3.age=28;
		e3.title="Senior QA";
		e3.salary=100000;
		e3.printAllInfo();
		
		Employee e4=new Employee();
		e4.name="Enser";
		e4.age=24;
		e4.title="CEO";
		e4.salary=3000000;
		e4.printAllInfo();
		
		//ArrayList<String> names  = new ArrayList<>(); 
		
		
		
		ArrayList<Employee> myPeople  = new ArrayList<>(); 
		myPeople.add(e1); 
		myPeople.add(e2); 
		myPeople.add(e3); 
		myPeople.add(e4); 
		myPeople.add(  new Employee() ); 
		
		System.out.println(  myPeople.size() );
		
		//System.out.println(   myPeople.get(4)  ) ; 
		Employee firstItem = myPeople.get(0); 
		firstItem.printAllInfo();
		
		Employee secondItem = myPeople.get(1); 
		secondItem.printAllInfo();
		
		Employee thirdItem = myPeople.get(2); 
		thirdItem.printAllInfo();
		
		Employee forthItem = myPeople.get(3); 
		forthItem.printAllInfo();	
		
		Employee fifthItem = myPeople.get(4); 
		fifthItem.printAllInfo();
		// myPeople.get(4) return Employee Object so we can directly call it's methods
		myPeople.get(4).printAllInfo();
		
	}

}
