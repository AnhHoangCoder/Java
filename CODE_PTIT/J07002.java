//Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.
//
//Hãy lọc ra các số nguyên int trong file và tính tổng các số đó.
//
//Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau. Chỉ tính tổng các số thỏa mãn điều kiện là số kiểu int.
//
//Input
//
//File văn bản DATA.in có không quá 1000 dòng.
//
//        Output
//
//Ghi ra giá trị tổng các số tính được.
//
//        Ví dụ
//
//
//DATA.in
//
//        Output
//
//12 3 4 5 6 7
//
//
//Aaa 1 1 Bbb XXX yyy 5 5
//
//
//        999999999999999999999999
//
//
//        9
//
//
//
//        58

import java.util.*;
import java.io.*;

public class J07002 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException{
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static boolean check(String s){
        if(s.length() == 0 || s.length() > 9) return false;
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("DATA.in")));
            long sum = 0;
            String token;
            while(!(token = getToken()).isEmpty()){
                if(check(token)){
                    sum += Integer.parseInt(token);
                }
            }
            System.out.println(sum);
        }
        catch(FileNotFoundException e) {
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}