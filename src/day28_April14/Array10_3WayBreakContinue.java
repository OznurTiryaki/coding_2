package day28_April14;

public class Array10_3WayBreakContinue {

	public static void main(String[] args) {
		//int[] nums = {1,23,4} ; 
	    
	    int[][] data = { {2,14,3} , {4,5} , {9}  } ; 
	    
//	    for( int[] row : data) {
//	      
//	      for( int cell : row) {
//	        
//	        System.out.print(cell + " ");
//	        
//	      }
//	      System.out.println();
//	    }
	    
	    // data[0][0]= 2 |  data[0][1]= 14 | 
	    
	    for (int i = 0; i < data.length; i++) {
	      
	      // this will skip second iteration -- which is 2nd row 
//	      if(i==1) {
//	        continue ; 
//	      }
//	      if(i==1) {
//	        break ; 
//	      }
	      
	        
	      System.out.print("Row Number " + (i+1) + " : ");
	      
	      for(int j=0 ; j <  data[i].length ; j++) {
	        
	        if(data[i][j]==4)  //4 ise skip et,
	          continue; 
	        
	        System.out.print( data[i][j] + " "    );
	      }
	      
	      System.out.println();
	      
	      
	    }
	    
	    
	    
	  }
	  
	}
