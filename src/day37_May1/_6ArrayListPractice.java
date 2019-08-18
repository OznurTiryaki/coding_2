package day37_May1;

import java.util.*;

public class _6ArrayListPractice {

	public static void main(String[] args) {
		
		/*Task create ArrayList of double
		 * call it priceList
		 * Add 5 prices
		 * try to get 3rd items
		 * iterate over arrayList using both loops
		 * and print it out
		 * 
		 */
		
		ArrayList <Double> priceList = new ArrayList <> () ;
		
		priceList.add(12.5);
		priceList.add(3.7);
		priceList.add(1.2);	
		priceList.add(67.5);
		priceList.add(4.4);
		
		for (int i = 0; i < priceList.size(); i++) {
			
			System.out.print(priceList.get(i)+ " ");
		}
		System.out.println();
		
		for(double each : priceList) {
			
			if(each >10.0) {
			
				System.out.print(each+ " ");
		}
			
		}
		double sum=0;
		for(double each : priceList) {
		sum +=each;
		System.out.println(sum);
	}
	}
}
