package com.que4;
public class ArrayOperations {
    private int[] arr;
    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }
    public void getValueAtIndex(int index) {
        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}