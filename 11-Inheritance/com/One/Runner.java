package com.One;
public class Runner {
    public static void main(String[] args) {
        Animal a1 = new Dog("chiki", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);
        a1.displayInfo();
        a1.makeSound();
        a2.displayInfo();
        a2.makeSound();
        a3.displayInfo();
        a3.makeSound();
    }
}
