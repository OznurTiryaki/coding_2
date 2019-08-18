package day38_May5;

import java.util.*;

public class _6ArrayListTask {

	public static void main(String[] args) {

		 /*
	     * TASK 1 : 
	     * Create an ArrayList of integer from 1-100
	     * 
	     * get the sum of the each items 
	     * get the average
	     * 
	     * Create another list that contain items from 100- 1 
	     * get the count of numbers divisible by 3 and 5 
	     * 
	     * OPTIONAL 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * Update every odd items to 0 ; 
	     * 
	     * */
		

		ArrayList<Integer> nums = new ArrayList<>();
		int sum = 0;
		int avarage = 0;
		for (int i = 0; i <= 100; i++) {
			nums.add(i);
			sum += nums.get(i);
			avarage = sum / nums.size();
		}
		System.out.println(nums);
		System.out.println(sum);
		System.out.println(avarage);
		
		System.out.println("***********************************");
		
		ArrayList<Integer> nums2 = new ArrayList<>();

		for (int j = 100; j >= 0; j--) {
			if (j % 3 == 0 && j % 5 == 0) {
				nums2.add(j);

			}

		}
		System.out.println(nums2);
		
		
		
		System.out.println("***********************************");
		
		
		// optional part how we can combine two ArrayList
		// the logic is pick each and every item in lst2 and add it to list 1
		
		for (int i = 0; i < nums2.size(); i++) {
			//System.out.println( nums2.get(i) );
			Integer eachIn2 =nums2.get(i);
			nums.add(eachIn2);  //2 nin tum oglerini tek tek 1 e ekledi.
			
		}
		System.out.println(nums);   
		
		//or we can use the method add all 
		// addAll method of ArrayList class , second overloaded version
		// this will just insert every item in lst2
		// to the specified index 
		
		nums.addAll(1,nums2) ;   //eger basta index yazmazsan en sona ekler. mesela 1 dedik 1. indexden baslayarak ekliyor.
		System.out.println( nums );   
		System.out.println( nums2 );  // bu arada nums 2 degismedi still same
		
		
		
		//take odd number from list
		
		ArrayList<Integer> nums3 = new ArrayList<>();
				for (int i = 0; i <= 100; i++) {
					if(i%2==1) {
					nums3.add(i);
				
					}
				}
				System.out.println(nums3);
	}
}
