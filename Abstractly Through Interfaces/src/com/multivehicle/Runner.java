package com.multivehicle;
public class Runner {
    static void main(String[] args) {
        Vehicle v1=new Bike();
        Vehicle v2=new Bus();
        Vehicle v3=new Car();
        v1.rent();
        v2.rent();
        v3.rent();
        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
