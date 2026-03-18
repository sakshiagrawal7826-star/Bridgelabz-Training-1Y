package com.gla.analytics;
import com.gla.analytics.sales.SalesReport;
import com.gla.analytics.hr.EmployeeReport;
public class Runner {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();
        System.out.println("===== Company Combined Report =====\n");
        sales.showSalesData();
        hr.showEmployeeData();
    }
}