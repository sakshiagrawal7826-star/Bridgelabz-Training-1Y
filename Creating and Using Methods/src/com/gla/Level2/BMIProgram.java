package com.gla.Level2;
import java.util.Scanner;

public class BMIProgram {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightMeter = heightCm / 100;   // convert cm to meter
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9)
            return "Normal weight";
        else if (bmi >= 25 && bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", data[i][2]));
            System.out.println("Status: " + getBMIStatus(data[i][2]));
            System.out.println("----------------------");
        }

    }
}
