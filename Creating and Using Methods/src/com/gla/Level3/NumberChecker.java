package com.gla.Level3;
import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {


    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] original = storeDigits(number);
        int[] reversed = reverseArray(original);
        return compareArrays(original, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        for (int digit : digits) {
            if (digit == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = countDigits(num);
        System.out.println("Count of digits: " + count);
        int[] digits = storeDigits(num);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(reversed));
        System.out.println("Arrays equal? " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
    }
}
