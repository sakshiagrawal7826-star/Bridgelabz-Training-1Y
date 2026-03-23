package com.Five;
class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade + "\n");
    }
}
