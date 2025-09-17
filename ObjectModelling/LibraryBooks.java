import java.util.ArrayList;

class LibraryBook {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showDetails() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.showDetails();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear");
        Book b2 = new Book("Ikigai", "Héctor García");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b2);
        lib2.addBook(b1); // Same book in multiple libraries

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}