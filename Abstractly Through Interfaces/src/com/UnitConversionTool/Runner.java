package com.UnitConversionTool;
public class Runner {
    static void main(String[] args) {
        double km = 10;
        double kg = 5;
        System.out.println("km to miles: " + UnitConversion.kmtoMiles(km));
        System.out.println("miles to km: " + UnitConversion.milesToKm(6.2));
        System.out.println("Kg to pounds:" + UnitConversion.kgToPound(kg));
        System.out.println("pound to Kg: " + UnitConversion.poundToKg(11));

    }
}