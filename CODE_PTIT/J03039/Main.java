package J03039;

import java.util.*;
import java.io.*;

public class Main {
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

    static String strip(String s){
        int i = 0;
        while(i < s.length() - 1 && s.charAt(i) == '0'){
            i++;
        }
        return s.substring(i);
    }

    static int compare(String a, String b){
        if(a.length() != b.length()) return a.length() < b.length() ? -1 : 1;
        return Integer.signum(a.compareTo(b));
    }

    static String subtract(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, borrow = 0;
        while(i >= 0){
            int d = (a.charAt(i) - '0') - borrow - (j >= 0 ? b.charAt(j) - '0' : 0);
            if(d < 0){
                d += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }
            sb.append((char)('0' + d));
            i--;j--;
        }
        return strip(sb.reverse().toString());
    }

    static boolean chiaHet(String a, String b) {
        String r = "0";
        for (char ch : a.toCharArray()) {
            r = strip(r + ch);
            while (compare(r, b) >= 0) r = subtract(r, b);
        }
        return r.equals("0");
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            String a = getToken();
            String b = getToken();

            if(compare(a, b) < 0){
                String tmp = a;
                a = b;
                b = tmp;
            }

            if(a.isEmpty() || b.isEmpty()){
                break;
            }

            sb.append(chiaHet(a, b) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}
