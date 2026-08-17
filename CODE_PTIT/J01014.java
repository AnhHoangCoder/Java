//Cho số nguyên dương N. Hãy đưa ra ước số nguyên tố lớn nhất của N.
//
//        Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test ghi số nguyên dương N.
//T, N thỏa mãn ràng buộc: 1≤T≤100; 2≤N≤1010.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
//
//
//Input:
//
//Output:
//
//        2
//
//
//        315
//
//
//        31
//
//
//
//        7
//
//
//        31

import java.util.Scanner;

public class J01014 {
    public static long max_prime(long n){
        long ans = 1;
        while(n % 2 == 0){
            ans = 2;
            n /= 2;
        }

        long i = 3;
        while(i * i <= n){
            while(n % i == 0){
                ans = i;
                n /= i;
            }
            i += 2;
        }

        if(n > 1){
            ans = n;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(max_prime(n));
        }
    }
}
