package com.que6;
public class InterestCalculator {

    public double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        double interest = (amount * rate * years) / 100;
        return interest;
    }
}