//Jessica Long-Heinicke Module 4 1.26.25

import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0; // Use int to avoid overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        long sum = 0; // Use long to avoid overflow
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Helper method to generate a random array of shorts
    public static short[] generateShortArray(int size, int bound) {
        Random random = new Random();
        short[] array = new short[size];
        for (int i = 0; i < size; i++) {
            array[i] = (short) random.nextInt(bound);
        }
        return array;
    }

    // Helper method to generate a random array of ints
    public static int[] generateIntArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    // Helper method to generate a random array of longs
    public static long[] generateLongArray(int size, int bound) {
        Random random = new Random();
        long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    // Helper method to generate a random array of doubles
    public static double[] generateDoubleArray(int size, int bound) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * bound;
        }
        return array;
    }

    // Test program
    public static void main(String[] args) {
        // Generate random test data
        short[] shortArray = generateShortArray(5, 50); // Array of size 5 with values between 0-49
        int[] intArray = generateIntArray(6, 100);      // Array of size 6 with values between 0-99
        long[] longArray = generateLongArray(7, 200);   // Array of size 7 with values between 0-199
        double[] doubleArray = generateDoubleArray(8, 300); // Array of size 8 with values between 0.0-299.99

        // Display results
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray) + "\n");

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray) + "\n");

        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray) + "\n");

        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray) + "\n");
    }
}
