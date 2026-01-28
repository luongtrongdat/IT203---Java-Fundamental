package com.session04;

import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        String[] splitString = author.split(" ");
        StringBuilder authorResult = new StringBuilder();
        for (String e : splitString){
            String name = e.toUpperCase().charAt(0) + e.substring(1, e.length()).toLowerCase() + " ";
            authorResult.append(name);
        }

        String result = "[" + title.toUpperCase() + "]" + " - " + "Tác giả: " + authorResult;
        System.out.println(result);

    }
}
