package com.session07;

public class Baitap01 {
    public static void main(String[] args){
        Student07 student1 = new Student07("SD001", "Nguyen Van A");
        Student07 student2 = new Student07("SD002", "Nguyen Van B");

        System.out.println("Thông tin sinh viên: ");
        student1.showStudentInfo();
        student2.showStudentInfo();

        System.out.println("\nTổng số sinh viên đã tạo: " + Student07.studentQuantity());
    }
}
