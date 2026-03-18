package com.gla.que6a.payroll;
import com.gla.que6a.hr.Employee; // single import
public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}