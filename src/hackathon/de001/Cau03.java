// Câu 3: Tư duy Thuật toán nâng cao
// Mảng con:
// Cho mảng A[] gồm N phần tử, mảng B gồm M phần tử. Nhiệm vụ của bạn là xác định xem B có phải là một mảng con (không cần liên tiếp nhưng cần giữ đúng thứ tự các phần tử) của mảng A hay không
package hackathon.de001;

public class Cau03 {
    public static void main(String[] args) {
        int[] A = { 3, 6, 10, 10, 10, 2, 8, 4, 2, 1, 9, 4, 2, 1, 6, 3};
        int[] B = { 4, 5};
        int N = A.length;
        int M = B.length;
        int i = 0, j = 0;
        while (i < N && j < M){
            if (A[i] == B[j]) {
                j++;
                i++;
            } else {
                i++;
            }
        }
        if (j == M) {
            System.out.println("Mang B la mang con cua mang A");
        } else {
            System.out.println("Mang B khong phai la mang con cua mang A");
        }
    }
}
