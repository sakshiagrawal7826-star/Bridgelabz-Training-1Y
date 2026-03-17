package com.gla.Level1;

import java.util.Scanner;

public class CircleRunner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();

        sc.close();
    }
}