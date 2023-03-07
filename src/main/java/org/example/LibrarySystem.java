package org.example;

import java.time.LocalDate;
import java.util.List;

public class LibrarySystem {

    private List<Book> books;
    private List<Lending> lendings;
    private List<User> users;

//+LibrarySystem(): ctor
    public LibrarySystem() {

            this.books = new java.util.ArrayList<>();
            this.lendings = new java.util.ArrayList<>();
            this.users = new java.util.ArrayList<>();

    }
//+addBookWithTitleAndAuthorlist(String title, List<Author> authors): void
    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors){
        this.books.add(new Book(title, authors));
    }
//+addStudentUser(String name, boolean feePaid): void
    public void addStudentUser(String name, boolean feePaid) {
        this.users.add(new Student(name, feePaid));
    }
//+addFacultyMemberUser(String name, String department): void
    public void addFacultyMemberUser(String name, String department) {
        this.users.add(new FacultyMember(name, department));
    }
//+findBookByTitle(String title): Book
    public Book findBookByTitle(String title) throws BookNotFoundException {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
       throw new BookNotFoundException(title);
    }
//+findUserByName(String name): User
    public User findUserByName(String name) throws  {
        for (User user : this.users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new
    }
//+borrowBook(User user, Book book): void
    public void borrowBook(User user, Book book) {

            this.lendings.add(new Lending(book, user));

    }
//+extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate): void
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {

    }
//+returnBook(User user, Book book): void
    public void returnBook(User user, Book book) {
        this.lendings.removeIf(lending -> lending.getBook().equals(book) && lending.getUser().equals(user));
    }


}
