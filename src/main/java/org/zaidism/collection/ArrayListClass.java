package org.zaidism.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List<Integer> first5EvenNumbers = new ArrayList<Integer>();
		first5EvenNumbers.add(2);
		first5EvenNumbers.add(4);
		first5EvenNumbers.add(6);
		first5EvenNumbers.add(8);
		first5EvenNumbers.add(10);
		System.out.println("First List: " + first5EvenNumbers);

		// creating array list from existing collection
		List<Integer> first10EvenNumbers = new ArrayList<Integer>(first5EvenNumbers);
		first10EvenNumbers.add(12);
		first10EvenNumbers.add(14);
		first10EvenNumbers.add(16);
		first10EvenNumbers.add(18);
		first10EvenNumbers.add(20);
		first10EvenNumbers.add(23);
		first10EvenNumbers.add(23);
		first10EvenNumbers.add(null);
		System.out.println("Final List: " + first10EvenNumbers);

		// iterating array list
		first10EvenNumbers.forEach(number -> {
			if (null != number && number % 2 == 0) {
				System.out.println("Even Numbers in List: " + number);
			}
			if (null != number && number % 2 != 0) {
				System.out.println("Odd Numbers in List: " + number);
			}

		});

		// get method
		int num = first10EvenNumbers.get(5);
		System.out.println("Element at index 5: " + num);

		// set method
		first10EvenNumbers.set(first10EvenNumbers.size() - 1, 30);
		System.out.println("After set method(): " + first10EvenNumbers);

		// remove by index
		first10EvenNumbers.remove(0);
		System.out.println("After remove method(): " + first10EvenNumbers);

		// remove by value
		first10EvenNumbers.remove(Integer.valueOf(4));
		System.out.println("After remove by passing value: " + first10EvenNumbers);

		// removing multiple values
		List<Integer> subList = new ArrayList<Integer>();
		subList.add(6);
		subList.add(8);
		subList.add(10);

		first10EvenNumbers.removeAll(subList);
		System.out.println("After remove all using sublist: " + first10EvenNumbers);

		first10EvenNumbers.clear();
		System.out.println("After clear(): " + first10EvenNumbers);

		// ways of iterating arrayList
		List<String> listColor = Arrays.asList("RED", "BLUE", "GREEN", "GREY", "BLACK");
		System.out.println("Colour List: " + listColor);
		// for each
		System.out.println("Iterating using forEach()");
		listColor.forEach(color -> {
			System.out.println(color);
		});
		// enhanced for loop
		System.out.println("Iterating using enhanced for loop");
		for (String color : listColor) {
			System.out.println(color);
		}
		// for loop
		System.out.println("Iterating using for loop");
		for (int i = 0; i < listColor.size(); i++) {
			System.out.println(listColor.get(i));
		}
	}

}
