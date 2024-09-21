package org.zaidism.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(null);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(20);
		numbers.add(60);
		numbers.add(null);

		// list allows null and duplicate values
		System.out.println("Contains null: " + numbers.contains(null));
		// size
		System.out.println("Size of List is: " + numbers.size());

		// it maintains insertion order
		System.out.println("Intial List with same order as insertion: " + numbers);

		// index access
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("Element at " +i+" Index: " + numbers.get(i));
		}
		
		

	}

}
