package com.gla.Level2;
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display() {
        System.out.println("Balance: " + balance);
    }
}
