package com.gla.Level3;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    public CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
        costPerDay = 0;
    }
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}