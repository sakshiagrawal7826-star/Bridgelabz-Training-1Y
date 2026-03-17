package com.gla.Level1;
public class MobilePhoneRunner {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 79999);
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}