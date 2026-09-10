//Xâu con của một xâu ký tự S được tạo ra bằng cách lấy một hoặc nhiều ký tự trong S và giữ nguyên thứ tự ban đầu.
//
//Cho xâu S chỉ bao gồm các chữ cái viết thường. Hãy in ra xâu con có thứ tự từ điển là lớn nhất.
//
//        Input
//
//Chỉ có xâu ký tự S, độ dài không quá 100000. Không có khoảng trống.
//
//Output
//
//Ghi ra xâu con có thứ tự từ điển lớn nhất.
//
//        Ví dụ
//
//Input
//
//        Output
//
//ababba
//
//
//        bbba
//
//
//abbcbccacbbcbaaba
//
//
//        cccccbba

import java.util.*;
import java.io.*;

public class J03019 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String Line = br.readLine();
            if(Line == null) return "0";
            tok = new StringTokenizer(Line);
        }
        return tok.nextToken();
    }

    static String xau_con(String s){
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = a.length;
        char tmp = a[n - 1];
        sb.append(tmp);
        for(int i = n - 2; i >= 0; i--){
            if(a[i] >= tmp){
                sb.append(a[i]);
                tmp = a[i];
            }
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String s = getToken();
        System.out.println(xau_con(s));
    }
}