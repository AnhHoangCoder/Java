//Viết chương trình tính tổng S = 1 + 1.2 + 1.2.3 +   ...+1.2.3...n.
//
//
//Dữ liệu vào chỉ có một dòng ghi số n không quá 20.
//
//
//Kết quả cũng được ghi trên một dòng duy nhất.
//
//
//
//
//Input
//
//
//
//        Output
//
//
//
//3
//
//
//
//        9

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long S = 0, fact = 1;
        for (long i = 1; i <= n; i++) {
            fact *= i;
            S += fact;
        }
        System.out.println(S);
    }
}
