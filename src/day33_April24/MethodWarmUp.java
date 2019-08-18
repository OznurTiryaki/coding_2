package day33_April24;

import java.util.Arrays;

public class MethodWarmUp {

	public static void main(String[] args) {
		/*
		 * Warmup 1.1
		 * 
		 * Create a static method getSum accept 1 parameter as int array and return the
		 * sum of the all the items in array
		 * 
		 * another method called addAll accept 1 parameter as String array and return
		 * the concatenation of all items
		 * 
		 * another method called getMax accept 1 parameter as int array and return the
		 * max from the all the items in array
		 * 
		 * Optional : create a method that take one String parameter as sentence return
		 * first character for first word and all characters of last word except first
		 * char example : Love Java --> Lava Hold the door --? Hdoor
		 * 
		 */

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(getSum(arr));

		String[] names = { "Emine", "Firdevers", "Sharif", "Bahadir", "Mehmet" };
		System.out.println(addAll(names));

		int[] nums = { 9, 5, 7, 11, 4 };
		System.out.println(getMax(nums));

		String name = "Hold the door"; // --? Hdoor
		System.out.println(atAll(name));
		
		String name2= "Love Java";
		System.out.println(atAll(name2));
		
		String name3= "Java";
		System.out.println(atAll(name3));
		
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		return sum;
	}

	public static String addAll(String[] words) {
		String add = "";
		for (int i = 0; i < words.length; i++) {
			add += words[i];
		}
		return add;
	}

	public static int getMax(int[] nums) {

		Arrays.sort(nums);
		int max = nums[nums.length - 1];

		return max;
	}

	public static String atAll(String str) {
		
		if (str.contains(" ")) {
		String first = str.substring(0, 1);
      
		int space = str.lastIndexOf(" ");
		String newStr = first + str.substring(space + 1, str.length());

		return newStr;
		

	}else {
		return str;
	}
	}
}
