import java.util.HashMap;

public class Abbreviations {
    // A HashMap to store abbreviations and their explanations
    private HashMap<String, String> abbreviations;

    // Constructor initializes the HashMap
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Adds a new abbreviation and its explanation to the HashMap
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Checks if an abbreviation exists in the HashMap
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Retrieves the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of Abbreviations
        Abbreviations abbreviations = new Abbreviations();
        // Add some abbreviations and their explanations
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        // Test the methods with a sample text
        String text = "e.g. i.e. etc. lol";
        for (String part: text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();
    }
}
