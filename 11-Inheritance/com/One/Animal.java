package com.One;
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
