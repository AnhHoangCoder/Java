//Cho 2 xâu A và B. Bạn hãy tìm xâu C dài nhất sao cho C chỉ là xâu con của A hoặc B, chứ không phải là xâu con của cả A và B.
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T <= 20).
//
//Mỗi test gồm 2 dòng, mô tả xâu A và B, mỗi xâu có độ dài không có 500 kí tự và chỉ gồm các chữ cái thường.
//
//        Output:
//
//Với mỗi test, in ra độ dài của xâu con khác nhau dài nhất tìm được.
//
//Nếu không có đáp án, in ra -1.
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
//2
//
//
//abcd
//
//
//        defgh
//
//
//a
//
//
//        a
//
//
//
//
//
//
//5
//
//
//        -1
//
//
//
//
//
//Giải thích test 1: Xâu khác nhau dài nhất chính là xâu thứ 2, “defgh”.

import java.util.*;
import java.io.*;

public class J03026 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new  InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            String a = br.readLine().trim();
            String b = br.readLine().trim();

            if(a.equals(b)){
                sb.append("-1\n");
            }
            else{
                sb.append(Math.max(a.length(), b.length())).append("\n");
            }
        }
        System.out.print(sb);
    }
}