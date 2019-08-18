package day34_April27;

import java.util.Arrays;

public class Method3MultiArray {

	public static void main(String[] args) {

		// Task 2 :

		/*
		 * create a method called get2DArray accept 2 int as parameters , row, col
		 * return 2D array object in below logic :
		 * 
		 * create a method called twoDPrinter accept one 2D int array object as
		 * parameter and print them all out in excel like row and column
		 * 
		 * get2DArray(2,3) --->> { {1,2,3},{1,2,3} }
		 * 
		 * 
		 */
		 
		int[][] twoDArrObj = { {2,3,7}  ,  {4,8,9}   }; 
		    
		    //System.out.println(  Arrays.deepToString(twoDArrObj)  );
		    
		    twoDPrinter( twoDArrObj ) ; //burada lopp ile disari cikartip yazdirmistik arraylari
		    
		    int row=6 , col=5 ; 
		    
		    int[][] tD = get2DArray(row, col); //bir multi dimentinal olusturup icinde kac element olacagini 
		    // kac array olacagini belirledik row ve col ile
		    
		    System.out.println( Arrays.deepToString(tD)  ); //arraylarimizi loop ile doldurmustuk, simdi yazdirdik
		    
		    System.out.println( Arrays.deepToString(get2DArray(4, 5))  );
		    
		    
		    
		    
		  }
		
		    
		 public static int[][] get2DArray(int row ,int col){
			    
			    int[][] twoDArr = new int[row][col];
			    
			    for (int i = 1; i <= row; i++) {       //dedik ki 1 den basla ve row a ne deger verdiysek o kadar array yaz
			      //System.out.println("row num : " + i);
			    	
			      for (int j = 1; j <= col; j++) {   //1 den basla ve col sayisina kadar her elementi yaz 
			    	  //ta ki array sayilari tamamlanana kadar
			    	  
			    	  
			        //System.out.print("col num : " + j + " | ");
			        twoDArr[i-1][j-1] = j ; // i-1 j-1 seklinde yazma sebebimiz loop'a 1 den baslamamiz
			      }
			      //System.out.println();
			    }    
			    return twoDArr; 
			  }
			  

			 
			  
			  
			  public static void twoDPrinter(int[][] twoD) {  
			    
			    //System.out.println(  Arrays.deepToString(twoD)  );
			    for( int[] eachArr : twoD ) {
			      
			      for ( int eachNum : eachArr) {
			        
			        System.out.print(eachNum + " ");
			      }
			      System.out.println();
			    }

			  }
			  
			  

			  // Task 2 : 
			  
			  /*
			   * create a method called twoDPrinter 
			   * accept one 2D int array object as parameter 
			   * and print them all out in excel like row and column 
			   * 
			   * int[][] twoDArrObj
			   * 
			   * 
			   
			     create a method called get2DArray
			     accept 2 int as parameters , row, col
			     return 2D array object in below logic : 
			       
			     get2DArray(2,3) --->> { {1,2,3},{1,2,3} }
			   
			   
			   * */
			  
			  

			}