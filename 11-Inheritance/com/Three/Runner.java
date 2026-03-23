package com.Three;
public class Runner {
    public static void main(String[] args) {
        Author book1 = new Author(
                "The Great Gatsby",
                1925,
                "F. Scott Fitzgerald",
                "American novelist and short story writer"
        );
        book1.displayInfo();
    }
}
