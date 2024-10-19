public class Book implements Borrowable {
    private String title;
    private String author;
    private int ISBN;
    private boolean availability;  // Corrected the spelling

    public Book(String title, String author, int ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return availability;
    }

    // Corrected the method name
    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    // Implementing the borrow method from the Borrowable interface
    @Override
    public void borrow() {
        if (isAvailable()) {  // Fix: Added parentheses to call the method
            setAvailable(false);  // Correct method name
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    // Implementing the returnBook method from the Borrowable interface
    @Override
    public void returnBook() {
        setAvailable(true);  // Correct method name
        System.out.println(title + " has been returned.");
    }
}