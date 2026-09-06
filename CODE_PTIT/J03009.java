//Cho hai xâu ký tự S1 và S2. Hãy viết chương trình tìm các từ chỉ xuất hiện trong S1 mà không xuất hiện trong S2. Chú ý: mỗi từ chỉ liệt kê 1 lần.
//
//Dữ liệu vào: Dòng 1 ghi số bộ test. Mỗi bộ test gồm 2 dòng, mỗi dòng ghi một xâu ký tự độ dài không quá 200, chỉ bao gồm các ký tự viết thường và các khoảng trống.
//
//Kết quả:         Với mỗi bộ test ghi ra các từ có trong S1 mà không có trong S2. Các từ được ghi theo thứ tự từ điển.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//2
//
//
//abc ab ab ab abcd
//
//
//ab abc
//
//
//aaa xyz ab zzz abc dd dd abc
//
//
//xyz dd ttt sas cdc
//
//
//
//        abcd
//
//
//aaa ab abc zzz

import java.util.*;
import java.io.*;

public class J03009 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String[] a = br.readLine().trim().split("\\s+");
            String[] b = br.readLine().trim().split("\\s+");

            Set<String> s2 = new HashSet<>(Arrays.asList(b));
            Set<String> ans = new TreeSet<>();

            for(String word : a){
                if(!s2.contains(word)){
                    ans.add(word);
                }
            }

            int tmp = 0;
            for(String word : ans){
                sb.append(word);
                tmp++;
                if(tmp < ans.size()){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}