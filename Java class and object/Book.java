public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Book Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 449.00);
        book1.displayDetails();
    }
}
