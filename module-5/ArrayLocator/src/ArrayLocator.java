//Jessica Long-Heinicke Module 5 2/2/25

public class ArrayLocator {

    // Method to locate the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Test with a double array
        double[][] doubleArray = {
                {1.2, 3.4, 5.6},
                {7.8, 9.0, 2.3},
                {4.5, 6.7, 8.9}
        };
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        System.out.println("Largest in double array is at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest in double array is at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");

        // Test with an int array
        int[][] intArray = {
                {1, 3, 5},
                {7, 9, 2},
                {4, 6, 8}
        };
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        System.out.println("Largest in int array is at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest in int array is at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}