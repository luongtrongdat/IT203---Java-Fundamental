// Câu 1: Xử lý Chuỗi & Dữ liệu văn bản
package hackathon.de001;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Phần 1: 
        //   Nhập vào một chuỗi ký tự hỗn hợp (bao gồm chữ cái, số và ký tự đặc biệt) từ bàn phím. Ví dụ: "a1b2c d3ef 45 gh"
        //   Tách số và tính tổng: Trích xuất tất cả các ký tự số có trong chuỗi, coi các chuỗi số liên tiếp là một số nguyên, sau đó tính tổng chúng

        System.out.println("Nhap chuoi (Phan 1): ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            System.out.println("Loi: khong nhap noi dung");
        } else {
            int sum = 0;
            StringBuilder number = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    number.append(c);
                } else {
                    if (number.length() > 0) {
                        sum += Integer.parseInt(number.toString());
                        number.setLength(0);
                    }
                }
            }
            if (number.length() > 0) {
                sum += Integer.parseInt(number.toString());
            }
            System.out.println("Tong cac so trong chuoi: " + sum);
        }

        // 2. Phần 2:
        //   Đếm tần suất xuất hiện của ký tự
        //   Hãy nhập vào 1 chuỗi bất kỳ và in ra số lần xuất hiện của mỗi ký tự trong chuỗi đó (Lưu ý phân biệt chữ hoa chữ thường)

        System.out.println("Nhap chuoi (Phan 2): ");
        String input2 = sc.nextLine();
        if (input2.isEmpty()) {
            System.out.println("Loi: khong nhap noi dung");
        } else {
            int[] freq = new int[256];
            for (char c : input2.toCharArray()) {
                freq[c]++;
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    System.out.println((char)i + " : " + freq[i]);
                }
            }
        }
    }
}
