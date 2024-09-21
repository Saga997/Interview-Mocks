package org.zaidism.solidPrinciples.singleResponsibility;

import java.io.FileWriter;
import java.io.IOException;

public class BookPersistence {
    public void saveToFile(BookNaming book, String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Title: " + book.getTitle() + "\n");
            writer.write("Author: " + book.getAuthor() + "\n");
            writer.write("Text: " + book.getText() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the book: " + e.getMessage());
        }
    }
}
