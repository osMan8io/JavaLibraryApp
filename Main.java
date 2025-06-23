import libraryApp.Book;
import libraryApp.Category;
import libraryApp.Library;
import libraryApp.LibraryUI;

import java.util.Scanner;

public class Main   {

    public static void main(String[] args) {

        Library library = new Library();
        LibraryUI ui = new LibraryUI(library);

        Book book1 = new Book(1,"Sicher","Heuber",false,false,Category.EDUCATION);
        Book book2 = new Book(2,"spider-man","Marvell",false,false,Category.COMIC);
        Book book3 = new Book(3,"Romeo & Juliet","Youth",false,false,Category.ROMAN);
        Book book4 = new Book(4,"The Duned City","Okya",false,false,Category.ROMAN);
        Book book5 = new Book(5,"ABC English","Oxford",false,false,Category.EDUCATION);
        Book book6 = new Book(99,"Spring Boot","Spring",false,false,Category.EDUCATION);
        Book book7 = new Book(0,"Gone","Hunter",false,false,Category.FICTION);

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);
        library.books.add(book6);
        library.books.add(book7);

        ui.start();

/*        for (int i = 0; i < library.books.size(); i++) {
            System.out.println("DEBUG: ID = " + library.books.get(i).getTitle() + " " + library.books.indexOf(library.books.get(i)));
        }*/

/*        System.out.println("Welcome to Library");
        System.out.println("""
                What would you like to do?
                1. Add Book
                2. Delete Book
                3. Borrow Book
                4. Return Book
                5. Search Book By Title
                6. Search Book By Author
                7. Search Book By Id
                8. Search Book By Category""");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.contains("1")) {
            System.out.println("please enter the id");
            int bookId = scan.nextInt();
            scan.nextLine(); // after taking int value as an input the buffer must be clean.
            System.out.println("please enter the title");
            String title = scan.nextLine();
            System.out.println("please enter the author");
            String author = scan.nextLine();
            System.out.println("please enter the category: ROMAN, FICTION, COMIC, EDUCATION");
            Category category = Category.valueOf(scan.nextLine().trim().toUpperCase());

            Book book = new Book(bookId,title,author,false,false,category);
            library.addBook(book);
            scan.close();
        }

        if (input.contains("2")) {

            System.out.println("please enter the id of the book you would like to delete");
            int bookId = scan.nextInt();
            library.removeBook(bookId);
            scan.close();
        }

        if (input.contains("3")) {

            System.out.println("please enter the id of the book you would like to borrow");
            int bookId = scan.nextInt();
            library.borrowBook(bookId);
        }

        if (input.contains("4")) {

            System.out.println("please enter the id of the book you would like to return");
            int bookId = scan.nextInt();
            library.returnBook(bookId);
        }

        if (input.contains("5")) {
            System.out.println("please enter Title of the book you would like to search");
            library.searchByTitle(scan.nextLine());
        }

        if (input.contains("6")) {
            System.out.println("please enter Author of the book you would like to search");
            library.searchByAuthor(scan.nextLine());
        }

        if (input.contains("7")) {
            System.out.println("please enter the id of the book you would like to search");
            library.searchById(scan.nextInt());
            scan.nextLine();
        }

        if (input.contains("8")) {

            System.out.println("Please enter a category (ROMAN, FICTION, COMIC, EDUCATION) or type 'exit' to cancel the search:");
            while (true) {

                String inputCategory = scan.nextLine().trim().toUpperCase();
                if (inputCategory.equals("EXIT")) {
                    System.out.println("Search is canceled");
                    return;
                }
                try {
                    inputCategory = Category.valueOf(inputCategory).toString();
                    library.searchByCategory(Category.valueOf(inputCategory));
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid category try again [ROMAN, FICTION, COMIC, EDUCATION]");
                }

            }
        }*/

    }
}
