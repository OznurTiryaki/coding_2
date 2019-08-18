package mentoring;

import java.util.*;

public class MapPractice1 {
	
	public static void main(String[] args) {
		
//		Map-general implementation HashMAp
//		SortedMap extends Map interface
//		NavigableMap extends SortedMap
//		TreeMap extends NavigableMap
		
		
		Map<String, Integer> scoreMap= new HashMap <> ();
		
	//put();
		
		scoreMap.put("Ahmet", 10);
		scoreMap.put("Mehmet", 20);
		scoreMap.put("Murat", 30);
		scoreMap.put("Mustafa", 40);
		scoreMap.put("Ali", 50);
		scoreMap.put("Murat", 60);
		
		
		
		System.out.println(scoreMap);  //{Ahmet=10, Mustafa=40, Mehmet=20, Murat=60, Ali=50}
		
		
	//	size();
		
		System.out.println(scoreMap.size()); //5
		
	//isEmpty();
		
		System.out.println(scoreMap.isEmpty()); //false
//		scoreMap.clear();
		System.out.println(scoreMap.isEmpty());  //true
		
	//get (objects); 
		
		System.out.println(scoreMap.get("Mehmet"));  //20
		System.out.println(scoreMap.get(20)); //null   --we need to write our key, not value -
		
		
	//containsKey(objects Key);
		
		System.out.println(scoreMap.containsKey("Mustafa")); //true
		System.out.println(scoreMap.containsKey(40));  //false  -- we need to pass key as parameter,
		//if we add value, it gives us false
		
	//containsValue(Object value);
		
		System.out.println(scoreMap.containsValue(40)); //true
		System.out.println(scoreMap.containsValue("Mustafa"));  //false --we need to pass value as parameter
		//if we add key, it gives us false
		
	
	//remove(Object key);
		
		System.out.println(scoreMap.remove("Ahmet")); //10
		System.out.println(scoreMap.remove("Semih")); //null
		System.out.println(scoreMap);  //{Mustafa=40, Mehmet=20, Murat=60, Ali=50}  --remove Ahmet and Ahmet's value
		
	// void putAll---lookslike AddAll(list, set,queue)
		
		Map<String, Integer> scoreMap2= new HashMap <> ();
		
		scoreMap2.put("Ayse", 70);
		scoreMap2.put("Fatma", 80);
		scoreMap2.put("Gul", 90);
		
		scoreMap2.putAll(scoreMap); //add all scoreMAp elements inside scoreMap2
		
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Murat=60, Gul=90, Ali=50}
	
		
	//putIfAbsent(K key, V value)--the key have to match exactly. it return us correct value
		//and if key doesn't match, it return null and add the key and value in our map
		
		System.out.println(scoreMap.putIfAbsent("Ali",80));  //50  
		
		System.out.println(scoreMap);
		
		System.out.println(scoreMap.putIfAbsent("Halil",90));  //null
		
		System.out.println(scoreMap); //{Mustafa=40, Halil=90, Mehmet=20, Murat=60, Ali=50}
		
		
	//getOrDefault(ObjectKey, V defaultvalue); 
		
		System.out.println(scoreMap2.get("Lale"));  //return null -not exist in our list
		
		System.out.println(scoreMap2.getOrDefault( "Lale", 100)); //it gives 100 -default value
		
		System.out.println(scoreMap2.getOrDefault( "Mehmet", 100)); //it gives 20-Mehmet's value 
	
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Murat=60, Gul=90, Ali=50}
		
	//boolean--> remove(Object key, Object Value)--	 key and value need to "match"
		
		System.out.println(scoreMap2.remove("Fatma",70));  //false
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Murat=60, Gul=90, Ali=50}
		
		System.out.println(scoreMap2.remove("Gul",90));  //true  --it is match 
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Murat=60, Ali=50}

		
		
	//	boolean--> replace(Key k,V Old Value, V new Value)
		//it need to match key and old value
		
		System.out.println(scoreMap2.replace("Fatma",80,15)); //true
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=15, Mehmet=20, Murat=60, Ali=50}
		
		System.out.println(scoreMap2.replace("Fatma",80,30));  //false 
		System.out.println(scoreMap2); //{Mustafa=40, Ayse=70, Fatma=15, Mehmet=20, Murat=60, Ali=50}

		
		
	}
 
}
