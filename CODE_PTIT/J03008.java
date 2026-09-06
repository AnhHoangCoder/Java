//Một số được coi là đẹp nếu đó là số thuận nghịch và chỉ toàn các chữ số nguyên tố. Viết chương trình đọc vào các số nguyên dương có không quá 500 chữ số và kiếm tra xem số đó có đẹp hay không.
//
//Dữ liệu vào:
//
//Dòng đầu tiên ghi số bộ test.
//
//Mỗi bộ test viết trên một dòng số nguyên dương n không quá 500 chữ số.
//
//Kết quả:
//
//Mỗi bộ test viết ra trên một dòng chữ YES nếu đó là số đẹp, chữ NO nếu ngược lại
//
//Ví dụ
//
//
//Input
//
//        Output
//
//3
//
//
//        123456787654321
//
//
//        235755557532
//
//
//        2222333355557777235775327777555533332222
//
//
//
//NO
//
//
//        YES
//
//
//YES

import java.util.*;
import java.io.*;

public class J03008 {
    static BufferedReader br;

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(String s){
        char[] a = s.toCharArray();
        int n = a.length;

        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - 1 - i]) return false;
        }
        return true;
    }

    static boolean beautifulNum(String s){
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(!isPrime(a[i] - '0')) return false;
        }

        return isPalindrome(s);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String s = br.readLine().trim();
            sb.append(beautifulNum(s) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}