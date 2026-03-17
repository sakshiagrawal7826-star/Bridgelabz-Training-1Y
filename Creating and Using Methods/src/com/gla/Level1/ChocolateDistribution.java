package com.gla.Level1;
import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than 0!");
        } else {
            int[] distribution = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets " + distribution[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + distribution[1]);
        }
    }
}
