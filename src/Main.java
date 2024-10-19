import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Exit");

            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after integer input

            switch (choice) {
                case 1:
                    addBookToLibrary(library, scanner);
                    break;

                case 2:
                    borrowBookFromLibrary(library, scanner);
                    break;

                case 3:
                    returnBookToLibrary(library, scanner);
                    break;

                case 4:
                    library.showAvailableBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addBookToLibrary(Library library, Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book ISBN: ");
        int isbn = scanner.nextInt();

        // For simplicity, set all newly added books as available
        Book newBook = new Book(title, author, isbn, true);

        library.addBook(newBook);
        System.out.println("Book added successfully!");
    }

    private static void borrowBookFromLibrary(Library library, Scanner scanner) {
        System.out.print("Enter the title of the book to borrow: ");
        String title = scanner.nextLine();

        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                library.borrowBook(book);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    private static void returnBookToLibrary(Library library, Scanner scanner) {
        System.out.print("Enter the title of the book to return: ");
        String title = scanner.nextLine();

        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                library.returnBook(book);
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
}
