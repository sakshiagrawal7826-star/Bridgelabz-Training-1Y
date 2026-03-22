package com.multivehicle;
public class Car implements Vehicle {
    public void rent(){
        System.out.println("the rented car");
    }
    public void returnVehicle(){
        System.out.println("Car returned");
    }
}
