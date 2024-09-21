package org.zaidism.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {

		// HashMap
		Map<String, Integer> numberMapping = new HashMap<>();
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put("Six", 6);
		numberMapping.put("Seven", 7);
		numberMapping.put("Eight", 8);
		numberMapping.put("Nine", 9);
		numberMapping.put("Ten", 10);

		// unordered collection
		System.out.println("Unorered Example: " + numberMapping);

		// only one nulll key is allowed
		numberMapping.put(null, 11);
		System.out.println("after addding null key: " + numberMapping);

		// more than one null key replace existing KV pair
		numberMapping.put(null, 12);
		System.out.println("after addding more than one null key: " + numberMapping);

		// some methods
		System.out.println("Map is empty: " + numberMapping.isEmpty());
		System.out.println("Size of Map : " + numberMapping.size());

		// check key Exist in HashMap
		if (numberMapping.containsKey("Ten"))
			System.out.println("Key Exist.");
		else
			System.out.println("Key Doesn't Exist.");

		// check value Exist in HashMap
		if (numberMapping.containsValue(10))
			System.out.println("Value Exist.");
		else
			System.out.println("Value Doesn't Exist.");

		// get value by key
		Integer value = numberMapping.get("One");
		System.out.println("Value using get();" + value);

		// removing KV pair

		numberMapping.remove("One");
		System.out.println(numberMapping);

		// get all the keys of map
		Set<String> keys = numberMapping.keySet();
		System.out.println("Keys of Map:" + keys);

		// get all the values of map
		Collection<Integer> number = numberMapping.values();
		System.out.println("Values of Map: " + number);

		// iterating over hashmap
		System.out.println("-------Iterating over HashMap using enchnaced for----------");
		for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
			System.out.println("Key->" + entry.getKey() + " && " + "Values->" + entry.getValue());
		}
		
		System.out.println("-------Iterating over HashMap using forEach()----------");
		numberMapping.forEach((K, V) -> {
			System.out.println("Key: " + K);
			System.out.println("Value: " + V);
		});

	}
}
