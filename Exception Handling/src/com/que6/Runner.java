package com.que6;

import com.que6.InterestCalculator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InterestCalculator ic = new InterestCalculator();

        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double result = ic.calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        } catch (Exception e) {
            System.out.println("Invalid input type");
        }

        sc.close();
    }
}