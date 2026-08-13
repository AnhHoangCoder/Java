//Cho số nguyên dương n. Hãy kiểm tra xem n có phải là số trong dãy Fibonacci hay không?
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test là một số nguyên dương n.
//        T, n thỏa mãn ràng buộc :1 ≤ T ≤ 100; 0≤n≤1018.
//Output:
//
//Đưa ra “YES” hoặc “NO” tương ứng với n là số Fibonacci hoặc không phải số Fibonacci của mỗi test theo từng dòng.
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
//        8
//
//
//        15
//
//
//
//YES
//
//
//        NO

import java.util.Scanner;

public class J01007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(check(n) ? "YES" : "NO");
        }
    }
    public static boolean check(long n){
        long a = 0, b = 1;
        while(a < n){
            long c = a + b;
            a = b;
            b = c;
        }
        return (a == n);
    }
}
