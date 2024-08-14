import java.util.HashMap; // Import the HashMap class for storing key-value pairs

class Book {
    // Private fields to store the name, publication year, and contents of the book
    private String name;
    private int publicationYear;
    private String contents;

    // Constructor to initialize a new Book object with the provided name, publication year, and contents
    public Book(String name, int publicationYear, String contents) {
        this.name = name; // Set the name of the book
        this.publicationYear = publicationYear; // Set the publication year of the book
        this.contents = contents; // Set the contents of the book
    }

    // Getter method to retrieve the name of the book
    public String getName() {
        return this.name; // Return the name of the book
    }

    // Override the toString method to provide a formatted string representation of the book
    @Override
    public String toString() {
        // Return a formatted string with the book's name, publication year, and contents
        return "Name: " + this.name + " (" + this.publicationYear + ")\nContents: " + this.contents;
    }
}

public class Program {
    // Method to print all values (books) in the HashMap
    public static void printValues(HashMap<String, Book> hashmap) {
        // Iterate over the values (Book objects) in the HashMap
        for (Book book : hashmap.values()) {
            System.out.println(book); // Print each book using its toString method
        }
    }

    // Method to print values if the book name contains a given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        // Iterate over the values (Book objects) in the HashMap
        for (Book book : hashmap.values()) {
            // Check if the book's name contains the specified text
            if (book.getName().contains(text)) {
                System.out.println(book); // Print the book if the name contains the text
            }
        }
    }

    // Main method for testing the Program class
    public static void main(String[] args) {
        // Create a new HashMap to store books, using the book's key as a unique identifier
        HashMap<String, Book> hashmap = new HashMap<>();
        // Add books to the HashMap with their respective keys
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "...")); // Add "Sense and Sensibility"
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "....")); // Add "Pride and Prejudice"

        // Test the methods by printing all book values
        printValues(hashmap); // Print all book values stored in the HashMap
        System.out.println("---"); // Print a separator line
        // Test by printing books whose names contain the string "prejud"
        printValueIfNameContains(hashmap, "prejud"); // Print books with names containing "prejud"
    }
}

/*
 * Summary:
 * The Program class demonstrates how to manage a collection of Book objects using a HashMap, where each book
 * is associated with a unique key. The class provides methods to print all books in the collection and to
 * selectively print books whose names contain a specified substring. The main method tests these functionalities
 * by adding books to the HashMap and invoking the methods to display the books. This example highlights the
 * basic use of HashMap and custom object management in Java.
 */
