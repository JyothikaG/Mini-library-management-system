# Mini Library Management System (Java)

## Objective
A simple CLI-based Java program to manage books and users, with functionalities to issue and return books.

## Tools Used
- Java (JDK 8 or above)
- Eclipse-Workspace
- Terminal / Command Prompt

## Classes
- `Book` – Represents a book (ID, Title, Author, Issued status)
- `User` – Represents a library user (ID, Name, Issued Book)
- `Library` – Manages lists of books and users and performs operations
- `Main` – CLI menu to interact with the system

## Features
- Add books and users
- View books and users
- Issue book to user
- Return book from user

## How to Run
1. Compile all `.java` files:
   ```bash
   javac *.java

## Outcome
- Hands-on with Object-Oriented Programming (OOP) concepts like classes, objects, methods, encapsulation
- Understanding Java CLI input/output

## Sample Inputs to Test
When prompted in the console:

--- Library Menu ---
1. View Books
2. View Users
3. Issue Book
4. Return Book
5. Exit
Enter choice: 1

## Result
You’ll see:

- Book and user info printed
- Message when a book is issued or returned
- Error handling for wrong input
