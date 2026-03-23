package com.Six;
public class Runner {
    public static void main(String[] args) {
        Worker w1 = new Chef("Abhi", 101, "Italian Cuisine");
        Worker w2 = new Waiter("Krish", 102, 6);
        w1.performDuties();
        w2.performDuties();
    }
}
