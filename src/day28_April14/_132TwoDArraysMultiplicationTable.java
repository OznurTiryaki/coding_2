package day28_April14;

import java.util.Arrays;

public class _132TwoDArraysMultiplicationTable {

	public static void main(String[] args) {
		
//		Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], 
//		with two pairs of square brackets. The elements of a 2D array are arranged in rows and columns,
//		and the new operator for 2D arrays specifies both the number of rows and the number of columns.
//
//		You have  2D array multiplicationTable declared with 10 rows and 10 columns.
//		Write java program to populate the array with multiplication table values like in the picture below:

		
		
		 int [][] multiplicationTable = new int[10][10];
		    
		    //TODO: type your code below
		    
		    for (int i = 0; i < multiplicationTable.length; i++) {  //ilk bize row'u bulacak 10 kere dondurup/kac array var
				
		    	
		    	for (int j = 0; j <multiplicationTable.length; j++) {  // her bir arrayin icine girecek 10 kere
		               
				multiplicationTable[i][j]=(i+1)*(j+1);  //sifirdan baslatmazsam 10 kere donmez
				                                        //ama sifir ile carpamam 1 ekleyip devam etmem lazim
				System.out.print(multiplicationTable[i][j]+ " ");
				}
		    	System.out.println();
		    	
			}
		    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		 
		 
		 
		 
		 
		    //Do not modify below line it will be used to test your code. And 
		    //Can be used by you while developing your code
		   
		    
		  }
		}
	
