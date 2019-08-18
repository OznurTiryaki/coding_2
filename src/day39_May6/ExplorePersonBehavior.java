package day39_May6;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		
		Person p= new Person();
		p.age=19;
		p.gender='M';
		p.name="Night King";
		
		p.eat();   //we can call method from your classes

		p.tellMeYourName(); ///when we call method from class we will see the name
		p.printPersonInfo () ;
		
		
		
		Person g= new Person();
		g.age=29;
		g.gender='F';
		g.name="Alina";
		
		g.eat();  
		g.tellMeYourName(); 
		g.printPersonInfo () ;
	}

}
