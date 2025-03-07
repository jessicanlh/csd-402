//Jessica Long-Heinicke Module 12 3.6.25

public class AutoService {

    private static final double STANDARD_SERVICE = 100.00;

    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE + oilChangeFee;
    }

    public static double yearlyService(double oilChangeFee, double tireRotation) {
        return STANDARD_SERVICE + oilChangeFee + tireRotation;
    }

    public static double yearlyService(double oilChangeFee, double tireRotation, double coupon) {
        return STANDARD_SERVICE + oilChangeFee + tireRotation - coupon;
    }

    public static void main(String[] args) {
        // Testing yearlyService() with no parameters
        System.out.println("Yearly Service (no parameters):");
        System.out.println("Test 1: $" + yearlyService());
        System.out.println("Test 2: $" + yearlyService());

        // Testing yearlyService() with one parameter (oil change fee)
        System.out.println("\nYearly Service with Oil Change:");
        System.out.println("Test 1: $" + yearlyService(25.50));
        System.out.println("Test 2: $" + yearlyService(30.75));

        // Testing yearlyService() with two parameters (oil change and tire rotation)
        System.out.println("\nYearly Service with Oil Change and Tire Rotation:");
        System.out.println("Test 1: $" + yearlyService(25.50, 15.00));
        System.out.println("Test 2: $" + yearlyService(30.75, 20.25));

        // Testing yearlyService() with three parameters (oil change, tire rotation, coupon)
        System.out.println("\nYearly Service with Oil Change, Tire Rotation, and Coupon:");
        System.out.println("Test 1: $" + yearlyService(25.50, 15.00, 10.00));
        System.out.println("Test 2: $" + yearlyService(30.75, 20.25, 25.50));
    }
}