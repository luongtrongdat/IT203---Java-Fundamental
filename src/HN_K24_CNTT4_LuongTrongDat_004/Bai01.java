package HN_K24_CNTT4_LuongTrongDat_004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int numberStudents;
        try {
            numberStudents = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Loi: so luong sinh vien khong hop le");
            sc.close();
            return;
        }

        if (numberStudents <= 0) {
            System.out.println("Loi: so luong sinh vien khong hop le");
            sc.close();
            return;
        }

        List<String> names = new ArrayList<>();
        System.out.println("Nhap danh sach ten sinh vien:");
        for (int i = 0; i < numberStudents; i++) {
            names.add(sc.nextLine());
        }
        String longestName = findLongestName(names);
        System.out.println("Longest name: " + longestName);

        Collections.sort(names);
        System.out.print("Sorted list: ");
        System.out.println(String.join(" ", names));

        long count = countNamesStartingWithA(names);
        System.out.println("Number of name starting with A: " + count);

        sc.close();
    }

    public static String findLongestName(List<String> names) {
        if (names == null || names.isEmpty()) {
            return "";
        }
        String longest = names.get(0);
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    public static long countNamesStartingWithA(List<String> names) {
        long count = 0;
        for (String name : names) {
            if (name != null && !name.isEmpty() && name.toLowerCase().startsWith("a")) {
                count++;
            }
        }
        return count;
    }
}