import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    // Constructor
    public IOU() {
        this.debts = new HashMap<>();
    }

    // Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    // Method to get the amount owed to a person
    public double howMuchDoIOweTo(String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    // Main method for testing
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30.0);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // Output: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));  // Output: 30.0

        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));   // Output: 10.5
    }
}
