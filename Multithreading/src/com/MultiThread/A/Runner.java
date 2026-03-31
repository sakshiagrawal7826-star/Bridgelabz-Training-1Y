package com.MultiThread.A;


public class Runner {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.setPriority(10);
        b.setPriority(1);
        a.start();
        b.start();
    }
}