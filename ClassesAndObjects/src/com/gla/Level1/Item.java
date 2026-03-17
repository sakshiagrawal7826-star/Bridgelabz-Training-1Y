package com.gla.Level1;
import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
