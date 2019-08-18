package day34_April27;

import java.util.Arrays;

public class Method2ArrayMethod {

	public static void main(String[] args) {
		//create a static method called getArrayFrom1toX
		//it take one parameter
		//and return array starting from 1 to the number specified
		//getArrayFrom1toX (5)....{1,2,3,4,5}

		int [] arr= getArrayFrom1toX (5);
		System.out.println(Arrays.toString(arr));
		//Or
		System.out.println(Arrays.toString(getArrayFrom1toX (5)));
		
	}
    public static int [] getArrayFrom1toX (int x) {
    
    	
    	int [] arr = new int  [x];
    	
    	for (int i = 0; i < arr.length; i++) {
			
    		arr[i] = i+1;
    		
		}
    	
			return arr;
	 
    }
    
  
    }

