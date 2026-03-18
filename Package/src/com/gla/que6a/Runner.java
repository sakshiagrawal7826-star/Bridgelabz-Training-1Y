package com.gla.que6a;
import com.gla.que6a.hr.*;
import com.gla.que6a.payroll.Payroll;
public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(53, "Sakshi", "IT", 90000);
        System.out.println("Before Bonus:");
        emp.display();
        Payroll p = new Payroll();
        p.calculateBonus(emp);
        System.out.println("\nAfter Bonus:");
        emp.display();
    }
}
