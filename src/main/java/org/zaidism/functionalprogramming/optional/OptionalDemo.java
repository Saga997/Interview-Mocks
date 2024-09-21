package org.zaidism.functionalprogramming.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    // Scenario 1: Null pointer
    String nameFromDB;
    Optional<String> nameFromDBWithOptional;
    nameFromDB = getNameFromDB();

    // Uncommenting the line below would result in a null pointer exception
    // System.out.println(nameFromDB.toUpperCase());

    // Scenario 2: Handling Null pointer exception if no value present - Way 1
    nameFromDBWithOptional = getNameFromDBWithOptionalOfNullable();
    if (nameFromDBWithOptional.isPresent())
      System.out.println(nameFromDBWithOptional.get().toUpperCase());

    // Scenario 3: Handling Null pointer exception if no value present - Way 2
    nameFromDBWithOptional = getNameFromDBWithOptionalOfNullable();
    nameFromDBWithOptional.ifPresent(name -> System.out.println(name.toUpperCase()));

    // Scenario 4: Providing a default name if the name is not present - Way 1
    nameFromDBWithOptional = getNameFromDBWithOptionalOfNullableWithOrElse();
    String defaultName1 = nameFromDBWithOptional.orElse("default name");
    System.out.println("Output from orElse method: " + defaultName1.toUpperCase());

    // Scenario 5: Providing a default name if the name is not present - Way 2
    nameFromDBWithOptional = getNameFromDBWithOptionalOfNullableWithOrElse();
    String defaultName2 = nameFromDBWithOptional.orElseGet(() -> "default name from or else get");
    System.out.println("Output from orElseGet method: " + defaultName2.toUpperCase());

    // Scenario 6: Providing a default name if the name is not present - Way 3
    nameFromDBWithOptional = getNameFromDBWithOptionalOfNullableWithOrElse();
    String defaultName3 = nameFromDBWithOptional.orElseThrow(() -> new NoSuchElementException());
    System.out.println("Output from orElseThrow method: " + defaultName3.toUpperCase());

    // Scenario 7: Mapping the value inside optional
    nameFromDBWithOptional = getNameFromDBWithOptionalOf();
    Optional<String> optionalOfString = nameFromDBWithOptional.map(name -> name.toLowerCase());
    optionalOfString.ifPresent(System.out::println);
  }

  // Method to simulate fetching name from database (returns null)
  private static String getNameFromDB() {
    return null;
  }

  // Method to fetch name from database using Optional.of
  private static Optional<String> getNameFromDBWithOptionalOf() {
    String nameFromDB = "jahid"; // try with an actual value as well as with null
    return Optional.of(nameFromDB); // null pointer exception if nameFromDB is null
  }

  // Method to fetch name from database using Optional.ofNullable
  private static Optional<String> getNameFromDBWithOptionalOfNullable() {
    String nameFromDB = null; // try with an actual value as well as with null
    return Optional.ofNullable(nameFromDB);
  }

  // Method to fetch name from database using Optional.ofNullable with orElse
  private static Optional<String> getNameFromDBWithOptionalOfNullableWithOrElse() {
    String nameFromDB = "jahid"; // try with an actual value as well as with null
    return Optional.ofNullable(nameFromDB); // you can return Optional.empty() also to return value
  }

  /*Optional is a container object used to represent the presence or absence of a value. Optional.of() and
Optional.ofNullable() are methods used to create Optional instances, but they handle null values differently.

Optional.of() is used to create an Optional instance with a non-null value. It is meant to be used when you are
sure that the value being wrapped is not null.

Optional.ofNullable() creates an Optional instance that can hold either a non-null value or be empty if the value is
null. when the value might be null, and you want to safely create an Optional without risking a NullPointerException.
Return type on NULL value : Optional.empty()

try {
            String nonNullValue = "OpenAI";
            Optional<String> optional1 = Optional.of(nonNullValue);
            System.out.println(optional1.get()); // Prints: OpenAI

            String nullValue = null;
            Optional<String> optional2 = Optional.of(nullValue); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Using Optional.ofNullable()
        String nullValue = null;
        Optional<String> optional3 = Optional.ofNullable(nullValue);
        System.out.println(optional3.isPresent()); // Prints: false
    }
   */
}
