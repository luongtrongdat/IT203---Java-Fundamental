package com.session01;

import java.util.Scanner;

public class Baitap02 {
    public static double getFine(int lateDays, int bookQuantity){
        return lateDays * bookQuantity * 5000;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay cham tre: ");
        int lateDays = sc.nextInt();
        System.out.print("Nhap so luong sach muon: ");
        int borrowedBooks = sc.nextInt();

        System.out.println("Tien phat goc: " + getFine(lateDays, borrowedBooks));
        System.out.println("Tien phat sau dieu chinh: " + (lateDays > 7 && borrowedBooks >= 3 ? getFine(lateDays, borrowedBooks)*1.2 : getFine(lateDays, borrowedBooks)));
        System.out.println("Yeu cau khoa the: " + (getFine(lateDays, borrowedBooks) > 50000 ? "true" : "false"));
    }
}
