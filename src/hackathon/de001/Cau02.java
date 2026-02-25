// Câu 2: Kỹ thuật xử lý Mảng 1 chiều
// 1. Phần 1:
//   Nhập vào mảng số nguyên arr gồm n phần tử
//   Thống kê tần suất: Đếm số lần xuất hiện của từng phần tử trong mảng
//     Ví dụ: [1, 2, 1, 3, 2] --> 1 xuất hiện 2 lần, 2 xuất hiện 2 lần, 3 xuất hiện 1 lần
//     Lưu ý: In ra kết quả sao cho mỗi số chỉ liệt kê 1 lần (Tránh in lặp lại)
//  ____________________ _____________________
// |INPUT                | OUTPUT              |
// |n = 6                |Số 1 xuất hiện: 3 lần|
// |[1, 2, 1, 3, 2, 1]   |Số 2 xuất hiện: 2 lần|
// |                     |Số 3 xuất hiện: 1 lần|
// |_____________________|_____________________|
// 2. Phần 2:
//   Tìm phần tử lặp lại (Find Duplicate)
//   Hãy nhập vào số phần tử và nhập vào mảng, các số nằm trong khoảng [1, n]. Có duy nhất một số bị lặp lại, hãy tìm số đó
//  _____________________ ________________
// |INPUT                | OUTPUT         |
// |n = 5                | 2              |
// |[1, 3, 4, 2, 2]      |                |
// |_____________________|________________|
// |n = 3                | 1              |
// |[1, 1, 2]            |                |
// |_____________________|________________|
package hackathon.de001;

public class Cau02 {
    public static void main(String[] args) {
        // Phan 1
        int[] arr1 = {1, 2, 1, 3, 2, 1};
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

        // Phan 2
        int[] arr2 = {1, 3, 4, 2, 3};
        int duplicate = findDuplicate(arr2);
        System.out.println(duplicate);
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