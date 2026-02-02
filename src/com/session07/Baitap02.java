package com.session07;

public class Baitap02 {
    public static void main(String[] args){
        int birthYear = 2006;
        Student07 newStudent = new Student07("SV003", "Tran Thi C");


        int clonebBirthYear = birthYear;
        Student07 cloneNewStudent = newStudent;

        // Thay doi gia tri
        birthYear = 2005;
        newStudent.fullname = "Bui Van C";


        // In ra sau khi thay doi
        System.out.println("Sinh viên mới clone: ");
        cloneNewStudent.showStudentInfo();
        System.out.println("Sinh viên mới: ");
        newStudent.showStudentInfo();

        System.out.println("\nNăm sinh clone: " + clonebBirthYear);
        System.out.println("Năm sinh: " + birthYear);

    }
}
