//Cho dữ liệu vào dạng văn bản. Hãy tìm ra từ thỏa mãn tính chất thuận nghịch có độ dài
//lớn nhất và cho biết từ đó xuất hiện bao nhiêu lần. Nếu có nhiều từ cùng
//có độ dài lớn nhất thì in ra tất cả các từ đó theo thứ tự xuất hiện .
//Dữ liệu vào: Không quá 1000 từ.
//Kết quả:
//
//Ghi ra trên một dòng từ thuận nghịch có độ dài lớn nhất và số lần xuất hiện của
//nó. Nếu có nhiều từ cùng có độ dài lớn nhất thì các từ được liệt kê theo thứ tự xuất
//hiện ban đầu.
//Ví dụ:
//
//Dữ liệu vào
//
//KẾT QUA
//
//AAA BAABA HDHDH ACBSD SRGTDH DDDDS
//DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
//DDDAS HDHDH HDH AAA AAA AAA AAA AAA
//AAA AAA AAA
//DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
//        TDTD
//
//HDHDH 3

import java.util.*;
import java.io.*;

public class J03020 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getNext() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static boolean isPalindrome(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> count = new LinkedHashMap<>();
        int maxLen = 0;

        while(true){
            String str = getNext();
            if(str.isEmpty()) break;
            if (isPalindrome(str)) {
                count.merge(str, 1, Integer::sum);

                maxLen = Math.max(maxLen, str.length());
            }
        }

        if(maxLen == 0){
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> e : count.entrySet()){
            if(e.getKey().length() == maxLen){
                sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
            }
        }
        System.out.print(sb);
    }
}