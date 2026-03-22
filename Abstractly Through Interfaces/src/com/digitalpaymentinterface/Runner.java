package com.digitalpaymentinterface;
public class Runner {
    public static void main(String[] args) {
        Payment p1=new Upi() ;
        Payment p2=new Wallet();
        Payment p3=new CreditCard();

        p1.pay();
        p2.pay();
        p3.pay();

    }
}
