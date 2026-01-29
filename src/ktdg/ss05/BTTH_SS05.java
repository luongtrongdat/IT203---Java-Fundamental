package ktdg.ss05;

import java.util.Scanner;

public class BTTH_SS05 {
    public static void main(String[] args) {
        String[] studentIds = new String[100];
        Scanner sc = new Scanner(System.in);
        int choose;
        int n = 0;
        do {
            System.out.println("""
                    1.	Hien thi
                    2.	Them moi (Co Regex)
                    3.	Cap nhat
                    4.	Xoa mot MSSV cu the
                    5.	Tim kiem (Regex)
                    6.	Thoat
                    """);
            System.out.print("Moi nhap lua chon: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    if (n == 0) {
                        System.out.println("Danh sach trong");
                        break;
                    }
                    System.out.println("Danh sach MSSV hien co:");
                    System.out.println("------------------");
                    System.out.println("| STT | MSSV     |");
                    System.out.println("------------------");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("| %-3d | %s |\n", i + 1, studentIds[i]);
                        System.out.println("------------------");
                    }
                    break;
                case 2:
                    if (n == 100) {
                        System.out.println("Danh sach day");
                        break;
                    }
                    String id;
                    while (true) {
                        System.out.print("Nhap MSSV moi: ");
                        id = sc.nextLine().trim();
                        if (id.matches("^B\\d{7}$")) {
                            System.out.println("MSSV hop le: " + id);
                            studentIds[n] = id;
                            n++;
                            break;
                        } else {
                            System.out.println("MSSV khong hop le!");
                            System.out.println("MSSV phai bat dau bang chu B, theo sau la dung 7 chu so (Vi du: B2101234)");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap vi tri (index) can sua: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= n || index < 0) {
                        System.out.println("Vi tri khong hop le");
                        break;
                    }
                    String temp;
                    while (true) {
                        System.out.print("Nhap MSSV moi: ");
                        temp = sc.nextLine().trim();
                        if (temp.matches("^B\\d{7}$")) {
                            System.out.println("MSSV hop le: " + temp);
                            studentIds[index] = temp;
                            break;
                        } else {
                            System.out.println("MSSV khong hop le!");
                            System.out.println("MSSV phai bat dau bang chu B, theo sau la dung 7 chu so (Vi du: B2101234)");
                        }
                    }
                    break;
                case 4:
                    if (n == 0) {
                        System.out.println("Danh sach trong");
                        break;
                    }
                    System.out.print("Nhap MSSV can xoa: ");
                    String deleteId = sc.nextLine().trim();
                    int indexDelete = -1;
                    for (int i = 0; i < n; i++) {
                        if (studentIds[i].equals(deleteId)) {
                            indexDelete = i;
                            break;
                        }
                    }
                    if (indexDelete == -1) {
                        System.out.println("Khong tim thay MSSV can xoa!");
                    } else {
                        for (int i = indexDelete; i < n - 1; i++) {
                            studentIds[i] = studentIds[i + 1];
                        }
                        n--;
                        System.out.println("Xoa MSSV thanh cong!");
                    }
                    break;
                case 5:
                    if (n == 0) {
                        System.out.println("Danh sach trong");
                        break;
                    }
                    System.out.print("Moi ban nhap chuoi can tim: ");
                    String keyword = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (studentIds[i].toLowerCase().contains(keyword)) {
                            System.out.println(studentIds[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay MSSV phu hop!");
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
            }
        } while (choose != 6);
    }
}
