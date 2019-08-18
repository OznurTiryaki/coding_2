package day27_April13;

public class Array4ForEachLoop {

	public static void main(String[] args) {
		

		int [] nums = {1,33,567,11,22};
		
		for (int i= 0 ; i < nums.length ; i++) {
			
			int eachItem= nums[i];
			
			System.out.println(eachItem);
		}

		for (int eachItem :nums) {
			System.out.println(eachItem);
		}
		
		
		String [] names =  { "Oznur", "Murat", "Lokum"};
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
