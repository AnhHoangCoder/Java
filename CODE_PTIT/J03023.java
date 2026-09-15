//Bảng chữ số La Mã bao gồm các chữ cái với ý nghĩa I=1; V=5; X=10; L=50; C=100;D=500; M=1000. Một số quy tắc viết các số La Mã như sau:
//
//Tính từ trái sang phải giá trị của các chữ số và nhóm chữ số giảm dần.
//I chỉ có thể đứng trước V hoặc X, X chỉ có thể đứng trước L hoặc C, C chỉ có thể đứng trước D hoặc M.
//Các chữ cái I, X, C, M, không được lặp lại quá ba lần liên tiếp; các chữ cái V, L, D không được lặp lại quá một lần liên tiếp.
//Bài toán đặt ra là cho một xâu ký tự mô tả đúng một số La Mã. Hãy tính giá trị thập phân của số đó
//
//Input: Dòng đầu ghi số bộ test. Mỗi bộ test ghi trên một dòng dãy ký tự số La Mã.
//
//        Output: Với mỗi bộ test ghi ra kết quả tương ứng
//
//Ví dụ:
//
//
//Input	Ouput
//3
//
//
//XIX
//
//
//        DC
//
//
//CD
//
//
//
//19
//
//
//        600
//
//
//        400

import java.util.*;
import java.io.*;

public class J03023 {
    static BufferedReader br;

    static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int total = 0;
        for(int i = 0; i < n; i++){
            int val = map.get(s.charAt(i));

            if(i < n - 1 && val < map.get(s.charAt(i + 1))){
                total -= val;
            }
            else{
                total += val;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            String s =  br.readLine().trim();
            sb.append(romanToInt(s)).append("\n");
        }
        System.out.print(sb);
    }
}