package com.session09.Baitap05;

public class OfficeEmployee extends Employee05 {

    public OfficeEmployee(String fullname, double salary) {
        super(fullname, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary * 100/100;
    }
}
