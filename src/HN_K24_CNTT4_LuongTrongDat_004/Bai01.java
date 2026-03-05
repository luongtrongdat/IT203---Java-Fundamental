// Sử dụng List + Thuật toán
// Xây dựng chương trình quản lý danh sách tên sinh viên. Người dùng nhập vào số lượng sinh viên và danh sách tên
// Yêu cầu:
// + Sử dụng List<String> để lưu dữ liệu
// + Phải tự viết thuật toán 
// + Chương trình cần thực hiện:
// 1. Tìm tên dài nhất(Nếu nhièu tên cùng độ dài , lấy tên xuất hiện đầu tiên)
// 2. Hiện thị danh sách tên theo thứ tự alphabet
// 3. Đếm số sinh viên có tên bắt đầu bằng chữ 'A' (Không phân biệt hoa thường)
// Input       | Output
// 5(số lượng) |   Longest name: Cuong
// An          |    Sorted list: An Anh Binh Cuong Ha
// Binh        |    Number of name starting with A: 2
// Anh         |
// Cuong       |
// Ha          |
// 0(số lượng) |   Lỗi: Số lượng sinh viên không hợp lệ

package HN_K24_CNTT4_LuongTrongDat_004;

public class Bai01 {
    public static void main(String[] args) {
        int numberStudents = 5;
        String[] names = {"An", "Binh", "Anh", "Cuong", "Ha"};
        if (numberStudents <= 0) {
            System.out.println("Loi: so luong sinh vien khong hop le");
        }
        String longestName = findLongestName(names);
        System.out.println("Longest name: " + longestName);
        String sortedNames = sortNames(names);
        System.out.println("Sorted list: " + sortNames);
        String numberOfNameStartingWithA = numberOfNameStarting(names);
        System.out.println("Number of name starting with A: " + numberOfNameStarting);
    }
    public static Sting studentsNumber(int number) {
        
    }
}
 