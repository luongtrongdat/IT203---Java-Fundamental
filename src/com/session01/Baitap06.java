package com.session01;

import java.util.Scanner;

public class Baitap06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu tu cua sach trong he thong: ");
        int book_index = sc.nextInt();
        int book_case = (book_index / 25) + 1;
        String location = (book_case >= 1 && book_case <= 10) ? "Khu Can (Gan Cua)" : "Khu Vien";
        System.out.println("--- THONG TIN DINH VI ---");
        System.out.println("Sach so: " + book_index);
        System.out.println("Dia chi: Ke " + book_case + " - " + "Vi tri: " + book_index);
        System.out.println("Phan khu: " + location);
    }
}
