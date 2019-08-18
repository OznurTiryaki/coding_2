package day11_March16;

public class TernaryOperator1 {

	public static void main(String[] args) {
		// TAsk
		
		double price = 10.5 ;
		
        String label;
        
   /*    OR if (price >100) tek statement oldugu icin curly braces a gerek yok
    
        	
        label = "expensive";
        
        else 
        
         label = "cheap";  */
        
        label = (price >100) ?  "expensive" : "cheap";
        
        System.out.println(label);
        
     /*   or to make char
        
        char label;
        
         label = (price >100) ?  'A" : 'B';
        */
        
        
        
        
        if (price > 100) {
        
        	 label = "expensive";
        
        }else if (price > 90) {
        	
        	label = "moderate";
        }else {
        	
        	label = "cheap";
        }
        
        
        label = (price>100) ? "expensive" : ( (price>90) ? "moderate" : "cheap" )  ; 
        
        System.out.println(label);
        //String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp" ; 
        
        String label2 = (price <= 100 && price >90) ? "moderate" : "cheapOrExp" ;
        
        
        
        
        
        
        
        
        
        
	}

}
