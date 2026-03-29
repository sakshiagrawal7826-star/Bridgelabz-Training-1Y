package com.que8;
public class ExceptionPropagation {
    public void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
        System.out.println(result);
    }
    public void method2() {
        method1(); // Exception propagates to this method
    }
}