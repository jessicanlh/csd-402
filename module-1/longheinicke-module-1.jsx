// Jessica Long-Heinicke Module 1 1/7/25

import java.util.Scanner;

public class HeatWaterEnergyCalculator {
    public static void main (String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter the amount of water in kilos
        System.out.print("Enter the amount of water in Kilograms: ");
        doubt waterMass = input.nextDouble();
        
        // Promt the user to enter the initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initial Temperature = input.nextDouble();
        
        // Prompt the user to enter the final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();
        
        //Calculate the energy eneeded 
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;
        
        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f Joules.%n", energy);
        
        // Close the scanner
        input.close();
    }
}