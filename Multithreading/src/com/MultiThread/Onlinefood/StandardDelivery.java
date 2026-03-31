package com.MultiThread.Onlinefood;


public class StandardDelivery extends Order implements Runnable{
    public StandardDelivery(int ordId,String restName,int dilTime){
        super(ordId,restName,dilTime);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(dilTime*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order ID: "+ordId+"\nRestaurant name: "+restName+"\nDelivery time: "+dilTime);
    }
}
