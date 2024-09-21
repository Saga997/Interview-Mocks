package org.zaidism.solidPrinciples.singleResponsibility;

public class BookNaming {
    private String title;
    private String author;
    private String text;

    public BookNaming(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
