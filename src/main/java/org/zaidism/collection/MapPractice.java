package org.zaidism.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapPractice {

	public static void main(String[] args) {
		// practice example

		Map<String, Integer> students = new HashMap<String, Integer>();

		students.put("ZAHID", 33);
		students.put("ROHAN", 43);
		students.put("TANVI", 23);
		students.put("CHANDRU", 45);
		students.put("RAJ", 98);
		students.put("MAYANK", 11);

		System.out.println(students);
		
		String name;
		try (Scanner me = new Scanner(System.in)) {
			System.out.println("Enter you name to get your Age: ");
			name = me.next();
		}
		for (Entry<String, Integer> student : students.entrySet()) {
			if (name.equalsIgnoreCase(student.getKey())) {
				System.out.println("Your age is " + student.getValue());
				break;
			}
		}

	}

}
