package com.session09.Baitap01;

public class Student09 extends Person{
    private String studentId;
    private double avgMark;

    public Student09() {
        super();
    }

    public Student09(String fullname, int age, String studentId, double avgMark) {
        super(fullname, age);
        this.studentId = studentId;
        this.avgMark = avgMark;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mã sinh viên: " + this.studentId);
        super.displayInfo();
        System.out.println("Điểm trung bình: " + this.avgMark);
    }
}