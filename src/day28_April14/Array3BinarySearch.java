package day28_April14;

import java.util.Arrays;

public class Array3BinarySearch {

	public static void main(String[] args) {
		

		int[] nums =  {11,20,4,6,54,19,5} ; 
	    
	    Arrays.sort(nums);
	    System.out.println( Arrays.toString(nums) );
	    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
	    
	    int index = Arrays.binarySearch(nums, 5) ;
	    System.out.println(index);
	    
	    
	   //if we have a same number two, it give us first one or last one we don't know which one. 
	    //it is not bug, just work like that   
	    
	    
	    //if we dont have any item in our array, it take like a sorted put a place like sorted order but mines number 
	 
	    
	 // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
	    
	    int index1 = Arrays.binarySearch(nums, 5) ;
	    System.out.println(index);
	    
	    int idx20 = Arrays.binarySearch(nums, 20) ;
	    System.out.println(idx20);
	    
	    
	// IF WE DONT HAVE ITEM IN THE ARRAY
	// WE WILL GET MINUS NUMBERS TO POINT THE INSERTION POINT OF ERROR
	// TO KEEP THIS ARRAY SORTED
	    
	    int [] arr =  {3,5,7,9};
	    
	    Arrays.sort(arr);
	  
	    
	    int indexarr = Arrays.binarySearch(arr, 6) ; //mesela 6 rakamimiz yok, 
	                                                  //olsaydi 3.siraya gelecekti, indexe bakma sifirdan baslama saymaya
	     System.out.println(indexarr);   //   bu yuzden -3 verdi .
	     
	     // IF WE DONT HAVE THE ITEM IN THE ARRAY 
	     // We will get minues number to point the insertion point of the array 
	     // to keep this array sorted 
	     
	     //  {4, 5, 6, 11, 19, 20, 54} ; 
	     ////////////////////////////////  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
	     //  {4, 5, 6, 11, 19, 20, 54 , 100} ; 
	     
	     int idx10 = Arrays.binarySearch(nums, 10) ;
	     System.out.println(idx10);
	     
	     int idx100 = Arrays.binarySearch(nums, 100) ;
	     System.out.println(idx100);
	     
	     
	     
	     
	     
	     //fill method, you can choose just one to fill inside array for example 5
	     //you cannot fill multi number
	     
	     
	     int[] nums100 = new int[10] ; 
	      
	   nums100[0]=3;
	   nums100 [1]=6;
	     Arrays.fill(nums100, 5);
	     System.out.println(Arrays.toString(nums100));
	     
	   //  {4, 5, 6, 11, 19, 20, 54} ; 
	     
	   //  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
	     
	     
	     
	     
	     
	     
	     

	}

}
