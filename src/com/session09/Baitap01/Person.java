package com.session09.Baitap01;

public class Person {
    public String fullname;
    public int age;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Họ tên: " + this.fullname);
        System.out.println("Tuổi: " + this.age);
    }
}
