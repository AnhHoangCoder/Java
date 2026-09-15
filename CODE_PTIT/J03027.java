//Cho một xâu S. Mỗi bước, bạn được phép xóa đi 2 kí tự liền nhau mà giống nhau. Chẳng hạn xâu “aabcc” có thể trở thành “bcc” hoặc “aab” sau 1 lần xóa.
//
//Hỏi xâu cuối cùng thu được là gì? Nếu xâu rỗng, in ra “Empty String”.
//
//Input:
//
//Một xâu S chỉ gồm các chữ cái thường, có độ dài không vượt quá 100.
//
//Output:
//
//In ra đáp án tìm được.
//
//Ví dụ:
//
//
//Test 1
//
//Test 2
//
//Input:
//
//
//aaabccddd
//
//
//
//
//
//Output:
//
//
//abd
//
//
//
//
//
//
//Input:
//
//
//abba
//
//
//
//
//
//Output:
//
//
//Empty String

import java.util.*;
import java.io.*;

public class J03027 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            System.out.println(sb.reverse());
        }
    }
}