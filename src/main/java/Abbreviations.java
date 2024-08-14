import java.util.HashMap; // Import the HashMap class for storing key-value pairs

public class Abbreviations {
    // A HashMap to store abbreviations and their explanations
    private HashMap<String, String> abbreviations;

    // Constructor initializes the HashMap
    public Abbreviations() {
        this.abbreviations = new HashMap<>(); // Create a new HashMap instance
    }

    // Adds a new abbreviation and its explanation to the HashMap
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation); // Store the abbreviation and its explanation in the HashMap
    }

    // Checks if an abbreviation exists in the HashMap
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation); // Check if the abbreviation is a key in the HashMap
    }

    // Retrieves the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation) {
        // Return the explanation if found, otherwise return null
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    // Main method for testing the Abbreviations class
    public static void main(String[] args) {
        // Create an instance of Abbreviations
        Abbreviations abbreviations = new Abbreviations();
        // Add some abbreviations and their explanations
        abbreviations.addAbbreviation("e.g.", "for example"); // Add "e.g." with its explanation
        abbreviations.addAbbreviation("etc.", "and so on"); // Add "etc." with its explanation
        abbreviations.addAbbreviation("i.e.", "more precisely"); // Add "i.e." with its explanation

        // Test the methods with a sample text
        String text = "e.g. i.e. etc. lol"; // Sample text containing both known and unknown abbreviations
        for (String part : text.split(" ")) { // Split the text into words and iterate through them
            if (abbreviations.hasAbbreviation(part)) { // Check if the current word is an abbreviation
                part = abbreviations.findExplanationFor(part); // Replace the abbreviation with its explanation
            }
            System.out.print(part); // Print the word or explanation
            System.out.print(" "); // Print a space to separate the words
        }
        System.out.println(); // Print a newline after the loop ends
    }
}

/*
 * Summary:
 * The Abbreviations class manages a collection of abbreviations and their corresponding explanations using a HashMap.
 * It provides methods to add abbreviations, check if an abbreviation exists, and retrieve its explanation.
 * The main method tests these functionalities by replacing known abbreviations in a sample text with their explanations
 * and printing the modified text. This class demonstrates basic use of Java's HashMap and string manipulation.
 */
