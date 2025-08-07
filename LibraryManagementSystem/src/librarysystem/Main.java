package librarysystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample data
        library.addBook(new Book(1, "Java Basics", "John Doe"));
        library.addBook(new Book(2, "OOP in Java", "Jane Smith"));
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. View Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    library.issueBook(userId, bookId);
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    userId = sc.nextInt();
                    library.returnBook(userId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

