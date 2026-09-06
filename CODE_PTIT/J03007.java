//Một số được coi là đẹp nếu đó là số thuận nghịch, bắt đầu và kết thúc bằng chữ số 8 và tổng chữ số chia hết cho 10. Viết chương trình đọc vào các số nguyên dương có không quá 500 chữ số và kiếm tra xem số đó có đẹp hay không.
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
//4
//
//
//        123456787654321
//
//
//        8644281154664511824468
//
//
//        8006000444400000000000044440006008
//
//
//        82123400000000000000000000000432128
//
//
//
//NO
//
//
//        NO
//
//
//YES
//
//
//        YES

import java.util.*;
import java.io.*;

public class J03007 {
    static BufferedReader br;

    static boolean palindromeNum(String s){
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - 1 - i]){
                return false;
            }
        }
        return true;
    }

    static boolean numBeautiful(String s){
        char[] a = s.toCharArray();
        int n = a.length;

        if(a[0] != '8' || a[n - 1] != '8') return false;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (a[i] - '0');
        }
        return palindromeNum(s) && (sum % 10 == 0);
    }
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            String s = br.readLine().trim();
            sb.append(numBeautiful(s) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}