package com.session01;

import java.util.Scanner;

public class Baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gia sach: ");
        double bookPrice = sc.nextDouble();

        System.out.print("Nhap ty gia: ");
        float exchangeRate = sc.nextFloat();

        double totalVnd = bookPrice * exchangeRate;

        System.out.println("Gia chinh xac: " + totalVnd);

        long result = (long) totalVnd;

        System.out.println("Gia lam tron de thanh toan: " + result);

        sc.close();
    }
}