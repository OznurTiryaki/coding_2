package day58_june9;

public class Square extends Shape {
      
	  int sizeLength;
//  String color;
//  public static final String DRAWING_TOOL = "PEN";  
	  
	  public Square(String color,int sizeLength) {
	    
	    this.color = color; 
	    this.sizeLength = sizeLength;
	  }

	  // we did not have to override this 
	  // since it already has the body in interface 
	  // we chose to override to provide our own implementation
	  @Override
	  public void drawLine(int n) {
	    
	    System.out.println("drawing square using 4 line");
	    System.out.println("drawing " + n + "times ");
	  }
	  
	  // below methods are implementation of abstract methods 
	  // inherited from super class 
	  @Override
	  public void draw() {   //it comes from interface 
	    System.out.println("draw SQUARE");
	    
	  }
	  // this is how we calculate are of square
	  @Override
	  public double calculateArea() {      //come from parent abstract class
	    //System.out.println(sizeLength * sizeLength);
	    return sizeLength * sizeLength ; 
	  }

	  @Override
	  public String toString() { //come from parent abstract class
	    return "Square [sizeLength=" + sizeLength + ", color=" + color + "]";
	  }

	  
	  
	  

}
