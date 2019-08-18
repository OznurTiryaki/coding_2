package day36_April30;

import java.util.*;

public class _4ArrayListWithType {

	public static void main(String[] args) {
		
		// NO PRIMITIVE TYPES ALLOWED AS TYPE 
		
		//ArrayList only all store object 
		
				// ArrayList<int> numList ; THIS IS BAD 
				
				// arraylist that store only Integer
				
		ArrayList<Integer> numList = new ArrayList<>();     
				
		//numList.add("ABC");   it just accept integer now.
				
				Integer i = 100 ; // autoboxing to Integer Object 
				
				// ADDING ITEM 
				// WE call add method from Arraylist class 
						
				numList.add(i); 
				numList.add(200) ; //we add 200 behind sees , it takes 200 to newInteges auto-boxing
				numList.add(300) ; 
				 
				//GETTING SINGLE ITEM FROM ARRAYLIST 
				// we call get(index) of ArrayList
				Integer i1 = numList.get(0); 
				int i2    =  numList.get(1);  // auto unboxing happen here
				
				System.out.println( i1 );
				System.out.println( i2 );
				System.out.println( numList.get(2) ); //it is a method to get int value
				
				
				// we can directly printing to see what's inside 
				System.out.println( numList  );
				
				

			}

		}