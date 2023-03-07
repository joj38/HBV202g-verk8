package org.example;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;

    //+Book(String title, List<Author> authors): ctor
    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }
    //+addAuthor(Author author): void
    public void addAuthor(Author author) {
        this.authors.add(author);
    }
    //+getAuthors(): List<Author>
    public List<Author> getAuthors() {
        return this.authors;
    }
    //+setAuthors(List<Author> authors): void
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    //+getTitle(): String
    public String getTitle() {
        return this.title;
    }
    //+setTitle(String title): void
    public void setTitle(String title) {
        this.title = title;
    }
}
