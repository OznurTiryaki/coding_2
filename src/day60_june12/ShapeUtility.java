package day60_june12;


import day58_june9.*;


public class ShapeUtility {

	

	

	  public static void main(String[] args) {
	    
	    
	    
	    describeTheShape(  new Triangle("Red",12, 10));

	    
	    Shape s1 = new Triangle("Red",12, 10); 
	    describeTheShape(  s1  );
	    
	    describeTheShape( new Square("blue", 5));
	    
	    
	    // something rediculous but focus on concept itself 
	    describeTheShape( new Dog() ); 
	    
	  }
	  // we dont want to create object while calling this 
	  // utlity method so we just made it static 
	  public static void describeTheShape(Shape anyShape) {  
	    
	    System.out.println("calling describeTheShape(Shape anyShape)");
	    anyShape.draw();

	  }
	  // create another method that accept Triangle object only 
	  
	  
	  public static void describeTheShape(Triangle anyTriangle) {  
	    System.out.println("calling describeTheShape(Triangle anyTriangle)");
	    anyTriangle.draw();
	  }
	  
	  // do not get fooled by the name 
	  // it accept any type of Object 
	  public static void describeTheShape(Object anyObject) {  
	    System.out.println("calling describeTheShape(Object anyObject))");
//	    anyObject.draw();
//	    anyObject.makeNoise(); 
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}
