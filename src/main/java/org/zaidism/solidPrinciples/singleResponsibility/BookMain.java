package org.zaidism.solidPrinciples.singleResponsibility;

import java.io.IOException;

public class BookMain {
    public static void main(String[] args) throws IOException {
        BookNaming book = new BookNaming("Effective Java", "Joshua Bloch", "Some text about Java");

        // Responsibility 1: Managing book data
        System.out.println("Book Title: " + book.getTitle());

        // Responsibility 2: Printing book details
        BookPrinter printer = new BookPrinter();
        printer.printBook(book);

        // Responsibility 3: Saving book details to a file
        BookPersistence persistence = new BookPersistence();
        persistence.saveToFile(book, "effective_java.txt");
    }
}
