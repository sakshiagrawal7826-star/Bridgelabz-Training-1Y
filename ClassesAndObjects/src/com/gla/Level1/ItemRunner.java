package com.gla.Level1;

import java.util.Scanner;

public class ItemRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        Item item = new Item(code, name, price);
        System.out.println("\n--- Item Details ---");
        item.displayItem();
        double total = item.calculateTotalCost(quantity);
        System.out.println("Total Cost: " + total);

        sc.close();
    }
}

