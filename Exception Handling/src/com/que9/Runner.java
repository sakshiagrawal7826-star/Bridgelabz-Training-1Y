package com.que9;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDivision obj = new ArrayDivision();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        obj.divideElement(index, divisor);
        sc.close();
    }
}