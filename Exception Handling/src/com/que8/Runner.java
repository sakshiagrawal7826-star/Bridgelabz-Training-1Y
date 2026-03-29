package com.que8;
import com.que8.ExceptionPropagation;
public class Runner {
    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        try {
            obj.method2(); // Calling method2
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}