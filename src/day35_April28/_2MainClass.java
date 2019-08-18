package day35_April28;

public class _2MainClass {

	public static void main(String [] args) {
		
		//String [] args ---> String yerine int yazarsam compile olmaz
		//String [] args ----> args yerine herhangi birsey yazarsak farketmez.
		
		System.out.println("I did not come this far just to come this far");
		
       System.out.println(args.length);// olarak bakarsak sifir verir cunku  icinde herangi bir sey yok su an
       
    // java MainClass abc d egf 
       // this is how it's working behind scence
       // String[] args = {"abc","d","egf"} ; 
       // if we dont pass any cmd argument 
       // String[] args = {} ;     
       
     
       System.out.println(args[0]); //give error because we dont have anything


     }

   }

	