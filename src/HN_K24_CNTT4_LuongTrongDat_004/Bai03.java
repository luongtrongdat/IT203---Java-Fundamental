// Sử dụng Strack
// Viết chương trình chuyển đổi một số thập phân( nguyên không âm) sang nhị phân bằng cách sử dụng Stack
// Yêu cầu:
// + Sử dụng Stack<Integer> để lưu dữ liệu
// + Phải tự viết thuật toán chuyển đổi
// + In ra kết quả nhị phân tương ứng
// Input       | Output
// 10          | 1010
// 0           | 0
// -5          | Lỗi: Số không hợp lệ

package HN_K24_CNTT4_LuongTrongDat_004;

public class Bai03 {
    public static void main(String[] args) {
        int decimalNumber = -44;
        String binaryResult = convertDecimalToBinary(decimalNumber);
        System.out.println("So nhi phan tuong ung: " + binaryResult);
    }
    public static String convertDecimalToBinary(int decimal) {
        if (decimal < 0) {
            return "Loi: so khong hop le";
        }
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }
}