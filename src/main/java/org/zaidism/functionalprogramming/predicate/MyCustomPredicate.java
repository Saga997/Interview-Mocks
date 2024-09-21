package org.zaidism.functionalprogramming.predicate;

import java.util.function.Predicate;

public class MyCustomPredicate implements Predicate<String> {
//  @Override
//  public  boolean test(String name) {
//    return name.length() <= 10;
//  }
//
//  public static void main(String[] args) {
//    System.out.println(new MyCustomPredicate().test("Jahid"));
//    System.out.println(new MyCustomPredicate().test("Chinna Swami Muttu Swami VenGopal Ayyer"));
//
//  }


  @Override
  public boolean test(String name)
  { return name.length() <= 8; }

  public static void main(String[] args)
  {
    System.out.println(new MyCustomPredicate().test("Sagarika"));
    System.out.println(new MyCustomPredicate().test("Chinna Muttu Swami VenGopal Ayyer"));
  }
}