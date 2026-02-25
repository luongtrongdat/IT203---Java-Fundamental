// Câu 1: Xử lý Chuỗi & Dữ liệu văn bản
// 1. Phần 1: 
//   Nhập vào một chuỗi ký tự hỗn hợp (bao gồm chữ cái, số và ký tự đặc biệt) từ bàn phím. Ví dụ: "a1b2c d3ef 45 gh"
//   Tách số và tính tổng: Trích xuất tất cả các ký tự số có trong chuỗi, coi các chuỗi số liên tiếp là một số nguyên, sau đó tính tổng chúng
//     Ví dụ: "abc12mn4t5" --> Lấy ra 12, 4, 5 --> Tổng = 12 + 4 + 5 = 21
// INPUT
// - "abc12mn4t5"
// - "a10b20c30"
// - "hcm05saigon007"
// - Ko nhập
// OUTPUT
// - 21
// - 60
// - 12
// - Lỗi: không nhập nội dung

// 2. Phần 2:
//   Đếm tần suất xuất hiện của ký tự
//   Hãy nhập vào 1 chuỗi bất kỳ và in ra số lần xuất hiện của mỗi ký tự trong chuỗi đó (Lưu ý phân biệt chữ hoa chữ thường)
// INPUT
// - hello

// - Java 8

// - Ko nhập
// OUTPUT
// h : 1
// 3 : 1
// l : 2
// o : 1

//   : 1  (Khoảng trắng) 
// 8 : 1 
// J : 1 
// a : 2 
// v : 1

// - Lỗi: không nhập nội dung
package hackathon.de001;

public class Cau01 {
    public static void main(String[] args) {
        // Phan 1:
        String input = "dat1abc2dat";
        int sum = 0;
        StringBuilder number = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }else {
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        System.out.println("Tong cac so trong chuoi: " + sum);
        // Phan 2:
        String input2 = "trongdat";
        int[] freq = new int[256];
        for (char c : input2.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            } else {
                if (input2.isEmpty()) {
                    System.out.println("Loi: khong nhap noi dung");
                    break;
                }
            }
        }
    }

}
