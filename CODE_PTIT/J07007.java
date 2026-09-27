//Cho file văn bản VANBAN.in.
//
//Một từ được định nghĩa là một dãy ký tự liên tiếp không có khoảng trống, dấu tab hay dấu xuống dòng. Tạm thời chưa xét đến các dấu câu trong bải toán này.
//
//Hãy chuyển tất cả các từ về dạng chữ thường sau đó liệt kê các từ khác nhau xuất hiện trong file VANBAN.in theo thứ tự từ điển.
//
//Input
//
//File VANBAN.in có không quá 200 dòng.
//
//        Output
//
//Ghi ra danh sách các từ khác nhau xuất hiện trong file. Mỗi từ trên một dòng theo thứ tự từ điển.
//
//Ví dụ
//
//
//VANBAN.in
//
//        Output
//
//lap trinh Huong doi tuong
//
//
//lap trinh Huong thanh phan
//
//
//
//        doi
//
//
//huong
//
//
//        lap
//
//
//phan
//
//
//        thanh
//
//
//trinh
//
//
//        tuong

import java.util.*;
import java.io.*;

public class J07007 {
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
            br = new BufferedReader(new InputStreamReader(new FileInputStream("VANBAN.in")));
            StringBuilder sb = new StringBuilder();
            Set<String> set = new TreeSet<>();

            String s;
            while(!(s = getToken()).isEmpty()){
                s = s.toLowerCase();
                set.add(s);
            }
            for(String ss : set){
                sb.append(ss).append("\n");
            }
            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}