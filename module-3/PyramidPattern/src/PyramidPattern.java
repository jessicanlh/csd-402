//Jessica Long-Heinicke Module 3 Assignment 3.3 1/19/25

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 7;
        int maxWidth = 40; // Set maximum width to 40 spaces

        // Generate the pyramid
        for (int i = 1; i <= rows; i++) {
            // Generate the numbers for the current row
            StringBuilder rowBuilder = new StringBuilder();

            // Generate the left half of the numbers
            for (int j = 0; j < i; j++) {
                rowBuilder.append((int) Math.pow(2, j)).append(" ");
            }

            // Generate the right half of the numbers
            for (int j = i - 2; j >= 0; j--) {
                rowBuilder.append((int) Math.pow(2, j)).append(" ");
            }

            // Convert the row to a string and trim extra spaces
            String row = rowBuilder.toString().trim();

            // Calculate the padding needed to center the row
            int rowLength = row.length();
            int leftPadding = (maxWidth - rowLength - 2) / 2; // Subtract 2 to leave space for "@"

            // Print the left padding
            System.out.print(" ".repeat(Math.max(0, leftPadding)));

            // Print the numbers
            System.out.print(row);

            // Calculate the spaces needed to align the `@` symbol to the right
            int spacesAfterNumbers = maxWidth - rowLength - leftPadding - 1; // 1 for "@"
            System.out.print(" ".repeat(Math.max(0, spacesAfterNumbers)));

            // Print the `@` symbol
            System.out.println("@");
        }
    }
}
