package Liberary_App;

import java.util.List;

public class User {

    String name;
    int userId;
    List<Book> borrowedBooks;

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public User(String name, int userId, List<Book> borrowedBooks) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
