## Library Management System Overview

### Description
The Library Management System (LMS) is a software application designed to facilitate the management of library resources, including books, users, and transactions like borrowing and returning books. The primary goals of the LMS are to streamline operations, maintain accurate records, and provide an easy-to-use interface for both library staff and users.

### Key Features
1. **Book Management**:
   - Add new books (printed and eBooks).
   - Remove or update existing books.
   - Search for books by title or author.
   - Display all available books.

2. **User Management**:
   - Register new users.
   - View user details.
   - Manage user borrowing records.

3. **Borrowing System**:
   - Borrow a book if available.
   - Return a borrowed book.
   - View borrowing history.

4. **Availability Tracking**:
   - Check the availability of books.
   - Mark books as borrowed or returned.

### Technologies Used
- **Programming Language**: Java
- **Collections Framework**: Java Collections (e.g., List, ArrayList)
- **OOP Principles**: Encapsulation, Inheritance, Polymorphism, Abstraction

---

## Detailed Usage Guide

### 1. **Setting Up the Project**

#### Prerequisites
- Java Development Kit (JDK) installed on your machine.
- An IDE (like IntelliJ IDEA, Eclipse, or VS Code) for editing and running Java code.
- Git installed for version control.

#### Cloning the Repository
1. Open your terminal (or command prompt).
2. Navigate to the directory where you want to clone the project.
3. Clone the repository:
   ```bash
   git clone https://github.com/KeshUdana/LibraryManagementSystem.git
   cd LibraryManagementSystem
   ```

### 2. **Project Structure**
The project structure should look something like this:

```
LibraryManagementSystem/
│
├── src/
│   ├── Book.java             # Class representing a book
│   ├── EBook.java            # Class representing an eBook
│   ├── PrintedBook.java       # Class representing a printed book
│   ├── Library.java           # Class managing library operations
│   ├── User.java              # Class representing a user
│   └── Main.java              # Main class to run the application
│
├── .gitignore                 # Git ignore file
├── README.md                  # Project documentation
└── pom.xml (if using Maven)  # Maven configuration (if applicable)
```

### 3. **Running the Application**
1. Open the main class file (e.g., `Main.java`) in your IDE.
2. Make sure all dependencies (if any) are resolved.
3. Run the `Main` class, which should invoke the library management functionality.

### 4. **Using the Library Management System**
After running the application, you will typically have a console or GUI that allows you to interact with the system. Below are the main functionalities you will be able to perform:

#### Adding Books
- Use the provided method in the `Library` class to add new books. The method can accept both `PrintedBook` and `EBook` objects.
  
```java
library.addBook(new PrintedBook("Title", "Author", true));
library.addBook(new EBook("EBook Title", "Author", "URL"));
```

#### Borrowing Books
- To borrow a book, you will need to call the `borrowBook` method, providing the book title. If the book is available, it will be marked as borrowed.

```java
library.borrowBook("Title");
```

#### Returning Books
- Call the method to return a borrowed book.

```java
library.returnBook("Title");
```

#### Viewing Available Books
- You can display all available books using:

```java
library.showAvailableBooks();
```

### 5. **Class Descriptions**

#### `Book`
- An abstract class representing a book, containing common attributes like `title`, `author`, and availability status.
- Has methods for getting book details and checking availability.

#### `EBook` and `PrintedBook`
- Subclasses of `Book`, implementing specific attributes (e.g., download link for `EBook`).

#### `Library`
- Manages a collection of `Book` objects.
- Contains methods to add, borrow, return, and display books.

#### `User`
- Represents library users.
- Holds user details and borrowing history.

#### `Main`
- Contains the main method to run the application and interact with the `Library` class.

---

## Conclusion

The Library Management System serves as a comprehensive tool for managing library resources efficiently. By implementing core OOP principles, the system is structured to allow for easy extension and maintenance. 

Feel free to explore and enhance the system by adding more features, such as user authentication, detailed borrowing records, or integration with a database for persistent storage. Let me know if you have any questions or need further clarifications!
