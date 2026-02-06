package com.session09.Baitap05;

public class ProductionEmployee extends Employee05{

    public ProductionEmployee(String fullname, double salary) {
        super(fullname, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary * 90/100;
    }
}