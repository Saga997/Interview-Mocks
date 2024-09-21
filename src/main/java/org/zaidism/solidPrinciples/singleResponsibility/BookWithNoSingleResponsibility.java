package org.zaidism.solidPrinciples.singleResponsibility;

import java.io.FileWriter;
import java.io.IOException;

public class BookWithNoSingleResponsibility {

        private String title;
        private String author;
        private String text;

        public BookWithNoSingleResponsibility(String title, String author, String text) {
            this.title = title;
            this.author = author;
            this.text = text;
        }

        // Responsibility 1: Managing book data
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getText() {
            return text;
        }

        // Responsibility 2: Printing book details
        public void printBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Text: " + text);
        }

        // Responsibility 3: Saving book details to a file
        public void saveToFile(String filename) {
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("Title: " + title + "\n");
                writer.write("Author: " + author + "\n");
                writer.write("Text: " + text + "\n");
            } catch (IOException e) {
                System.out.println("An error occurred while saving the book: " + e.getMessage());
            }
        }
    }

    //

// Here the book class has 3 responsibilities which should not be done inside a single class
// rather separate classes should be made for each responsibility
