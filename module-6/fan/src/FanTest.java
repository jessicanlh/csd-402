//Jessica Long-Heinicke Module 6 2/2/25

 class FanTest {
    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1.toString());

        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 8.5, "blue");
        System.out.println("\nFan 2 (Argument Constructor):");
        System.out.println(fan2.toString());

        // Test setter methods on fan1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("red");
        fan1.setRadius(5.0);

        // Display updated state of fan1
        System.out.println("\nFan 1 (After Updating Fields):");
        System.out.println(fan1.toString());

        // Test getter methods on fan2
        System.out.println("\nFan 2 Details:");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}