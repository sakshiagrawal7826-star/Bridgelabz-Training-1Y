package com.gla.Level1;
import java.util.Scanner;
public class TriangularParkRun {
    public static double calculateRounds(double side1, double side2, double side3){
        double perimeter =side1 + side2 + side3;
        double rounds = 5000/perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1(in meters): ");
        double side1 =sc.nextDouble();
        System.out.println("Enter side 2(in meters): ");
        double side2 =sc.nextDouble();
        System.out.println("Enter side 3(in meters): ");
        double side3 =sc.nextDouble();
        double result=calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds needed to complete 5 km run: " +result);
    }
}
