//Một xâu ký tự được gọi là đầy đủ nếu nó chứa đầy đủ các ký tự từ ‘a’, ..’z’.
//
//Cho xâu ký tự S và số K. Mỗi bước được phép thay thế ký tự này bằng một ký tự khác. Hãy xác định xem có thể thực hiện nhiều nhất K bước để S trở thành đầy đủ hay không?
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test gồm hai dòng: dòng đầu tiên đưa vào xâu ký tự S; dòng tiếp theo đưa vào số K.
//        T, S, K thỏa mãn ràng buộc: 1≤ T ≤100; 0≤ K ≤62; 1≤ length(S) ≤106.
//Output:
//
//Với mỗi test, ghi ra YES hoặc NO tùy thuộc kết quả kiểm tra.
//Ví dụ:
//
//
//
//Input
//
//Output:
//
//        2
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//4
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//24
//
//
//NO
//
//
//        YES

import java.util.*;
import java.io.*;

public class J03031 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- >0) {
            String s = getToken();
            int k = Integer.parseInt(getToken());
            boolean[] seen = new boolean[26];
            int n = 0;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z' && !seen[c - 'a']){
                    seen[c - 'a'] = true;
                    n++;
                }
            }

            int missing = 26 - n;
            boolean ok = missing <= k && missing <= s.length() - n;
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}