package com.gla.Level1;
import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to sum
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = sumOfNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}