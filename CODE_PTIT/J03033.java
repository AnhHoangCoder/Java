//Viết chương trình tính bội số chung nhỏ nhất của hai số nguyên dương lớn (có thể đến 500 chữ số)
//
//Input:
//Dòng 1 ghi số bộ test. Mỗi bộ test gồm 2 dòng, mỗi dòng ghi một số.
//
//
//        Output:
//Với mỗi bộ test ghi ra kết quả trên một dòng.
//
//
//Ví dụ:
//
//Input	Output
//3
//        12
//        100
//        1212
//        8888
//        121212121212121212
//        45678978	300
//        26664
//        102534181818181818079284

import java.util.*;
import java.math.BigInteger;
import java.io.*;


public class J03033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            BigInteger a = new BigInteger(br.readLine().trim());
            BigInteger b = new BigInteger(br.readLine().trim());

            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.divide(gcd).multiply(b);

            sb.append(lcm).append("\n");
        }
        System.out.print(sb);
    }
}