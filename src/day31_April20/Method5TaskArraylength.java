package day31_April20;

import java.util.Arrays;

public class Method5TaskArraylength {

	public static void main(String[] args) {

		  // create a static void method called reportBiggerArray
		  // it will take 2 parameters and both of them have type of int arrays
		  // inside body : it will compare the items count of 2 arrays
		  // and print out array with bigger size
		  // for example : given first array is {1,2,3} second array is {1,2,3,5}
		  // --> second array is bigger and print [1,2,3,5]

		
		int [] nums1 = {1,2,3};
		int [] nums2 =  {1,2,3,5};
		reportBiggerArray ( nums1, nums2);
	}
 
	public static void reportBiggerArray (int [] arr1, int [] arr2) {
	     
		
		if (arr1.length >arr2.length) {
			System.out.println("the bigger array is first: " +Arrays.toString(arr1));
		}else if (arr2.length >arr1.length) {
			System.out.println("the bigger array is second : " +Arrays.toString(arr2));
		}else {
			System.out.println("Their size are equal");
	}
}
}