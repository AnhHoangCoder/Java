//Gọi gcd(a,b) là thao tác tính ước số chung lớn nhất của hai số nguyên a,b.
//
//Cho dãy số A[] nguyên dương có N phần tử. Hãy xây dựng dãy số B có N+1 phần tử sao cho gcd(B[i], B[i+1]) = A[i] với mọi i thỏa mãn 1 ≤ i ≤ n. Vì có rất nhiều dãy số B[] thỏa mãn, nên bạn cần tìm được dãy số có tổng các phần tử là nhỏ nhất.
//
//        Input
//
//Dòng đầu tiên là số lượng bộ test T (1 ≤ T ≤ 10).
//Mỗi test bắt đầu bằng số nguyên N (2 ≤ N ≤ 1000).
//Dòng tiếp theo gồm N số nguyên A[i] (1 ≤ A[i] ≤ 10 000).
//Output
//
//Với mỗi test in ra dãy số B[] trên một dòng.
//
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//2
//
//
//        3
//
//
//        1 2 3
//
//
//        3
//
//
//        5 10 5
//
//
//
//        1 2 6 3
//
//
//        5 10 10 5

import java.util.Scanner;

public class J02036 {
    static long GCD(long a, long b){
        while(b != 0){
            long c = (a % b);
            a = b;
            b = c;
        }
        return a;
    }

    static long LCM(long a, long b){
        return a / GCD(a, b) * b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            long[] b = new long[n + 1];
            b[0] = a[0];
            for(int i = 1; i < n; i++){
                b[i] = LCM(a[i], a[i - 1]);
            }
            b[n] = a[n - 1];

            for(int i = 0; i < n + 1; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
