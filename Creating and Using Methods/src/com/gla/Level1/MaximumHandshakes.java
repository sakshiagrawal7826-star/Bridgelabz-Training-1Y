package com.gla.Level1;
import java.util.Scanner;
public class MaximumHandshakes {
    public static int calculateHandshakes(int n) {
        return(n*(n-1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents =sc.nextInt();
        int result =
                calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " +result);
    }
}
