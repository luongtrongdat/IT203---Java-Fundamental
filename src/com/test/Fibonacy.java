package com.test;

import java.util.Scanner;

public class Fibonacy {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gioi han n");
        n = sc.nextInt();

        System.out.println("Day Fibonacci tu 1 den " + n + " la: ");
        for (int f0 = 0, f1 = 1; f0 <= n; ) {
            System.out.print(f0 + " ");
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
    }
}
