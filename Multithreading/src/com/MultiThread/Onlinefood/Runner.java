package com.MultiThread.Onlinefood;
public class Runner {
    public static void main(String[] args) {
        EconomicDelivery ec=new EconomicDelivery(1,"ABC",5);
        ExpressDelivery ex=new ExpressDelivery(2,"XYZ",6);
        StandardDelivery s=new StandardDelivery(3,"TDF",7);

        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(ec);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}