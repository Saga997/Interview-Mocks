package org.zaidism.collection;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class StudentUserDefinedForMap {

	public static void main(String args[]) {

		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, new Person("Tony", 25));
		personMap.put(2, new Person("Jahid", 23));
		personMap.put(3, new Person("Rahul", 24));
		personMap.put(4, new Person("Meena", 22));
		personMap.put(5, new Person("Rajesh", 28));
		personMap.put(6, new Person("Rohan", 21));

		System.out.println(personMap);

		personMap.forEach((K, V) -> {
			System.out.print(K + " -> ");
			System.out.println(V);
		});

		
	}
}
