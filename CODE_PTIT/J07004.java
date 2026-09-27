//Cho file văn bản DATA.in có không quá 100000 số nguyên dương, giá trị các số nhỏ hơn 1000.
//
//Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.
//
//Input
//
//File DATA.in có không quá 100000 số nguyên dương.
//
//        Output
//
//Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần
//
//Ví dụ
//
//
//DATA.in
//
//        Output
//
//17 20 25 20 15 10 24 17 25 17 22 11 23 18
//
//
//        14 25 12 10 12 17 21 25
//
//
//
//        10 2
//
//
//        11 1
//
//
//        12 2
//
//
//        14 1
//
//
//        15 1
//
//
//        17 4
//
//
//        18 1
//
//
//        20 2
//
//
//        21 1
//
//
//        22 1
//
//
//        23 1
//
//
//        24 1
//
//
//        25 4

import java.util.*;
import java.io.*;

public class J07004 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line =  br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException {
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("DATA.in")));
            Map<Integer, Integer> map = new TreeMap<>();
            StringBuilder sb = new StringBuilder();

            String s;
            while(!(s = getToken()).isEmpty()){
                int num = Integer.parseInt(s);
                map.put(num, map.getOrDefault(num , 0) + 1);
            }
            for(Map.Entry<Integer, Integer> e : map.entrySet()){
                Integer key = e.getKey();
                Integer value = e.getValue();
                sb.append(key).append(" ").append(value).append("\n");
            }
            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}