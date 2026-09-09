//Hãy tính giá trị biểu thức
//
//
//
//Input:
//
//Dòng đầu là số lượng bộ test T (T ≤ 100).
//Mỗi test gồm một xâu biểu diễn số nguyên n, n có không quá 100 000 kí tự.
//Output:
//
//Với mỗi test in ra đáp án tìm được trên một dòng.
//Ví dụ:
//
//
//Input:
//
//Output
//
//2
//
//
//        4
//
//
//        123456789
//
//
//
//        4
//
//
//        0

import java.io.*;
import java.util.*;

public class J03018 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()) {
            String line = br.readLine();
            if(line == null) return "0";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            String s = getToken();
            int mod4 = 0;
            for(char c : s.toCharArray()){
                mod4 = (mod4 * 10 + (c - '0')) % 4;
            }
            int[] a2 = {1, 2, 4, 3};
            int[] a3 = {1, 3, 4, 2};
            int[] a4 = {1, 4, 1, 4};

            int sum = (a2[mod4] +  a3[mod4] + a4[mod4] + 1) % 5;
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}