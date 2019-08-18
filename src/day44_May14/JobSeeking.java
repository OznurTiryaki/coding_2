package day44_May14;

import java.util.ArrayList;

public class JobSeeking {

	public static void main(String[] args) {

		Job j1= new Job();    //public Job() {   //constructor with no arg
		Job j2= new Job("Senior Sdet");   //public Job(String title) {   //constructor
		Job j3= new Job("Scrum Master","Oracle",130000); //public Job(String title,String company, double annualSalary ) {   
		Job j4= new Job("Sdet","Santander",125000);
		Job j5= new Job("Tester", "Google", 100000.0);  
		Job j6= new Job("Programmer", "Apple", 2000000); 
		
		System.out.println( j1.getAnnualSalary()  );
		System.out.println( j1.getTitle()  );
		
		System.out.println(j1.toString() ); //eger icinde 3 degerde yoksa default value veriyor
		System.out.println(j2.toString() );
		System.out.println(j3.toString() );
		System.out.println(j4.toString() );
		System.out.println(j5.toString() );

		// if we print out any reference variable directly
		// or any object directly 
//		// it will by default call toString() 
		
		System.out.println(j6 ); 
//		
		ArrayList<Job> jobs = new ArrayList<>(); //it is to add more than one job
		jobs.add(  new Job("Programmer", "Apple", 2000000) ) ;//we create object direckly here
		jobs.add(j1) ; //each on eotomaticly call toString method thats why we saw all inside
		jobs.add(j2) ; //just if they dont have a paramater, it will give default value
		jobs.add(j3) ; 
		jobs.add(j4) ; 
		jobs.add(j5) ; 
		
		//System.out.println( jobs  );
		//System.out.println( jobs.get(0)  ); aslinda bu ( jobs.get(0).toString()  ) ile ayni sy
		//sadece tekrar yazmamiza gerek yok otomatik yapiyor
		for( Job each : jobs  ) {
			
			System.out.println(each);
			
		}
		System.out.println("---------------");
		for (int i = 0; i < jobs.size(); i++) {  //we direckly print our object but it
			//magicly call the toString method and print all info
			System.out.println( jobs.get(i) );
		}
		
		
	}

}
