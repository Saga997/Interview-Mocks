package org.zaidism.functionalprogramming.methodreference;

import org.zaidism.model.Employee;

import java.util.List;


public class MethodAndConstructorReference {

  static int multiplyByTwo(int n) {
    return n * 2;
  }

  static void print(String name) {
    System.out.print(name.toUpperCase() + " ");
  }

  public static void main(String[] args) {
    // example 1 method reference
    List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> afterMultiply =
        integers.stream().map(MethodAndConstructorReference::multiplyByTwo).toList();
    System.out.println(afterMultiply);

    // example 2 method reference
    List<String> name = List.of("Amina", "Zahid", "Rahul", "Manoj");
    name.forEach(MethodAndConstructorReference::print);

    // constructor reference
    name.stream().map(Employee::new).toList().forEach(System.out::println);
  }

  //Method references in Java are a shorthand notation of a lambda expression that refers to a method directly by its
  // name. Method references are part of the syntax introduced in Java 8, which makes the code more readable and
  // concise by avoiding boilerplate code commonly found in lambda expressions.

  //Reference to a Static Method
  //// Using lambda expression
  //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  //numbers.forEach(n -> System.out.println(n)); // Lambda expression
  //
  //// Using method reference
  //numbers.forEach(System.out::println); // Method reference to static method

  //Reference to an Instance Method of a Particular Object
//  String message = "Hello, World!";
//
//  // Using lambda expression
//  Runnable r1 = () -> System.out.println(message.toLowerCase());
//
//  // Using method reference
//  Runnable r2 = message::toLowerCase;

  //Improves Functional Programming: It enhances the use of functional programming in Java by making it easier to
  // pass around behavior without clutter.

}
