package com.gla.Level2;
import java.util.Scanner;
public class BankAccountRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        BankAccount acc = new BankAccount(name, accNo, bal);
        System.out.print("Enter Deposit Amount: ");
        acc.deposit(sc.nextDouble());
        System.out.print("Enter Withdraw Amount: ");
        acc.withdraw(sc.nextDouble());
        acc.display();
    }
}