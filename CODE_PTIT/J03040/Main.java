package J03040;

import java.util.*;
import java.io.*;

public class Main {
    static boolean isStrictlyIncreasing(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) >= s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    static boolean isAllSame(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    static boolean isThreeSameTwoSame(String s){
        return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)
                && s.charAt(3) == s.charAt(4);
    }

    static boolean isLuckyNumber(String s){
        for(char c : s.toCharArray()){
            if(c != '6' && c != '8'){
                return false;
            }
        }
        return true;
    }

    static boolean checkSoDep(String s){
        String b = s.replace(".", "");
        b = b.substring(b.length() - 5);
        return isStrictlyIncreasing(b) || isAllSame(b)
                || isThreeSameTwoSame(b) || isLuckyNumber(b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        String s;
        while(t-- > 0){
            s = br.readLine().trim();
            sb.append(checkSoDep(s) ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
