package com.test;

import java.util.Scanner;

public class Tamgiaccan {
    public static void main(String[] args) {
        int sodong;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong cua tam giac");
        sodong = sc.nextInt();

        System.out.println("Hinh tam giac" + sodong + " dong la: ");
        for (int i = 1; i <= sodong; i++) {
            int sosao = 2 * i - 1;
            for (int j = 1; j <= sodong - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= sosao; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
