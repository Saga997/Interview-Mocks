package org.zaidism.practice.dsa.string;

public class StringIntern {
  public static void main(String[] args) {
    String name1 = "Jahid";
    String name2 = new String("Jahid");

    name2 = name2.intern();

    System.out.println(name1.equals(name2));
    System.out.println(name1 == name2);
  }
}

//The intern() method in Java is used to manage memory by optimizing the storage of String objects.
// Specifically, it ensures that there is only one copy of each distinct string value in memory,
// stored in a pool called the string constant pool. This allows for memory savings when there are
// multiple strings with the same content.
