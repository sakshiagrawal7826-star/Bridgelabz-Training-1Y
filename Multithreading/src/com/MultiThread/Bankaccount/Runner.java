package com.MultiThread.Bankaccount;


public class Runner {
    public static void main(String[] args) {
        BankAccount pre=new BankAccount("Sac","Premium");
        BankAccount reg=new BankAccount("XYZ","Regular");
        BankAccount bas=new BankAccount("ABC","Basic");
        Thread t1=new Thread(pre);
        Thread t2=new Thread(reg);
        Thread t3=new Thread(bas);
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}