//Cho số nguyên dương N.
//
//Hãy tính S = 1 + 2 + ... + N
//
//Dữ liệu vào:
//
//Dòng đầu ghi số bộ test, không quá 10
//Mỗi dòng ghi một số nguyên dương N, không quá 10^9
//Kết quả:
//
//Với mỗi test, ghi kết quả trên một dòng.
//
//Ví dụ:
//
//
//Input
//
//Output
//
//2
//
//
//10
//
//
//20
//
//
//
//55
//
//
//210

import java.util.Scanner;

public class J01002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            System.out.println(tong(n));
            t--;
        }
    }
    public static long tong(long n){
        return n*(n+1)/2;
    }
}
