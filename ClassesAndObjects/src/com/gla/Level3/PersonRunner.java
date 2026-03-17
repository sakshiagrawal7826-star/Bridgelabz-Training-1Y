package com.gla.Level3;
public class PersonRunner {
    public static void main(String[] args) {
        Person p1 = new Person("Pallavi", 18);
        Person p2 = new Person(p1);
        System.out.println("Original Person:");
        p1.display();
        System.out.println("Copied Person:");
        p2.display();
    }
}