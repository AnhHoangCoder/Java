//Cho một xâu ký tự str bao gồm nhiều từ trong xâu. Hãy đảo ngược từng từ trong xâu?
//
//Input: Dòng đầu tiên đưa vào số lượng bộ test T. Những dòng tiếp theo mỗi dòng đưa vào một bộ test. Mỗi bộ test là một dòng ghi lại nhiều từ trong xâu str.
//
//        Output: Đưa ra kết quả mỗi test theo từng dòng.
//
//Ràng buộc: T, str thỏa mãn ràng buộc: 1≤T≤100; 2≤length(str)≤106.
//
//Ví dụ:
//
//
//Input	Output
//2
//
//
//ABC DEF
//
//
//123 456
//
//
//
//CBA FED
//
//
//321 654

import java.util.*;
import java.io.*;

public class J03032 {
    static BufferedReader br;

    static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            String s = br.readLine().trim();

            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            for(int i = 0; i < a.length; i++){
                sb.append(reverseString(a[i]));
                if(i < a.length - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}