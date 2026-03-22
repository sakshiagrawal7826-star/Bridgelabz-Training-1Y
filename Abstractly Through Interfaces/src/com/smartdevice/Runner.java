package com.smartdevice;
public class Runner {
    static void main(String[] args) {
        SmartDevice d1=new Light();
        SmartDevice d2=new Ac();
        SmartDevice d3=new Tv();
        d1.turnOn();
        d2.turnOn();
        d2.turnOn();
        d1.turnOff();
        d2.turnOff();
        d3.turnOff();
    }
}
