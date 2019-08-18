package day53_May29;

public class UK_OnlineCourse extends OnlineCourse{
	
	//int capacity=150; this come from super /grandparent class
	
	//	int capacity=300; this come from super/Online class
	
	int capacity = 200; 
	
	
	  public static void main(String[] args) {  
	    /*
	     * Course > OnlineCourse > UK_OnlineCourse
	     * */  
	    
	    UK_OnlineCourse sdet2 = new UK_OnlineCourse(); 
	    //System.out.println( sdet.capacity);
	    sdet2.showCapacity();  
	    
	 /*   1.it goes method that  object created.--> UK_OnlineCourse class
	  *   2. it print code flow
	     --->(capacity directly " + capacity);     //it goes closest one -- UK_OnlineCourse class-->200
	     ---> ("UK_OnlineCourse " +  this.capacity );   //it call this classes one (object from UK_OnlineCourse) -->200
	     ---->("OnlineCourse " +  super.capacity);  //it goes super class---> extend with onlineStudent-->300
	          UK_Online class' super class is OnlineCourse , so it print online courses -->300
	          
	     --->super.showCapacity();  we call this method from  super class (OnlineCourse)
	    and this method call two capacity from parent and grandparents class.
	    
	     ****public void showCapacity() {
		
		System.out.println(this.capacity);
		System.out.println(super.capacity); ****
	    
	    */
	  }
	  
	  @Override
	  public void showCapacity() {
	    
	    // AS LONG AS YOU HAVE A FIELD CALLED capacity in this class 
	    // below line will always be interpreted as this.capacity
	    System.out.println("capacity directly " + capacity);     //it goes closest one-- this class-->200
	    System.out.println( "UK_OnlineCourse " +  this.capacity );   //it call this classes one -->200
	    System.out.println( "OnlineCourse " +  super.capacity);  //it goes super class---> extend with onlineStudent-->300
	    
	    System.out.println("-----------------");
	    // how to print out Course capacity field 
	    
	    super.showCapacity();  //when we call method it show us grandparent and dad class, because we put inside that in dad class.
	    
	  }
	  
	  
	}