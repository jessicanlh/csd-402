/**Jessica Long-Heinicke
 * Module 9
 * 2.16.25
 */

import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"));

        // Printing elements using for-each loop
        for (String item : items) {
            System.out.println(item);
        }

        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to retrieve (0-9): ");

        try {
            Integer index = scanner.nextInt(); // Auto-boxing int to Integer
            System.out.println("You selected: " + items.get(index)); // Auto-unboxing Integer to int
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}