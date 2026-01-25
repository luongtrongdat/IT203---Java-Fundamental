package com.session01;

import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        String bookName = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhap gia tien: ");
        double price = scanner.nextDouble();
        System.out.print("Sach con trong kho (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        int bookAge = 2026 - publishYear;
        String status = isAvailable ? "Con sach" : "Da muon";

        System.out.println("\n--- PHIEU THONG TIN SACH ---");
        System.out.println("Ten sach: " + bookName.toUpperCase());
        System.out.println("Ma sach: " + bookID);
        System.out.printf("Gia tien: %.2f VND\n", price);
        System.out.println("Tuoi tho sach: " + bookAge + " nam");
        System.out.println("Tinh trang: " + status);

        scanner.close();
    }
}
