//Cho hai số rất lớn X và Y được biểu diễn như hai xâu ký tự. Nhiệm vụ của bạn là tìm |X-Y|?
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng test T.
//Những dòng kế tiếp đưa vào các bộ test. Mỗi test gồm hai dòng: dòng thứ nhất đưa xâu X; dòng tiếp theo đưa vào xâu Y.
//        T, X, Y  thỏa mãn ràng buộc : 1≤T≤100; 0≤length(X), length(Y)≤103.
//Output:
//
//Đưa ra số kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
//Input:
//
//Output:
//
//        2
//        978
//
//
//        12977
//
//
//        100
//
//
//        1000000
//
//
//
//        11999
//
//
//        0999900

import java.io.*;
import java.util.*;

public class J03013 {
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
        if(a == null || a.isEmpty()) a = "0";
        if(b == null || b.isEmpty()) b = "0";

        if(compare(a, b) > 0){
            String tmp = a;
            a = b;
            b = tmp;
        }

        StringBuilder x = new StringBuilder(a).reverse();
        StringBuilder y = new StringBuilder(b).reverse();

        while(x.length() < y.length()){
            x.append('0');
        }
        while(y.length() < x.length()){
            y.append('0');
        }

        StringBuilder res = new StringBuilder();
        int borrow = 0;
        for(int i = 0; i < x.length(); i++){
            int d1 = x.charAt(i) - '0';
            int d2 = y.charAt(i) - '0';
            int sub = d2 - d1 - borrow;
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
        return res.toString();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            String x = getToken();
            String y = getToken();
            sb.append(subtract(x , y)).append("\n");
        }
        System.out.print(sb);
    }
}