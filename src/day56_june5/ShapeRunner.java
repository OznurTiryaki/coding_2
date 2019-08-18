package day56_june5;

public class ShapeRunner {

	public static void main(String[] args) {
		
		Retangle s1 = new Retangle("Red", 7, 10); 
		    s1.calculatePerimeter();
		    
		    System.out.println(  s1.calculateArea()   );
		    System.out.println(s1);
		    
		    
		    Circle s2 = new Circle("red" , 10) ; 
		    System.out.println(s2);
		    s2.calculatePerimeter();
		    System.out.println(  s2.calculateArea()   );
		    
		  }

}
