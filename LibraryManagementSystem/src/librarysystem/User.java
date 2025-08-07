package librarysystem;

public class User {
    private int id;
    private String name;
    private Book issuedBook;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBook = null;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public boolean hasIssuedBook() {
        return issuedBook != null;
    }

    public Book getIssuedBook() {
        return issuedBook;
    }

    public void issueBook(Book book) {
        this.issuedBook = book;
    }

    public void returnBook() {
        this.issuedBook = null;
    }

    @Override
    public String toString() {
        return id + " - " + name + (hasIssuedBook() ? " | Book: " + issuedBook.getTitle() : " | No book issued");
    }
}

