package day28_April14;

public class Array9Multi3Way {

	public static void main(String[] args) {
		
		int [] [] data = { { 2,14,3}, 
				   { 4, 5 },
				   { 9, 7 }  };

//for each loop ile arraydan cikarma
     for (int[] allBoxes : data) {
		for(int total : allBoxes) {
			
			System.out.print(total + " ");
		}
		System.out.println();
}

//for ile arraydan cikarma

	for(int i=0; i<data.length; i++) {
		
		System.out.println("Row number " + (i+1) + " : ");
		
		
		for(int j =0; j<data[i].length; j++) {
			
			System.out.print(data[i][j] + " ");
		}
		
		System.out.println();
	}
	
	 // System.out.println( "data["+0+"]["+0+"] = " + data[0][0] );
	

    for (int i = 0; i < data.length; i++) {

      for (int j = 0; j < data[i].length; j++) {
    	  
        System.out.print("data[" + i + "][" + j + "] = " + data[i][j] + " | ");
      }
      
      System.out.println();
    }

  }

	}

