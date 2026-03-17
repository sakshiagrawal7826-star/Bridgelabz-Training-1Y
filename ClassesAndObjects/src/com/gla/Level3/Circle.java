package com.gla.Level3;
class Circle {
    double radius;
    Circle() {
        this(1.0); // constructor chaining (calls parameterized constructor)
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void display() {
        System.out.println("Radius of circle: " + radius);
    }
}