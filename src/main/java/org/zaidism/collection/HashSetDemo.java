package org.zaidism.collection;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> colors = new HashSet<String>();

		colors.add("Green");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Pink");

		colors.add(null);
		System.out.println(colors);

		// duplicates are not allowed
		System.out.println("-------without duplicates--------------");
		colors.forEach(e -> System.out.println(e));

		// can allow null value
		System.out.println("------can allow more than one null value-------------");
		colors.add(null);
		colors.forEach(e -> System.out.println(e));

		// cannot allow more than one null value
		colors.add(null);
		System.out.println("-------cannot allow more than one null value----------");
		colors.forEach(e -> System.out.println(e));

		// order is not preserverd i.e. Set is unordered collection
		System.out.println("order is not preserved: " + colors);

		List<String> colorsList = new ArrayList<String>();
		colorsList.add("Purple");
		colorsList.add("Purple");
		colorsList.add("Magenta Pink");
		colorsList.add("Cyan");
		colorsList.add("Burgundy");
		colorsList.add("Grey");
		colorsList.add("Grey");
		System.out.println("get(0) of list: " + colorsList.get(0));

		colors.addAll(colorsList);
		System.out.println("After adding ArrayList: " + colors);

		Set<String> programmingLanguages = new LinkedHashSet<String>();

		programmingLanguages.add("Java");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C");
		programmingLanguages.add("C#");
		programmingLanguages.add("C++");
		System.out.println(
				"LinkedHasSet maintains the insertion order as it is an ordered collection : " + programmingLanguages);

		// remove
		programmingLanguages.remove("Java");
		programmingLanguages.remove("JavaScript");
		System.out.println("after removal: " + programmingLanguages);

		// removeif
		colors.removeIf(e -> e == null);
		System.out.println("after rmeoving null from color set: " + colors);

		// treeset doesn't allow null values
		TreeSet<String> colorSorted = new TreeSet<String>(colors);
		colorSorted.addAll(colors);
		System.out.println("After sorting in treeset: " + colorSorted);

	}

}
