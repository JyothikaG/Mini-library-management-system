package librarysystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        System.out.println("\n--- User List ---");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }

    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public void issueBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null || book == null) {
            System.out.println("Invalid user or book ID.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else if (user.hasIssuedBook()) {
            System.out.println("User already has an issued book.");
        } else {
            book.issue();
            user.issueBook(book);
            System.out.println("Book issued successfully to " + user.getName());
        }
    }

    public void returnBook(int userId) {
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("Invalid user ID.");
            return;
        }

        if (!user.hasIssuedBook()) {
            System.out.println("User has no book to return.");
        } else {
            Book book = user.getIssuedBook();
            book.returnBook();
            user.returnBook();
            System.out.println("Book returned successfully by " + user.getName());
        }
    }
}

