package org.zaidism.functionalprogramming.stream;

import org.zaidism.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.zaidism.model.EmployeeProvider.getEmployeeList;
import static org.zaidism.model.EmployeeProvider.printEmployees;

public class MapMethod {
  public static void main(String[] args) {

    //increment salaries  of employee
    List<Employee> employees = getEmployeeList();

    List<Employee> employeesAfterSalaryIncrement = employees.stream()
            .map(emp -> new Employee(
                    emp.getId(),
                    emp.getName(),
                    emp.getBirthDate(),
                    emp.getSalary() * 2,
                    emp.getTechStack()
    )).toList();

    List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David");

    // Filter names starting with 'C', convert to uppercase, and collect to a list
    List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("C"))   // Intermediate Operation: Filter names
            .map(String::toUpperCase)               // Intermediate Operation: Convert to uppercase
            .sorted()                               // Intermediate Operation: Sort names
            .collect(Collectors.toList());


    //Streams in Java 8 are a powerful and flexible way to process sequences of
    // elements (like collections) in a functional style. They allow developers to
    // perform operations on data, such as filtering, mapping, and reducing, in a concise and readable manner. Streams are part of the java.util.stream package introduced in Java 8.
    printEmployees(employeesAfterSalaryIncrement, "Employees after salary increment");
  }
}
