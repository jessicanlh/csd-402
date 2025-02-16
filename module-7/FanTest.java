//Jessica Long-Heinicke Module 6 2/2/25

import java.util.ArrayList;
import java.util.List;

public class FanTest {
    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();

        // Add fans to the collection
        fanCollection.add(new Fan()); // Default fan
        fanCollection.add(new Fan(Fan.FAST, true, 8.5, "blue")); // Custom fan
        fanCollection.add(new Fan(Fan.MEDIUM, false, 5.0, "red")); // Another custom fan

        // Display all fans in the collection
        System.out.println("Displaying all fans in the collection:");
        Fan.displayFanCollection(fanCollection);

        // Display a single fan instance
        System.out.println("\nDisplaying a single fan instance:");
        Fan singleFan = new Fan(Fan.SLOW, true, 7.0, "green");
        singleFan.displayFan();
    }
}