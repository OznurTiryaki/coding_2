package mentoring;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice2 {
	
	public static void main(String[] args) {
		
	
	Map<String,Integer> scoreMap = new HashMap<>();  //poly
	
	scoreMap.put("Ahmet", 10);
	scoreMap.put("Mehmet", 20);
	scoreMap.put("Murat", 30);
	scoreMap.put("Mustafa", 40);
	scoreMap.put("Ali", 50);
	scoreMap.put("Murat", 60);
	
	System.out.println(scoreMap); //{Ahmet=10, Mustafa=40, Mehmet=20, Murat=60, Ali=50}
	
	
	//Map is not iterable, so to get value and key we need someting iterable like set and collection
	
	//Set<K>keySet();
	
	Set<String>keys=scoreMap.keySet(); //I try to get all keys--
	System.out.println(keys);  //[Ahmet, Mustafa, Mehmet, Murat, Ali] 
	
	//When we try to upload our key it directly affect Map(linked with Map)
	
	keys.remove("Ahmet");
	System.out.println(scoreMap);  //{Mustafa=40, Mehmet=20, Murat=60, Ali=50}
	
	//Collection <V> values();
	
	Collection<Integer> value= scoreMap.values();
	System.out.println(value); //[40, 20, 60, 50]
	
	value.remove(40); //it removes key and values-- it removes Mustafa from our Map
	System.out.println(scoreMap); //{Mehmet=20, Murat=60, Ali=50} 
	
	//Set<Map.Entry<K, V>> entrySet();
	
			// Map is not an Iterable so we can not iterate over them 
			// However we can get entrySet view out of the map 
			// and it will store the keyValue pair as single Entry 
			// and store it into the Set of Entry<KeyType, ValueType>
	
	
	// Entry has 3 useful method to get the information in the map
			
	
	Set< Entry<String, Integer>> entries=scoreMap.entrySet();
	
	System.out.println(entries);//[Mehmet=20, Murat=60, Ali=50]
	
	
	for (Entry<String,Integer> entry : entries) {  
		
	// getKey() -->> return the key of the entry 
	
	System.out.println(entry.getKey());  //Mehmet--Murat--Ali
	
	// getValue() -->> return the value of the entry
	
	if(entry.getValue()<25) {
		entry.setValue(100);  // setValue() -->> change the value of the entry
	
	}
	System.out.println(entry.getValue()); //100 --60--50
	}
	
	System.out.println(scoreMap);  //{Mehmet=100, Murat=60, Ali=50}
}

}
