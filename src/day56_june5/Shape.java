package day56_june5;

public abstract class Shape {
      
	String color;
	 
      public Shape(String color) {
	
		this.color = color;
	}
	public abstract void calculatePerimeter ();
      public abstract double calculateArea ();
	  public abstract String toString();  //when we add abstract it, we have to implement toString method
      
	// THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD 
	 
    // --->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT'S DEFINED IN ABSTRACT METHOD
	  
}
class Circle extends Shape{
	
	double radius;
	
	public Circle(String color, double radius) {
		super(color);  //dry principle call other constructer with super keyword
		this.radius = radius;
	}
	public void calculatePerimeter() {
	double d=Math.PI * 2 * radius;
	System.out.println("Calculater perimeter of circle in circle ");
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
}
class Retangle extends Shape{
	
	  int width;
	  int height;
	  
	  public  Retangle(String color, int width, int height) {
	    super(color);
	    this.width = width;
	    this.height = height;
	  }
	
	  @Override
	  public void calculatePerimeter() {
	    System.out.println("Perimeter is: "+(2*width+2*height));
	    
	  }
	  @Override
	  public double calculateArea() {
	    return width*height;
	    
	  }
	  @Override
	  public String toString() {
	    return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
	        + calculateArea() + "]";
	  }
	
	 
	
}



/*instance filed : 
	color

1 arg constructor to set the field value 

abstract methods 

	calculatePerimeter() 
	calculateArea()  
	abstract toString() method accpet no param , return String 

sub classes 

Circle 
	radius as double 

2 args constructor to set the field values 

implement abstract methods from super class 



Rectangle 
	
	protected instance fields   width , height 

	3 args constructor to set the field values 
	implement abstract methods from super class 

create a main method in rectangle and 
	create 1 Circle and 1 Rectangle object 
	call their methods 
*/

