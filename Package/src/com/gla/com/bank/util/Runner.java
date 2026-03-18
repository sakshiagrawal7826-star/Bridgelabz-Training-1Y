package com.gla.com.bank.util;
import com.gla.com.bank.util.InterestCalculator;
public class Runner {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 6;
        double time = 2;
        double si = InterestCalculator.calculateSimpleInterest(principal, rate, time);
        double ci = InterestCalculator.calculateCompoundInterest(principal, rate, time);
        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
    }
}