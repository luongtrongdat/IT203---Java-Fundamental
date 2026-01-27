package com.session03;

import java.util.Scanner;

public class Baitap05 {
    static Scanner sc = new Scanner(System.in);

    public static int deleteBook(int[] arr, int size, int bookID) {
        int deleteIndex = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == bookID) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex == -1) {
            System.out.println("Không tìm thấy sách mã " + bookID);
            return size;
        }

        for (int i = deleteIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa sách mã " + bookID);
        return size - 1;
    }

    public static void main(String[] args) {
        int[] books = {1, 2, 6, 5, 8, 7};
        int size = books.length;

        int targetDel;
        do {
            System.out.println("\nKho sách hiện tại (" + size + ")");
            for (int i = 0; i < size; i++) {
                System.out.print(books[i] + " ");
            }

            System.out.print("\nNhập mã sách cần xóa (0 để thoát): ");
            targetDel = sc.nextInt();

            if (targetDel != 0) {
                size = deleteBook(books, size, targetDel);
            }

        } while (targetDel != 0);
    }
}
