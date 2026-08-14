//Tìm bội số chung nhỏ nhất và ước số chung lớn nhất của hai số nguyên dương a, b.
//
//Input:
//
//Dòng đầu tiên đưa vào T là số lượng bộ test.
//T dòng tiếp theo mỗi dòng có một cặp số a, b.
//        T, a, b thỏa mãn ràng buộc: 1≤T≤100; 1≤a, b≤108;
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
//
//
//Input
//
//        Output
//
//2
//
//
//        5 10
//
//
//        14 8
//
//
//
//        10 5
//
//
//        56 2

import java.util.Scanner;

public class J01011 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.printf("%d %d%n", LCM(a, b), GCD(a, b));
        }
    }
    public static long GCD(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long LCM(long a, long b){
        return a / GCD(a, b) * b;
    }
}
