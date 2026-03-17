package com.gla.Level2;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);
            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);
            if (recursiveSum == formulaSum) {
                System.out.println("Both methods give the SAME result. ✔");
            } else {
                System.out.println("Results are DIFFERENT. ❌");
            }
        }
    }
}
