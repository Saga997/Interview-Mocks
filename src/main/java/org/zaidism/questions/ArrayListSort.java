package org.zaidism.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Employee class to demonstrate custom object sorting
class Employee {
	private int id;
	private int age;
	private String name;
	private Long salary;

	public Employee() {
		super();
	}

	public Employee(int id, int age, String name, Long salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}

class CustomSort implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		// for ascending order
		// return (int) (e1.getSalary() - e2.getSalary());
		return e1.getSalary().compareTo(e2.getSalary());

		// for decending order
		// return (int) (e2.getSalary() - e1.getSalary());
		// return e2.getSalary().compareTo(e1.getSalary());

	}

}

public class ArrayListSort {

	public static void main(String args[]) {

		// primitive type sorting
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		numbers.add(333);
		numbers.add(98);
		numbers.add(13);
		numbers.add(12);

		// ascending order
		Collections.sort(numbers);
		System.out.println("In ascending order " + numbers);

		// descending order
		Collections.reverse(numbers);
		System.out.println("In descending order " + numbers);

		// custom object sorting
		List<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee(1, 23, "Jahid", 33000L));
		employee.add(new Employee(55, 25, "Harish", 43000L));
		employee.add(new Employee(12, 22, "Shankar", 13000L));
		employee.add(new Employee(19, 28, "Ajay", 10000L));
		employee.add(new Employee(21, 32, "Raj", 120000L));

		// will sort the employee based on salary by ascending order
		Collections.sort(employee, new CustomSort());
		System.out.println("------Using comparator sorting custom object based on salary--------");
		employee.forEach((e) -> System.out.println(e));

		// using lambda expression while using this no need of using CustomSort class
		Collections.sort(employee, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
		System.out.println("-----Using Lambda and comparator sorting custom object based on Name-------");
		employee.forEach((e) -> System.out.println(e));

	}

}
