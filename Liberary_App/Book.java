package Liberary_App;

public class Book  {



    int id;
    String title;
    String author;
    boolean isBorrowed;
    boolean isReturned;
    Category category;

    public Book(int id, String title, String author, boolean isBorrowed, boolean isReturned, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        this.isReturned = isReturned;
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return id + " " + title + " " + author + " " + category;
    }

}
