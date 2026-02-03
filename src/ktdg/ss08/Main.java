package ktdg.ss08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student08[] students = new Student08[100];
        int choice;
        int count = 0;
        do {
            System.out.print("""
                    ===== QUAN LY DIEM SINH VIEN =====
                    1. Nhap danh sach sinh vien
                    2. Hien thi danh sach sinh vien
                    3. Tim kiem sinh vien theo Hoc luc
                    4. Sap xep theo hoc luc giam dan
                    5. Thoat
                    ==================================
                    Chon chuc nang:""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int tempCount;
                    tempCount = Integer.parseInt(sc.nextLine());
                    if (tempCount > 100 || tempCount <= 0) {
                        System.out.println("Nhap trong 1->100");
                        break;
                    }
                    count = tempCount;
                    for (int i = 0; i < count; i++) {
                        System.out.println("Sinh vien thu " + (i + 1));
                        String id;
                        while (true) {
                            System.out.print("Nhap ma SV (SVxxx): ");
                            id = sc.nextLine();
                            if (id.matches("SV\\d{3}")) {
                                break;
                            }
                            System.out.println("Sai dinh dang. Vui long nhap lai.");
                        }
                        System.out.print("Nhap ten: ");
                        String name = sc.nextLine();
                        System.out.print("Nhap diem: ");
                        double score = sc.nextDouble();
                        sc.nextLine();
                        students[i] = new Student08(id, name, score);
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Danh sach rong");
                        break;
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.println(students[i].toString());
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("Danh sach rong");
                        break;
                    }
                    System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
                    String rank = sc.nextLine();
                    boolean flag = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(students[i].toString());
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Khong tim thay sinh vien phu hop!");
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("Danh sach rong");
                        break;
                    }
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student08 temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Moi nhap tu 1-5");
            }
        } while (choice != 5);
        sc.close();
    }
}
