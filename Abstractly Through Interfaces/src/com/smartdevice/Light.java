package com.smartdevice;
public class Light implements SmartDevice{
    public void turnOn(){
        System.out.println("light is on");
    }
    public void turnOff(){
        System.out.println("light is off");
    }
}
