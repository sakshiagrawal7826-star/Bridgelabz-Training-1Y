package com.MultiThread.Bankaccount;
public class BankAccount implements Runnable {
    String AccHolder;
    String AccType;

    public BankAccount(String AccHolder, String AccType) {
        this.AccHolder = AccHolder;
        this.AccType = AccType;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Account Holder:" + AccHolder + "\n"+"Account Type: " + AccType);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}