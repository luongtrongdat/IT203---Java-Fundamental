package HN_K24_CNTT4_LuongTrongDat_004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Loi: so luong khong hop le");
            sc.close();
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Nhap day so:");
        for (int i = 0; i < number; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (int key : keys) {
            System.out.println(key + " xuat hien: " + map.get(key) + " lan");
        }

        int max = 0;
        if (!map.isEmpty()) {
            max = Collections.max(map.values());
        }

        System.out.print("So xuat hien nhieu nhat: ");
        List<String> appearTheMost = new ArrayList<>();
        for (int key : keys) {
            if (map.get(key) == max) {
                appearTheMost.add(String.valueOf(key));
            }
        }
        if (!appearTheMost.isEmpty()) {
            System.out.print(String.join(", ", appearTheMost));
            System.out.println(" (" + max + " lan)");
        }
        sc.close();
    }
}
