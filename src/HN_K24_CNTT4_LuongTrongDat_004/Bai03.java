package HN_K24_CNTT4_LuongTrongDat_004;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int decimalNumber = sc.nextInt();
        sc.close();
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