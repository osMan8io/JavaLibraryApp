package libraryApp;

import java.util.Scanner;

public class LibraryUI {

    private final Scanner scan = new Scanner(System.in);
    Library library;

    public LibraryUI(Library library) {
        this.library = library;
    }

    public void start() {

        System.out.println("Welcome to the Library Application");
        showMenu();
        System.out.println("Please select an option from the menu or enter 'Q' to exit the application");
        String choice = scan.nextLine();

        while (!choice.isEmpty()) {
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                return;
            }
            if (choice.equalsIgnoreCase("1")) {
                handelAddBook();
                System.out.println("would you like to add another book? (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelAddBook();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' for yes or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelAddBook();
                            return;
                        }
                        if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("2")) {
                handelDeleteBook();
                System.out.println("would you like to delete another book? (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelDeleteBook();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelDeleteBook();
                            return;
                        } if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("3")) {
                handelBorrowBook();
                System.out.println("would you like to borrow another book? (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelBorrowBook();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelBorrowBook();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("4")) {
                handelReturnBook();
                System.out.println("would you like to return another book? (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelReturnBook();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelReturnBook();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("5")) {
                handelSearchBookByTitle();
                System.out.println("would you like to search another book (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelSearchBookByTitle();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelSearchBookByTitle();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("6")) {
                handelSearchBookByAuthor();
                System.out.println("would you like to search another book (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelSearchBookByAuthor();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelSearchBookByAuthor();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("7")) {
                handelSearchBookById();
                System.out.println("would you like to search another book (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelSearchBookById();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelSearchBookById();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            if (choice.equalsIgnoreCase("8")) {
                handelSearchBookByCategory();
                System.out.println("would you like to search another book (Y/N)");
                choice = scan.nextLine();
                while (!choice.isEmpty()) {
                    if (choice.equalsIgnoreCase("y")) {
                        handelSearchBookByCategory();
                        return;
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.err.println("Invalid choice please enter 'Y' or 'N' for no");
                        choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            handelSearchBookByCategory();
                            return;
                        } else if (choice.equalsIgnoreCase("n")) {
                            System.out.println("Goodbye!");
                            return;
                        }
                    }
                }
            }
            System.err.println("Invalid choice please enter a valid option");
            break;
        }

    }

    private int getValidInt(String massage) {
        while (true) {
            System.out.println(massage);
            try {
                return Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    private String getNonEmptyString(String massage) {
        while (true) {
            System.out.println(massage);
            String input = scan.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println("Input cannot be empty.");
        }
    }

    private Category getValidCategory(String massage) {

        System.out.println(massage);
        String inputCategory = scan.nextLine().trim().toUpperCase();
        while (!inputCategory.isEmpty()) {
            try {
                inputCategory = String.valueOf(Category.valueOf(inputCategory));
                break;
            } catch (Exception e) {
                System.err.println("Invalid category try again [ROMAN, FICTION, COMIC, EDUCATION]");
            }
            System.out.println("Category cannot be empty. Try again.");
        }

        return Category.valueOf(inputCategory);
    }

    public void showMenu() {

        System.out.println("""
                1. Add Book
                2. Delete Book
                3. Borrow Book
                4. Return Book
                5. Search Book By Title
                6. Search Book By Author
                7. Search Book By Id
                8. Search Book By Category""");

    }

    private void handelAddBook() {
        int id = getValidInt("Enter book ID: ");
        String title = getNonEmptyString("Enter title: ");
        String author = getNonEmptyString("Enter author: ");
        Category inputCategory = getValidCategory("Please enter a category (ROMAN, FICTION, COMIC, EDUCATION): ");

        library.addBook(new Book(id,title,author,Category.valueOf(String.valueOf(inputCategory))));
    }

    private void handelDeleteBook() {
        int id = getValidInt("Enter book ID: ");
        library.removeBook(id);
    }

    private void handelBorrowBook() {
        int id = getValidInt("Enter book ID: ");
        library.borrowBook(id);
    }

    private void handelReturnBook() {
        int id = getValidInt("Enter book ID: ");
        library.returnBook(id);
    }

    private void handelSearchBookByTitle() {
        String title = getNonEmptyString("Enter title: ");
        library.searchByTitle(title);
    }

    private void handelSearchBookByAuthor() {
        String author = getNonEmptyString("Enter author: ");
        library.searchByAuthor(author);
    }

    private void handelSearchBookByCategory() {
        Category category = getValidCategory("Please enter a category: ");
        library.searchByCategory(category);
    }

    private void handelSearchBookById() {
        int id = getValidInt("Enter book ID: ");
        library.searchById(id);
    }

}
