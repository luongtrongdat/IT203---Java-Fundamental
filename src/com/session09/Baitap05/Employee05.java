package com.session09.Baitap05;

import java.text.NumberFormat;

public class Employee05 {
    public String fullname;
    public double salary;

    public Employee05(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public void display(){
        System.out.println("\nHọ tên: " + this.fullname);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Lương cơ bản: " + nf.format(this.calculateSalary()));
    }

    public double calculateSalary(){
        return this.salary;
    }
}
