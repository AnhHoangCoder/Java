//Cho xâu ký tự s chỉ bao gồm hai chữ cái là ‘A’ và ‘B’.
//
//Mỗi bước được phép biến đổi một vị trí bất kỳ trong xâu (A thành B, B thành A) hoặc cũng có thể biến đổi một dãy liên tiếp các ký tự nào đó tính từ đầu xâu.
//
//Hãy tính xem cần ít nhất bao nhiêu bước để biến đổi xâu về dạng toàn chữ cái A.
//
//        Input
//
//Chỉ có 1 dòng ghi xâu ký tự s, độ dài không quá 1 triệu ký tự.
//
//        Output
//
//Ghi ra kết quả bài toán
//
//Ví dụ
//
//Input
//
//        Output
//
//AAABBBAAABBB
//
//
//4

import java.util.*;
import java.io.*;

public class J03030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        if(s == null || s.length() == 0){
            return;
        }
        s = s.trim();
        final int INF = 1_000_000_000;
        int d0 = 0, d1 = INF;

        for(int i = s.length() - 1; i >= 0; i--){
            int b = (s.charAt(i) == 'B') ? 1 : 0;
            int n0 = INF, n1 = INF;

            if(d0 < INF){
                if(b == 0){
                    n0 = Math.min(n0, d0);
                    n1 = Math.min(n1, d0 + 2);
                }
                else{
                    n0 = Math.min(n0, d0 + 1);
                    n1 = Math.min(n1, d0 + 1);
                }
            }
            if(d1 < INF){
                if(b == 1){
                    n1 = Math.min(n1, d1);
                    n0 = Math.min(n0, d1 + 2);
                }
                else{
                    n1 = Math.min(n1, d1 + 1);
                    n0 = Math.min(n0, d1 + 1);
                }
            }
            d0 = n0;
            d1 = n1;
        }
        System.out.println(Math.min(d0, d1));
    }
}