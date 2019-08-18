package day58_june9;

public class Triangle extends Shape{
	
	 // String color
	  int base, height;

	  public Triangle(String color, int base, int height) {
	    this.color = color;
	    this.base = base;
	    this.height = height;
	  }

	  public static void main(String[] args) {

	    Triangle t1 = new Triangle("red", 10, 5);
	    System.out.println(t1.calculateArea());
	    t1.draw();
	    t1.drawLine(3);

	    Square s1 = new Square("Blue", 7);
	    System.out.println(s1.calculateArea());

	    s1.draw();
	    s1.drawLine(4);
	    
	    System.out.println( DRAWING_TOOL  );
	    Drawable.printDrawingTool();
	    
	    ;

	  }
	  
	  // below methods are implementation of abstract methods 
	  // inherited from super class 
	  @Override
	  public void draw() {
	    System.out.println("DRAWING TRIANGLE");
	  }
	  // this is how we actually calculate area of Tirangle
	  @Override
	  public double calculateArea() {
	    return base * height / 2;
	  }

	  @Override
	  public String toString() {
	    return "Triangle [base=" + base + ", height=" + height + ", color=" + color + "]";
	  }

	}
/*Task 2 


Create an interface called Drawable 
  with below members
  
    constant DRAWING_TOOL  
    abstract method draw 
    
    default method drawLine  accept one int as line count and print drawing n line 
    
    static method printDrawingTool accept no arg and return nothing 
    

Abstract class called Shape , implements Drawable 
  it has instance fields 
    color 
    
  it has abstract method calculateArea 
  it has abstract method toString 
  

Create a concrete Shape class called -- Triangle 

  it has height , base   -->> formula to calculate area base * height / 2 
  it has constructor to set all the values 
  
  create a constructor to set all the value 
  
  override all the abstract method that you inherited
  

Optionally create Square -- sub class of Shape 
  it has sizeLength 
  
  create a constructor to set all the fields 
  implemenet all the unimplemented methods 
  
  
  Eventually in main method create few objects and call their methods 
*/
  

  
  











