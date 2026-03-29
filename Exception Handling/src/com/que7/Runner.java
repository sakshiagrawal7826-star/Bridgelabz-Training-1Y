package com.que7;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        DivisionOperation obj = new DivisionOperation();
        obj.divide(num1, num2);
        sc.close();
    }
}