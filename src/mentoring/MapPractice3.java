package mentoring;

import java.util.*;

public class MapPractice3 {

	public static void main(String[] args) {
	
		/**
		 *  * 
		 *  		Map
		 *   			General Implementation	-- HashMap
		 *  	
		 *    		SortedMap     extends Map interface
		 *  	  NavigatableMap  extends SortedMap interface	
		 * 			 TreeMap      implements NavigatableMap
		 * 
		 * 
		 * methods  : 
		 * 
		 *  SortedMap<K,V> subMap(K fromKey, K toKey);
		 *  SortedMap<K,V> headMap(K toKey);
		 *  SortedMap<K,V> tailMap(K fromKey);
		 *  K firstKey();
		 *  K lastKey();
		 *  
		 */
		
		
		SortedMap<String,Integer> scoreMap = new TreeMap<>();  //subclass-treeMap extends SortedMap
		
		scoreMap.put("Ahmet", 10);
		scoreMap.put("Mehmet", 20);
		scoreMap.put("Murat", 30);
		scoreMap.put("Mustafa", 40);
		scoreMap.put("Ali", 50);
		scoreMap.put("Murat", 60); //--upload murat's value

		System.out.println(scoreMap);  //{Ahmet=10, Ali=50, Mehmet=20, Murat=60, Mustafa=40}
		//sorted all keys not values
		
		
	// K firstKey();  --gives first elements from sortedMap
		
		System.out.println(scoreMap.firstKey());	//Ahmet
	
	// K lastKey(); --gives last elements from sortedMap
		
		System.out.println(scoreMap.lastKey());  //Mustafa
		
	//subMap(K fromKey, K to Key)--looks like substring methods  
		//last elements exclusive
		//subMap linked with original map
		//if we upload any keys or values, its effect our original map too
		
		System.out.println(scoreMap.subMap("Ali", "Murat"));  //{Ali=50, Mehmet=20}
		
	//	System.out.println(scoreMap.subMap("Semih", "Murat"));  //IllegalArgumentException: starting points not exist in Map
		
		System.out.println(scoreMap.subMap("Mustafa","Semih"));  //{Mustafa=40}  //last key not important
		//it doesnt give any exception
		
		System.out.println(scoreMap);  //{Ahmet=10, Ali=50, Mehmet=20, Murat=60, Mustafa=40}
	
		//headMap(from beginning to that key) --our key is exclusive
		
		System.out.println(scoreMap.headMap("Mehmet")); //{Ahmet=10, Ali=50}
		
		//invalid key-it print from beginning to end of the our map
		
		System.out.println(scoreMap.headMap("Semih"));  //{Ahmet=10, Ali=50, Mehmet=20, Murat=60, Mustafa=40}
		
		//tailMap(from element to end of the Map) beginning point always inclusive
		
		System.out.println(scoreMap.tailMap("Mehmet")); //{Mehmet=20, Murat=60, Mustafa=40}
		
		System.out.println(scoreMap.tailMap("Semih"));  //{} 
		
		
		//replace(); --Updating value
		
		SortedMap<String,Integer> subMap = scoreMap.tailMap("Mehmet"); 
		
		System.out.println(subMap); //{Mehmet=20, Murat=60, Mustafa=40}
		
		subMap.replace("Murat",500);
		
		System.out.println(subMap); //{Mehmet=20, Murat=500, Mustafa=40}  --upload Murat's value
		
		System.out.println(scoreMap); //{Ahmet=10, Ali=50, Mehmet=20, Murat=500, Mustafa=40}  
		//--upload Murat's value in original Map
		//linked together
		
		
		SortedMap<String,Integer> independentSubMap =new TreeMap<>(scoreMap.tailMap("Ali")); 
		//--it start from ALi and goes end of the Map 
		//when we use new Keyword, it create independent subMAp under the original Map
		//when we upload the subMap's values, it doesn't affect the original map's values
		
		System.out.println(independentSubMap); //{Ali=50, Mehmet=20, Murat=500, Mustafa=40}
		
		independentSubMap.replace("Ali",15); 
		
		System.out.println(independentSubMap); //{Ali=15, Mehmet=20, Murat=500, Mustafa=40}--uploaded version
		
		System.out.println(scoreMap); //{Ahmet=10, Ali=50, Mehmet=20, Murat=500, Mustafa=40}--original map, didnt upload the 
		//Ali's value

	}

}
