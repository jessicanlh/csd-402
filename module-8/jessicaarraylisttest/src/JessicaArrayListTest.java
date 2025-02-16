/**Jessica Long-Heinicke
 * Module 8
 * 2.16.25
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * JessicaArrayListTest class to demonstrate working with ArrayLists.
 * This program takes user input to populate an ArrayList with integers.
 * It then determines the maximum value in the list and displays it.
 */
public class JessicaArrayListTest {

    /**
     * Finds and returns the maximum integer value from the given ArrayList.
     * If the list is empty, returns 0.
     *
     * @param list The ArrayList of integers
     * @return The maximum integer value in the list or 0 if the list is empty
     */
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int maxValue = list.get(0);
        for (int num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    /**
     * Main method to accept user input and determine the maximum value in the list.
     * The user enters integers until they enter 0, which is also added to the list.
     * The maximum value is then displayed.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop and include in the list):");
        while (true) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }

        scanner.close();

        int maxNumber = max(numbers);
        System.out.println("The largest value in the list is: " + maxNumber);
    }
}
