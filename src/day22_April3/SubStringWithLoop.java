package day22_April3;

public class SubStringWithLoop {

	public static void main(String[] args) {
		
//        Task 2
//   
		String str = "ABCDEFGHI";
//        print 2 letter 
		
		  for (int i = 0; i < str.length(); i+=2) { //harf ikiserli gitsin
		      
		    
		    if (i !=  str.length()-1) {
		    	
		  System.out.print(str.substring(i, i+2)+ " ");   //harf ikiserli gidecegi icin bir dersek sadece bize bir harf cikarir cunku son rakamdan bir eksik yazdiriyor
			  
		  }else {
			  System.out.print(str.substring(i));
			  
		  }
		  }
		    System.out.println();
		    
		    for ( int i = 0; i < str.length(); i+=3) {
			      
			    
			    if (i !=  str.length()-2) {  //out of range olmamak icin azaltiyorsun. 
			    	                        //3 azaltmadik cunku zaten normalde bir azini yazdiriyoru
			  System.out.print(str.substring(i, i+3)+ " ");
				  
			  }else {
				  System.out.print(str.substring(i));
				  
			  }   
	}
		  
	}
}
