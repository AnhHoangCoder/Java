//Cho hai xâu ký tự A và B mô tả hai số nguyên dương lớn có thể có đến 1000 chữ số.
//
//Có thể có các chữ số 0 ở đầu của A và B.
//Hãy tính tổng A + B.
//
//Kết quả ghi ra cần loại bỏ các chữ số 0 ở đầu nếu có.
//
//Input
//
//Có hai dòng ghi 2 số A và B.
//
//Output
//
//Ghi ra kết quả A + B.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//121212121212121212
//
//
//        45678978
//
//
//
//        121212121257800190

import java.io.*;
import java.util.*;

public class J03014 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "0";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static String Sum(String a, String b){
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) b = "0";

        StringBuilder x = new StringBuilder(a).reverse();
        StringBuilder y = new StringBuilder(b).reverse();

        while(x.length() < y.length()){
            x.append('0');
        }

        while(y.length() < x.length()){
            y.append('0');
        }

        StringBuilder res = new StringBuilder();
        int carry = 0;
        for(int i = 0; i < x.length(); i++){
            int d1 = x.charAt(i) - '0';
            int d2 = y.charAt(i) - '0';
            int sum = d1 + d2 + carry;
            if(sum >= 10){
                sum -= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }

            res.append(sum);
        }
        if(carry > 0){
            res.append(carry);
        }
        res.reverse();

        int i = 0;
        while(i < res.length() - 1 && res.charAt(i) == '0'){
            i++;
        }
        return res.substring(i);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String a = getToken();
        String b = getToken();

        System.out.print(Sum(a, b));
    }
}