// Câu 2: Kỹ thuật xử lý Mảng 1 chiều
package hackathon.de001;

import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Phần 1:
        //   Nhập vào mảng số nguyên arr gồm n phần tử
        //   Thống kê tần suất: Đếm số lần xuất hiện của từng phần tử trong mảng

        System.out.println("Nhap so phan tu mang (Phan 1): ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("So " + arr1[i] + " xuat hien: " + count + " lan");
        }

        // 2. Phần 2:
        //   Tìm phần tử lặp lại (Find Duplicate)
        //   Hãy nhập vào số phần tử và nhập vào mảng, các số nằm trong khoảng [1, n]. Có duy nhất một số bị lặp lại, hãy tìm số đó

        System.out.println("Nhap so phan tu mang (Phan 2): ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(arr2);
        System.out.println("Phan tu lap lai: " + duplicate);
    }

    public static int findDuplicate(int[] nums) {
        boolean[] exists = new boolean[nums.length + 1];
        for (int num : nums) {
            if (exists[num]) {
                return num;
            }
            exists[num] = true;
        }
        return 0;
    }
}