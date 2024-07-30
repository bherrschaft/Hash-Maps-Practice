import java.util.HashMap;

class Book {
    private String name;
    private int publicationYear;
    private String contents;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\nContents: " + this.contents;
    }
}

public class Program {
    // Method to print all values in the HashMap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print values if the book name contains a given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a new HashMap to store books
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        // Test the methods
        printValues(hashmap); // Print all book values
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud"); // Print books with names containing "prejud"
    }
}
