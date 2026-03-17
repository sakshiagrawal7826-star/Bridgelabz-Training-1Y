package com.gla.Level2;
import java.util.Scanner;
public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        Student student = new Student(name, rollNumber, marks);
        System.out.println("\n--- Student Report ---");
        student.displayDetails();

        sc.close();
    }
}
