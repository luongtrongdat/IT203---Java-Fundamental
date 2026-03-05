package HN_K24_CNTT4_LuongTrongDat_004;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Loi: so luong khong hop le");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
    }
}
