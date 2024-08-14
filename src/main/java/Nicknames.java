import java.util.HashMap; // Import the HashMap class for storing key-value pairs

public class Nicknames {
    public static void main(String[] args) {
        // Create a new HashMap to store names and their corresponding nicknames
        HashMap<String, String> nicknames = new HashMap<>();

        // Store the names and nicknames in the HashMap using the put method
        nicknames.put("matthew", "matt"); // Map "matthew" to "matt"
        nicknames.put("michael", "mix");  // Map "michael" to "mix"
        nicknames.put("arthur", "artie"); // Map "arthur" to "artie"

        // Get Matthew's nickname from the HashMap
        String matthewsNickname = nicknames.get("matthew"); // Retrieve the nickname associated with "matthew"

        // Print Matthew's nickname
        System.out.println("Matthew's nickname is: " + matthewsNickname); // Output: "Matthew's nickname is: matt"
    }
}

/*
 * Summary:
 * The Nicknames class demonstrates how to use a HashMap to store and retrieve nicknames for given names.
 * It creates a HashMap that maps full names to their nicknames, stores several name-nickname pairs, and
 * retrieves and prints the nickname for "Matthew". This simple example highlights the basic operations
 * of putting and getting values in a HashMap in Java.
 */
