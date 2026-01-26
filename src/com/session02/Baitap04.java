package com.session02;

import java.util.Scanner;

public class Baitap04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhập mã ID sách mới (> 0): ");
            id = sc.nextInt();
            if(id > 0){
                System.out.println("Xác nhận: Lưu mã sách thành công");
                break;
            }else{
                System.out.println("Lỗi: Mã phải là số dương, hãy nhập lại");
                System.out.println();
            }
        }while (id <= 0);
    }
}
