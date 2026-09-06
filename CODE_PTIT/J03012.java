//Cho hai số rất lớn X và Y được biểu diễn như hai xâu ký tự. Nhiệm vụ của bạn là tìm X+Y?
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
//        1
//        12
//
//
//        198111
//
//
//
//        198123

import java.io.*;
import java.util.*;

//C1: Used BigInteger
//import java.math.BigInteger;
//
//public class J03011 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        int t = sc.nextInt();
//
//        while(t-->-1){
//            BigInteger a = new BigInteger(sc.next());
//            BigInteger b = new BigInteger(sc.next());
//            sb.append((a.add(b))).append("\n");
//        }
//        System.out.print(sb);
//        sc.close();
//    }
//}

//C2: ;)
public class J03012 {
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

        while(x.length() < y.length()) x.append('0');
        while(y.length() < x.length()) y.append('0');

        StringBuilder res = new StringBuilder();
        int carry = 0;
        for(int i = 0; i < x.length(); i++){
            int sum = (x.charAt(i)-'0') + (y.charAt(i)-'0') + carry;
            carry = sum >= 10 ? 1 : 0;
            res.append(sum % 10);
        }
        if(carry > 0) res.append(carry);

        res.reverse();
        int i = 0;
        while(i < res.length() - 1 && res.charAt(i) == '0') i++;
        return res.substring(i);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String x = getToken();
            String y = getToken();
            sb.append(Sum(x, y)).append("\n");
        }
        System.out.print(sb);
    }
}