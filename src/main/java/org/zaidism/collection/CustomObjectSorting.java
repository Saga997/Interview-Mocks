package org.zaidism.collection;

import java.util.Collections;
import java.util.LinkedList;

class Student {

	private int rno;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}

}

public class CustomObjectSorting {

	static void print(LinkedList<Student> student) {
		student.forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {

		LinkedList<Student> students = new LinkedList<Student>();
		students.add(new Student(12, "Jahid"));
		students.add(new Student(112, "Anish"));
		students.add(new Student(212, "Tanvi"));
		students.add(new Student(72, "Chandru"));
		students.add(new Student(312, "Raj"));

		Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("****Students Sorted by Name in ascending order****");
		print(students);

		Collections.sort(students, (s1, s2) -> s1.getRno() - (s2.getRno()));
		System.out.println("****Students Sorted by Roll Number in ascending order****");
		print(students);

		Collections.sort(students, (s1, s2) -> s2.getName().compareTo(s1.getName()));
		System.out.println("****Students Sorted by Name in decending order****");
		print(students);

		Collections.sort(students, (s1, s2) -> s2.getRno() - (s1.getRno()));
		System.out.println("****Students Sorted by Roll Number in decending order****");
		print(students);

	}

}
