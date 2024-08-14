import java.util.HashMap; // Import the HashMap class for storing key-value pairs

public class IOU {
    // A HashMap to store debts where the key is the person's name and the value is the amount owed
    private HashMap<String, Double> debts;

    // Constructor initializes the HashMap
    public IOU() {
        this.debts = new HashMap<>(); // Create a new HashMap instance to store debts
    }

    // Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount); // Add or update the amount owed to the person in the HashMap
    }

    // Method to get the amount owed to a person
    public double howMuchDoIOweTo(String toWhom) {
        // Retrieve the amount owed to the person, or return 0.0 if the person is not found in the HashMap
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    // Main method for testing the IOU class
    public static void main(String[] args) {
        IOU mattsIOU = new IOU(); // Create a new IOU instance for testing
        mattsIOU.setSum("Arthur", 51.5); // Set the amount owed to Arthur as 51.5
        mattsIOU.setSum("Michael", 30.0); // Set the amount owed to Michael as 30.0

        // Print the amount owed to Arthur
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // Output: 51.5
        // Print the amount owed to Michael
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));  // Output: 30.0

        mattsIOU.setSum("Arthur", 10.5); // Update the amount owed to Arthur to 10.5

        // Print the updated amount owed to Arthur
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // Output: 10.5
    }
}

/*
 * Summary:
 * The IOU class manages debts using a HashMap, where each key is a person's name and the corresponding value
 * is the amount owed to that person. The class provides methods to set and retrieve the amount owed to specific individuals.
 * The main method demonstrates how to add debts, update them, and query the amount owed to different people.
 * This class is a simple example of how to track financial obligations using basic data structures in Java.
 */
