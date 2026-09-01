//Cho dãy số có N số nguyên dương khác nhau đã được sắp xếp tăng dần. Hãy liệt kê các số còn thiếu để có đủ các số trong khoảng từ 1 đến số lớn nhất trong dãy ban đầu.
//
//Input:
//
//Dòng đầu ghi số N là số con số được đếm (1 ≤ N ≤ 100)
//Các dòng tiếp theo ghi đủ N số A[i] theo thứ tự tăng dần (1 ≤ A[i] ≤ 200). Các số phân cách bởi khoảng trống hoặc xuống dòng.
//Kết quả:
//
//Nếu đã có đủ các số thì ghi ra Excellent!
//Nếu chưa đủ thì lần lượt liệt kê các số còn thiếu, mỗi số trên một dòng.
//Ví dụ:
//
//
//Input 1
//
//Output 1
//
//        4
//
//
//        1 2 3 5
//
//
//
//        4
//
//
//
//
//Input 2
//
//
//
//Output 2
//
//
//
//        7
//
//
//        4 5 7 8 9
//
//
//        10 11
//
//
//
//        1
//
//
//        2
//
//
//        3
//
//
//        6
//
//
//
//
//Input 3
//
//
//
//Output 3
//
//
//
//        5
//
//
//        1 2 3
//
//
//        4
//
//
//        5
//
//
//
//Excellent!

import java.util.Scanner;

public class J02034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i = 0; i < n; i++){
            while(count < a[i]){
                sb.append(count).append("\n");
                count++;
            }
            count = a[i] + 1;
        }

        System.out.print(sb.length() == 0 ? "Excellent!" : sb);
    }
}
