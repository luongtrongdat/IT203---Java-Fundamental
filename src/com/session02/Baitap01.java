package com.session02;

import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đang mượn: ");
        int borrowedBooks = sc.nextInt();

        System.out.print("Kết quả: ");
        if(age >= 18 && borrowedBooks <= 3){
            System.out.println("Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm.");
            return;
        };
        if(age < 18){
            System.out.println("Không đủ điều kiện.");
            System.out.println("- Lý do: Bạn phải từ 18 tuổi trở lên.");
            return;
        };
        if(borrowedBooks > 3){
            System.out.println("Không đủ điều kiện.");
            System.out.println("- Lý do: Bạn đã mượn tối đa 3 quyển.");
            return;
        }

    }
}
