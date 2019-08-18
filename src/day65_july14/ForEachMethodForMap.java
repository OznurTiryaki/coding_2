package day65_july14;

import java.util.HashMap;
import java.util.Map;

public class ForEachMethodForMap {

	public static void main(String[] args) {
		
		
		Map<String, Double> priceMap = new HashMap<>();
		
		priceMap.put("Cucumber", 4.12);
		priceMap.put("Potato", 3.02);
		priceMap.put("Celery", 1.2);
		priceMap.put("Corn", 0.99);
		priceMap.put("Tomato", 3.99);

		
		System.out.println(priceMap);
		
		
		//enter your element and value inside
		priceMap.forEach( (myKey,myValue) ->System.out.println("key is " + myKey + " | value is " +  myValue ) ) ;
		
		

	}

}