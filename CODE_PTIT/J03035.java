//Cho hai số nguyên dương A, B có cùng số chữ số, trong đó số A đã bị ẩn đi một số vị trí với dấu ?.
//
//Hãy đếm xem từ số A như vậy có thể tạo được bao nhiêu số lớn hơn B bằng cách điền chữ số bất kỳ vào vị trí ?. Các chữ số điền vào các vị trí ? khác nhau có thể khác nhau.
//
//Input
//
//Dòng đầu ghi số bộ test.
//
//Mỗi test viết trên hai dòng số A và số B, không quá 10 chữ số. Trong đó số A có một số vị trí được ẩn đi với dấu ?.
//
//Output
//
//Với mỗi test, ghi ra số lượng các số tạo được từ A cho giá trị lớn hơn B.
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
//        36?1?8
//
//
//        236428
//
//
//        8?3
//
//
//        910
//
//
//        ?
//
//
//        5
//
//
//
//        100
//
//
//        0
//
//
//        4

import java.util.*;
import java.io.*;

public class J03035 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return " ";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static int solve(String A, String B){
        int n = A.length();
        int[] suffix = new int[n + 1];
        for(int i = n - 1; i >= 0; i--){
            suffix[i] = suffix[i + 1] + ((A.charAt(i) == '?') ? 1 : 0);
        }
        int ans = 0;
        int equal = 1;
        for(int i = 0; i < n; i++){
            if(equal == 0) break;
            int rest = (int)Math.pow(10, suffix[i + 1]);
            if(A.charAt(i) == '?'){
                int b = Integer.parseInt(B.charAt(i) + "");
                int cnt_slot = 9 - b;
                ans += equal * cnt_slot * rest;
            }
            else{
                int a = Integer.parseInt(A.charAt(i) + "");
                int b = Integer.parseInt(B.charAt(i) + "");

                if(a > b){
                    ans += equal * rest;
                    equal = 0;
                }
                else if(a < b){
                    equal = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            String a = getToken();
            String b = getToken();
            sb.append(solve(a, b)).append("\n");
        }
        System.out.print(sb);
    }
}