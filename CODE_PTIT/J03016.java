//Cho số tự nhiên N, hãy kiểm tra xem N có phải là số chia hết cho 11 hay không? Đưa ra 1 nếu N chia hết cho 11, trái lại đưa ra 0.
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test là một số tự nhiên N.
//        T, N thỏa mãn ràng buộc: 1≤ T ≤100; 0≤ N ≤101000.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//Input:
//
//Output:
//
//        2
//        76945
//        363588395960667043875487
//
//
//        1
//        0

import java.io.*;
import java.util.*;

public class J03016 {
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

    static boolean Mod11(String s){
        if(s == null || s.isEmpty()) s = "0";

        int n = s.length();
        int chan = 0, le = 0;
        for(int i = n - 1; i >= 0; i--){
            if(i % 2 == 0){
                chan += (s.charAt(i) - '0');
            }
            else{
                le += (s.charAt(i) - '0');
            }
        }

        return (chan - le) % 11 == 0;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            String s = getToken();
            sb.append(Mod11(s) ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}