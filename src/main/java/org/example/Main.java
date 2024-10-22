package org.example;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalariedWorker a= new SalariedWorker( "John", 1000);
        EmployeeOnStaff b= new EmployeeOnStaff( "Jane", 28, 2000);
        EmployeeOnStaff b1= new EmployeeOnStaff( "Jin", 27, 1000);
        EmployeeOnStaff b2= new EmployeeOnStaff( "Mary", 28, 300);
        EmployeeWithRate c= new EmployeeWithRate( "Bob", 27, 3);

        System.out.println(a.Salary(4));
        System.out.println(b.Salary());
        System.out.println(c.Salary());

        Company company= new Company("company", b, b1, b2);
        List<EmployeeOnStaff>employees= company.getTopSalaryStaff(2);
        for (EmployeeOnStaff employee : employees) {
            employee.getName();
        }

        System.out.println();

        List<EmployeeOnStaff>employees1= company.getLowestSalaryStaff(2);
        for (EmployeeOnStaff employee : employees1) {
            employee.getName();
        }
    }
}