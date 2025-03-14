//Jessica Long-Heinicke Module 6 2/2/25

import java.util.Collection;

public class Fan {
    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to display a single Fan instance without using toString()
    public void displayFan() {
        if (this.on) {
            System.out.println("Fan is on. Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius);
        } else {
            System.out.println("Fan is off. Color: " + this.color + ", Radius: " + this.radius);
        }
    }

    // Method to display a collection of Fan instances without using toString()
    public static void displayFanCollection(Collection<Fan> fans) {
        for (Fan fan : fans) {
            fan.displayFan();
        }
    }
}