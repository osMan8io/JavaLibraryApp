package libraryApp;

public interface Searchable {

    public void searchByTitle(String title);
    public void searchByAuthor(String author);
    public void searchById(int id);
    public void searchByCategory(Category category);

}
