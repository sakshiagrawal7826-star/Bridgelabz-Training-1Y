package com.que9;
public class ArrayDivision {
    int[] arr = {10, 20, 30, 40, 50};
    public void divideElement(int index, int divisor) {
        try {
            try {
                int value = arr[index];
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}