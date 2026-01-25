package com.session01;

import java.util.Scanner;

public class Baitap05 {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int number = sc.nextInt();

        int thousand = number / 1000;
        int hundreds = (number % 1000) / 100;
        int dozens = ((number % 1000) % 100) / 10;
        int units = ((number % 1000) % 100) % 10;

        System.out.println("Chu so kiem tra ky vong: " + units );
        System.out.println("KKet qua kiem tra ma sach: " + ((thousand + hundreds + dozens) % 10 == units ? "HOP LE" : "SAI MA"));

    }
}
