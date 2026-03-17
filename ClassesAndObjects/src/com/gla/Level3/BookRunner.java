package com.gla.Level3;
public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Book created using Default Constructor:");
        b1.displayBook();
        System.out.println();
        Book b2 = new Book("Java Programming", "James Gosling", 500);
        System.out.println("Book created using Parameterized Constructor:");
        b2.displayBook();
    }
}