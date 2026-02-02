package com.session07;

public class Student07 {
    public String studentId;
    public String fullname;
    public static int totalStudent = 0;

    public Student07(String studentId, String fullname) {
        this.studentId = studentId;
        this.fullname = fullname;
        totalStudent++;
    }

    public void showStudentInfo(){
        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Tên sinh viên: " + this.fullname);
    }
    public static int studentQuantity(){
        return totalStudent;
    }
}
