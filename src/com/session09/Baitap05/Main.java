package com.session09.Baitap05;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee05> employees = new ArrayList<>();

        Employee05 officeEmployee1 = new OfficeEmployee("Nguyen Van A", 12000000);
        Employee05 officeEmployee2 = new OfficeEmployee("Nguyen Thi B", 10000000);
        Employee05 productEmployee1 = new ProductionEmployee("Tran Van C", 15000000);
        Employee05 productEmployee2 = new ProductionEmployee("Nguyen Van D", 8000000);

        employees.add(officeEmployee1);
        employees.add(officeEmployee2);
        employees.add(productEmployee1);
        employees.add(productEmployee2);

        double totalSalary = 0;
        for (Employee05 e : employees){
            e.display();
            totalSalary += e.calculateSalary();
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Tổng lương nhân viên: " + nf.format(totalSalary));
    }
}
