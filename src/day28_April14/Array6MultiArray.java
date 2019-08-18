package day28_April14;

import java.util.Arrays;

public class Array6MultiArray {

	public static void main(String[] args) {
		

		int[] nums1 = new int[] {1,3,5} ; 
	    int[] nums2 = new int[] {1,13} ; 
	    
	    // 2 dimesional array is an array object that store 
	    // 1 dimensional array in each slot 
	    
	    int[][] numsOfnums = new int[2][] ;
	    // length method on an array will always return first dimension length
	 //   System.out.println( numsOfnums.length ); // sadece iki array oldugunu soyluyor
	    
	    numsOfnums[0] = nums1 ; 
	    numsOfnums[1] = nums2 ; 
	    
	    System.out.println( numsOfnums[0].length);  //boylece her array icindeki arrayin kac int oldugunu buluyoruz
	    System.out.println(numsOfnums[1].length); //multi icindeki 2. arrayi sectik ve onun icinde kac int oldugunu kontrol ettik.
	    
	    for (int i = 0; i < numsOfnums.length; i++) {
	      
	    //  System.out.println( Arrays.toString(numsOfnums[i])  );
	   //   System.out.println( numsOfnums[i].length  ); ///icindeki her bir arrayin kac int var onu kontrol ediyoruz.
	      
	    }
	    
	    
	    
	    

	  }

	}
