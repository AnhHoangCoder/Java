//Cho hai số a và b trong đó a≤1012, b≤10250. Nhiệm vụ của bạn là tìm ước số chung lớn nhất của hai số a, b.
//
//        Input:
//
//Dòng đầu tiên đưa vào T là số lượng bộ test.
//T dòng tiếp đưa các bộ test. Mỗi bộ test gồm hai dòng: dòng đầu tiên đưa vào số a; dòng tiếp theo đưa vào số b.
//Các số T, a, b thỏa mãn ràng buộc: 1≤T≤100; 1≤a≤1012; 1≤b≤10250;
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
//
//
//Input
//
//        Output
//
//1
//
//
//        1221
//
//
//        1234567891011121314151617181920212223242526272829
//
//
//
//        3

import java.io.*;
import java.util.*;

public class J03011 {
    static BufferedReader br;
    //TC toan hoc
    static long modLong(String b, long a){
        long r = 0;
        for(char c : b.toCharArray()){
            r = (r * 10 + (c - '0')) % a;
        }
        return r;
    }

    static long gcdLong(long a, long b){
        while(b != 0){
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static long GCD(String a, String b){
        long aVal = Long.parseLong(a);
        long r = modLong(b, aVal);
        return gcdLong(r, aVal);
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String a = br.readLine().trim();
            String b = br.readLine().trim();

            sb.append(GCD(a, b)).append("\n");
        }
        System.out.print(sb);
    }
}