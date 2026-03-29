package com.que4;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        ArrayOperations obj = new ArrayOperations(arr);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        obj.getValueAtIndex(index);
    }
}