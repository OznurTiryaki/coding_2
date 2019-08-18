package day43_May12;

public class ProductRunner {

	public static void main(String[] args) {
		

		Product p1 = new Product(); 
	    //p1.name = "someyhin"; 
	    p1.initilizeAllFieldValues("Watch", 4.5f, 113.39,"x123");
	    
	    System.out.println(  p1.getName()  );
	    System.out.println(  p1.getRating()  );
	    System.out.println(  p1.getPrice()  );
	    System.out.println(  p1.getProductId()  );
	    
	    // 20 $ sale is on going , change the value of price
	    p1.setPrice(113.39 - 20);
	    
	    
	    String productInfo = "Bag, 4.9, 399.99, gucci12";  //string olarak veriyor tek tek
	   // almamiz icin ilk once split yapip array icin alacagiz
	    // take above String and turn it into Product Object 
	    String[] productSplitted = productInfo.split(", "); 
	    
	    String productName   = productSplitted[0]; 
	    float productRating  = Float.parseFloat( productSplitted[1] ) ; 
	    double productPrice  = Double.parseDouble(productSplitted[2])  ; 
	    String productId = productSplitted[3];
	    
	    Product p2 = new Product(); 
	    p2.initilizeAllFieldValues(productName, productRating, productPrice, productId);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }

	}