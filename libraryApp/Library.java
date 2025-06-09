package libraryApp;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable, Borrowable {

    public List<Book> books = new ArrayList<>();

    User user;
    Book book;

    public Library(User user, List<Book> books, Book book) {
        this.user = user;
        this.books = books;
        this.book = book;
    }

    public Library() {

    }

    public void addBook(Book book) {

        books.add(book);
        System.out.println(book.toString() + " added to the library");
    }

    public void removeBook(int id) {

        String removedTitle = "";

        // loop through all the books, checks matching id, saves book title, removes the book then break.
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                removedTitle = books.get(i).title;
                books.remove(i);
                break;
            }
        }

        if (removedTitle.isEmpty()) {
            System.err.println("No book found with id: " + id);
        } else {
            System.out.println(removedTitle +" book removed");
        }

    }

    @Override
    public void searchByTitle(String title) {

        String searchedTitle = "";
        int searchedId = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) {
                searchedTitle = books.get(i).title;
                searchedId = books.get(i).id;
                break;
            }
        }

        if (searchedTitle.isEmpty()) {
            System.err.println("No book found with title: " + searchedTitle);
        } else {
            System.out.println("Book found with title: " + searchedTitle + " with id: " + searchedId);
        }
    }

    @Override
    public void searchByAuthor(String author) {

        String searchedAuthor = "";
        int searchedId = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).author.equals(author)) {
                searchedAuthor = books.get(i).author;
                searchedId = books.get(i).id;
                break;
            }
        }

        if (searchedAuthor.isEmpty()) {
            System.err.println("No book found with author: " + searchedAuthor);
        } else {
            System.out.println("Book found with author: " + searchedAuthor + " with id: " + searchedId);
        }
    }

    @Override
    public void searchById(int id) {

        int searchedId = 0;
        String searchedTitle = "";

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                searchedId = books.get(i).id;
                searchedTitle = books.get(i).title;
                break;
            }
        }
        if (searchedId <= -0) {
            System.err.println("No book found with id: " + id);
        } else {
            System.out.println("Book found with id: " + id + " with title: " + searchedTitle);
        }
    }

    @Override
    public void searchByCategory(Category category) {

        List<Book> searchedBooks = new ArrayList<>();
        int count = 0;

        // loops through books, finds matching one, adds to searchedBooks, counts books that added.
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).category.equals(category)) {
                System.out.println("Book found with id: " + books.get(i).id +
                        " with title: " + books.get(i).title + " category: " +
                        category + " with author: " + books.get(i).author);
                count++;
                searchedBooks.add(books.get(i));
            }
        }

        if (books.isEmpty()) {
            System.err.println("No book found with category: " + category);
        } else if (count == 1) {
            System.out.println(count + " Book is founded in category: " + category);
        } else {
            System.out.println(count + " Books are founded in category: " + category);
        }

    }

    @Override
    public void borrowBook(int id) {

        String borrowedTitle = "";

        // loop through all the books, checks matching id, saves book title, sets book as borrowed then break.
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                borrowedTitle = books.get(i).title;
                books.get(i).setBorrowed(true);
                break;
            }
        }
        if (borrowedTitle.isEmpty()) {
            System.err.println("No book found with id: " + id);
        } else {
            System.out.println(borrowedTitle + " is now borrowed");
        }
    }

    @Override
    public void returnBook(int id) {

        String returnedTitle = "";

        // loop through books, checks matching id, saves book title, sets as returned then break.
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                returnedTitle = books.get(i).title;
                books.get(i).setReturned(true);
                break;
            }
        }

        if (returnedTitle.isEmpty()) {
            System.err.println("No book found with id: " + id);
        } else {
            System.out.println(returnedTitle + " is now returned");
        }
    }

}
