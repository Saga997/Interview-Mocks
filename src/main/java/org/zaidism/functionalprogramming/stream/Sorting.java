package org.zaidism.functionalprogramming.stream;

import org.zaidism.model.Employee;

import java.util.Comparator;
import java.util.List;

import static org.zaidism.model.EmployeeProvider.getEmployeeList;

public class Sorting {
  public static void main(String[] args) {
    List<Employee> employees = getEmployeeList();
    employees.stream().sorted((e1, e2) -> e1.getBirthDate().compareTo(e2.getBirthDate())).toList().forEach(System.out::println);

    List<Employee> employees1 = employees.stream().sorted().toList();
    employees1.forEach(e -> System.out.println(e));
    System.out.println("*************************************************");

    List<Employee> employees2 = employees.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println("*************************************************");

    employees2.forEach(System.out::println);
    System.out.println("*************************************************");

    // emp sorted based on their length of their name asc
    employees.stream().map(emp -> emp.getName()).sorted(Comparator.comparingInt(String::length).
            reversed()).toList().forEach(System.out::println);
    System.out.println("*************************************************");
    // emp sorted based on their length of their name desc
    employees.stream().map(emp -> emp.getName()).sorted(Comparator.comparingInt(String::length)).
            toList().forEach(System.out::println);

  }
}
