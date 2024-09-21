package org.zaidism.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	static void print(LinkedList<String> fruits) {
		// iterating LinkedList
		fruits.forEach(f -> System.out.println(f));
	}

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();

		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Pomogranate");
		fruits.add("Papaya");
		fruits.add("Kiwi");

		fruits.add("Papaya");
		fruits.add(null);
		System.out.println("----Intial List--------");
		print(fruits);

		// adding the end of LInkedList
		fruits.addLast("Watermelon");
		System.out.println("----After adding the end--------");
		print(fruits);

		// adding the start of LinkedList 
		fruits.addFirst("Straberry");
		System.out.println("----After adding the start--------");
		print(fruits);

		// Retrieval of elements from LinkedList
		String fruit;
		// From specific index
		fruit = fruits.get(5);
		System.out.println("------Fifth elemenet in Linked List-------- " + fruit);

		// From specific index
		fruit = fruits.getFirst();
		System.out.println("------First elemenet in Linked List-------- " + fruit);

		fruit = fruits.getLast();
		System.out.println("------Last elemenet in Linked List-------- " + fruit);

		// iterating LinkedList
		print(fruits);

		// removing from LinkedList

		// remove by value
		fruits.remove("Papaya");
		fruits.remove(null);
		System.out.println("---------After removing papaya and null-------");
		print(fruits);

		// remove by index
		fruits.remove(3);
		System.out.println("---------After removing 3rd element-------");
		print(fruits);

		// remove from first
		fruits.removeFirst();
		System.out.println("---------After removing first element-------");
		print(fruits);

		// remove from last
		fruits.removeLast();
		System.out.println("---------After removing Last element-------");
		print(fruits);

		System.out.println("---------After removing Last element-------");
		print(fruits);

		// sort
		Collections.sort(fruits);
		System.out.println("****After sort****");
		print(fruits);

		// searching in LinkedList
		fruits.add(0, "Pomogranate");
		fruits.add(2, "Grapes");
		System.out.println("List after adding elements" + fruits);
		System.out.println("Index of Pomogranate: " + fruits.indexOf("Pomogranate"));
		System.out.println("Last Index of Pomogranate: " + fruits.lastIndexOf("Pomogranate"));

		// clear
		fruits.clear();

	}

}
