//Cho trước một xâu S. Bạn thay đổi đúng 1 kí tự. Hãy kiểm tra xem liệu bạn có thể tạo ra được xâu đối xứng hay không.
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T <= 20).
//
//Mỗi test gồm 1 xâu S có độ dài không quá 15 kí tự.
//
//Output:
//
//Với mỗi test, in ra “YES” nếu có thể biến đổi xâu S thành xâu đối xứng, in ra “NO” trong trường hợp ngược lại.
//
//
//
//Ví dụ:
//
//
//Input:
//
//Output
//
//3
//
//
//abccaa
//
//
//        abbcca
//
//
//abcda
//
//
//
//
//
//
//        YES
//
//
//NO
//
//
//        YES

import java.util.*;
import java.io.*;

public class J03025 {
    static BufferedReader br;

    static boolean isPalindrome(String s){
        int n = s.length();
        int l = 0, r = n - 1;
        int miss = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                miss++;
            }
            l++; r--;
        }

        if(miss == 1) return true;
        if(miss == 0) return (n % 2 == 1);
        return false;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            String s =  br.readLine().trim();
            sb.append(isPalindrome(s) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}