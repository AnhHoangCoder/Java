//Cho hai xâu ký tự A và B mô tả hai số nguyên dương lớn có thể có đến 1000 chữ số.
//
//Có thể có các chữ số 0 ở đầu của A và B.
//Hãy tính A - B.
//
//Kết quả có thể âm, khi ghi ra cần loại bỏ các chữ số 0 ở đầu nếu có.
//
//Tất nhiên nếu kết quả là -0 thì ghi ra là 0.
//
//Input
//
//Có hai dòng ghi 2 số A và B.
//
//Output
//
//Ghi ra kết quả A - B.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//000123456789012345678901234567890
//
//
//        00000000000000001234567890
//
//
//
//        123456789012345678900000000000

import java.io.*;
import java.util.*;

public class J03015 {
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

    static int compare(String a, String b){
        if(a.length() != b.length()){
            return (a.length() < b.length() ? -1 : 1);
        }
        return a.compareTo(b);
    }

    static String subtract(String a, String b){
        if(a == null || a.isEmpty()) return "0";
        if(b == null || b.isEmpty()) return "0";

        int k = 0;
        while(k < a.length() - 1&& a.charAt(k) == '0'){
            k++;
        }
        a = a.substring(k);

        int l = 0;
        while(l < b.length() - 1 && b.charAt(l) == '0'){
            l++;
        }
        b = b.substring(l);

        boolean flag = false;

        if(compare(a, b) < 0){
            flag = true;
            String tmp = a;
            a = b;
            b = tmp;
        }

        StringBuilder x = new StringBuilder(a).reverse();
        StringBuilder y = new StringBuilder(b).reverse();

        StringBuilder res = new StringBuilder();
        int borrow = 0;

        for(int i = 0; i < x.length(); i++){
            int d1 = x.charAt(i) - '0';
            int d2 = (i < y.length()) ? y.charAt(i) - '0' : 0;
            int sub = d1 - d2 - borrow;
            if(sub < 0){
                sub += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }
            res.append(sub);
        }
        res.reverse();
        int i = 0;
        while(i < res.length() - 1 && res.charAt(i) == '0'){
            i++;
        }

        String ans = res.substring(i);
        if(flag){
            if(ans.equals("0")){
               return ans;
            }
            else{
                return "-" + ans;
            }
        }
        else{
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String a = getToken();
        String b = getToken();

        System.out.println(subtract(a, b));
    }
}