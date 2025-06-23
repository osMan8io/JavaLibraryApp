package libraryApp;

public interface Searchable {

    void searchByTitle(String title);
    void searchByAuthor(String author);
    void searchById(int id);
    void searchByCategory(Category category);

}
