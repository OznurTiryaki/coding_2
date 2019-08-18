package day47_May19;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {

	public static void main(String[] args) {
		

	    // counting objects 
	    // there is no way to count object programmatically 
	    // just by looking at new keyword 
	    // we need to find a block of code that run 
	      // when object is being created so we can 
	      // increase the count there
	    
	    Bike b1 = new Bike("Kawasaki", 4, 80);
	    Bike b2 = new Bike("Ducati", 5, 90);
	    Bike b3 = new Bike("Yamaha", 4, 88);
	    Bike b4 = new Bike("Harley-Davidson", 3, 70);  
	    
	    ArrayList<Bike> allBikes = new ArrayList<>(Arrays.asList(b1,b2, b3, b4));
	    
	    for (int i = 0; i < allBikes.size(); i++) {
	      System.out.println( allBikes.get(i)  );
	    }
	    System.out.println("--------------------------");
//	    for( Bike each : allBikes) {  
//	      
//	      //System.out.println(each);
//	      System.out.println(  each.getId()  +" ---" +  each.getBrand()   );
//	      each.speedUp(10);
//	      System.out.println( each.toString() );
//	      
//	    }
	    System.out.println("--------------------------");
	    Bike.showCurrentCount(); //-->> Bike count is 4 now
	    
	    Bike.resetCount();
	    Bike.showCurrentCount(); //-->> Bike count is 4 now
	    
	    Bike b5 = new Bike("Yamaha", 4, 88);
	    System.out.println("current id of b5 is " + b5.getId());
	    Bike b6 = new Bike("Harley-Davidson", 3, 70);  
	    System.out.println("current id of b6 is " + b6.getId());
	    Bike.showCurrentCount(); //-->> Bike count is 4 now
	      
	    
	  }

	}