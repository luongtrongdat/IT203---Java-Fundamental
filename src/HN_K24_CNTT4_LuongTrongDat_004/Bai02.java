// Sử dụng Map + thuật toán
// Xây dựng chương trình thống kê tần suất xuất hiện của các số trong một dãy số nguyên nhập từ bàn phím
// Yêu cầu:
// + Sử dụng Map<Integer, Integer> để lưu dữ liệu:
//     - Key: Số nguyên
//     - Value: Số lần xuất hiện của số đó
// + Phải tự viết thuật toán:
//     - Tìm số xuất hiện nhiều nhất( nếu nhiều thì liệt kê)
//     - Sắp xếp các số theo thứ tự tăng dần
// Input                  | Output
// 10 (số lượng)          | 2 xuất hiện: 3 lần
// 10 2 3 4 2 3 5 2 3 3   | 3 xuất hiện: 4 lần
//                        | 4 xuất hiện: 1 lần
//                        | 5 xuất hiện: 1 lần
//                        | 10 xuất hiện: 1 lần
//                        | Số xuất hiện nhiều nhất: 3(4 lần)
// 0 (số lượng)           | Lỗi: Số lượng không hợp lệ

package HN_K24_CNTT4_LuongTrongDat_004;

public class Bai02 {
    public static void main(String[] arg) {
        Scanner sr = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Loi: so luong khong hop le");
            return;
        }
        Map<Integer, Integer> map = new Hashmap<>();
        for (int i = 0; i < number; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collection.sort(keys);
        for (int key : keys) {
            System.out.println(key + "xuat hien: " + map.get(key) + "lan");
        }
        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("So xuat hien nhieu nhat: ");
        boolean first = true;
        for (int key : keys) {
            if (map.get(key) == max) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(key);
                first = false;
            }
        }
        System.out.println(" (" + max + "lan)");
        sc.close();
    }
}
