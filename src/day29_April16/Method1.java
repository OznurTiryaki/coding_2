package day29_April16;

public class Method1 {

	public static void main(String[] args) {
		// Method : 


		// grouping things together 
//		/ breaking things apart 
//
//		Scenario : 
//
//		steps 
//		1, making internet connection 
//		2, navigate to the amazon 
//		3, search for items 
//		4, add to the cart 
//		5, fill up payment info and pay 
//		6, receive confirmation in email 
//
//
//		methods that we know so far : 
//
//		main method : 
//			special method that start and run your program
//
//		Scanner class methods : 
//			next()
//			nextX()...
//
//		String class methods 
//			strObject.length() 
//			strObject.subString(1,4)
//			strObject.charAt(0)
//
//		Arrays class methods 
//			Arrays.toString(arrobject)
//			Arrays.sort(arrobject)
//			
//
//		method observed : 
//
//		1, method without return value 
//
//			*some methods only take action without returning/generating a new value so we can store 
//				example : Arrays.sort(arr)
//
//		2, method with return value 
//
//			*some methods take action and return a value so we can store 
//				example :strObject.length()
//
//		3, method that does not take external data when being called 
//
//			 strObject.length(); 
//			 strObject.toUpperCase(); 
//			 strObject.toLowerCase(); 
//			 strObject.trim(); 
//			 scanObject.next();
//
//		4, method that take external data when being called 
//			 
//			 strObject.charAt(10); 
//			 Arrays.sort(arr);
//			 strObject.indexOf("horse"); 
//			 strObject.subString(1,3);
//			 Arrays.copyOfRange(arr,1,4);
//
//		5, some methods need an object so we can call using that object 
//
//			strObject.charAt(10);
//			String.charAt(10) WRONG !!
//			scanobject.next() ; 
//
//		6, some methods DOES NOT need an object to be called 
//
//			Arrays.sort(arr) ; 
//			Arrays.equals(arr1,arr2); 
//
//			
//
//
//
//
//
//
//			  
//
//
//			  
//			 	 	 
//
//
//
//
		
		
		codunaKurban ();
		holdYourHorse ();
	}
	// to create method it need to be outside of methodd
	
	public static void codunaKurban () {
		System.out.println("Hey! finally we create our method");
	}
		
	public static void holdYourHorse () {
		
		String owner = "Oznur";
		
		System.out.println(owner + " hold your horse please!");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
