package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lending {


    private LocalDate dueDate;
    private Book book;
    private User user;


    //+Lending(Book book, User user): ctor
    public Lending(Book book, User user) {
        this.dueDate = LocalDate.now().plus(30, ChronoUnit.DAYS);
        this.book = book;
        this.user = user;
    }
    //+getDueDate(): LocalDate
    public LocalDate getDueDate() {
        return this.dueDate;

    }
    //+setDueDate(LocalDate dueDate): void
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    //+getBook(): Book
    public Book getBook() {
        return this.book;
    }
    //+setBook(Book book): void
    public void setBook(Book book) {
        this.book = book;
    }
    //+getUser(): User
    public User getUser() {
        return this.user;
    }
    //+setUser(User user): void
    public void setUser(User user) {
        this.user = user;
    }
}
