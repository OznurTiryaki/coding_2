package day22_April3;

public class LookingForWordInSentences {

	public static void main(String[] args) {
		
		String str = "avavavaava " ;
		    
		    String target = "ava" ; 
		    
		    //int firstIndex = str.indexOf( target ); 
		    int laststIndex = str.lastIndexOf( target ); //10 verir
		    
		    int index = 0 ; 
		            //0<=10
		    while( index<= laststIndex   ) {  
		                         //"ava", 0
		      index = str.indexOf(target, index);// yani burada target kelimeyi 0dan itibaren ara diyoruz
		      System.out.println("Found at index : "+ index);
		      //index = index + 1 ; 
		      index = index + target.length() ; 
		      
		    }
		    
		    
		    
		    
		    
		    

		  }

		}
