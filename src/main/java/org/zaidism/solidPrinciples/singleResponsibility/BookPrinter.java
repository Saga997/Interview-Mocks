package org.zaidism.solidPrinciples.singleResponsibility;

public class BookPrinter {
    public void printBook(BookNaming book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Text: " + book.getText());
    }
}
